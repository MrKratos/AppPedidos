package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.clientes;
import com.Trainee.model.transaccionfinal;
import com.Trainee.repository.ServicioClientes;

@Service
public class ServicioCliente {

	@Autowired
	private ServicioClientes transacctionResporitory;
	
		
	public List<clientes> getAllPersonas(){
		return transacctionResporitory.findAll();
	}
	
}
