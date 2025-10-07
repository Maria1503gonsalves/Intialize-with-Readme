package com.ApiRestaurante.demo.controller;


import com.ApiRestaurante.demo.model.Reserva;
import com.ApiRestaurante.demo.repositorio.ReservaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {
    @Autowired
    private ReservaRepositorio reservaRepositorio;
    @GetMapping
    public List<Reserva>listarTodas(){
        return reservaRepositorio.findAll();
    }
    @PostMapping
    public Reserva criarReserva(@RequestBody Reserva reserva){
        return reservaRepositorio.save(reserva);
    }
    @GetMapping("/{id}")
    public Reserva buscarPortId(@PathVariable Long id){
        return reservaRepositorio.findById(id).orElse(null);
    }


    @DeleteMapping("/{id}")
    public void deletar (@PathVariable  Long id){
        reservaRepositorio.deleteById(id);
    }
}
