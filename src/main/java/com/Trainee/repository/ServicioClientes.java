package com.Trainee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Trainee.model.clientes;


public interface ServicioClientes  extends JpaRepository<clientes, Integer> {

}
