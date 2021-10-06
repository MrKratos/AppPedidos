package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.pedido;
import com.Trainee.repository.ServicioPedidos;

@Service 
public class ServicioPedido {

	@Autowired
	private ServicioPedidos transacctionResporitory;
	
	public List<pedido> getAllPedidos(){
		return transacctionResporitory.findAll();
	}
	
	public String delete (pedido dato) {
		
		transacctionResporitory.deleteById(dato.getId_pedido());
		return "Pedido eliminado con exito";
	}
	
}




