package com.Trainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trainee.model.productos;

public interface ServicioProductos extends JpaRepository<productos, Integer> {

}
