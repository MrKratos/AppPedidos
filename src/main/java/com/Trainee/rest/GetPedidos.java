package com.Trainee.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.model.pedido;
import com.Trainee.repository.ServicioPedidos;
import com.Trainee.services.ServicioPedido;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/pedidos")
public class GetPedidos {
	@Autowired
	private ServicioPedido servicio;
	
	
	@GetMapping
	private ResponseEntity<List<pedido>> listarTodosLosPedidos (){	
			return ResponseEntity.ok(servicio.getAllPedidos());			
	}
	
	@Autowired
	private ServicioPedidos transacctionResporitory;
	@DeleteMapping("/delete/{id}")
	  public void delete(@PathVariable int id) {
	    transacctionResporitory.deleteById(id);
	  }
	
}
