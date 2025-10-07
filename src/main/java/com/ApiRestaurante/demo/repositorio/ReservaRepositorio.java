package com.ApiRestaurante.demo.repositorio;


import com.ApiRestaurante.demo.model.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ReservaRepositorio extends JpaRepository<Reserva,Long> {
}
