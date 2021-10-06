package com.Trainee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.model.clientes;
import com.Trainee.services.ServicioCliente;

//comentario1

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/clientes")
public class GetClientes {
	@Autowired
	private ServicioCliente servicio;

	
	@GetMapping
	private ResponseEntity<List<clientes>> listarTodasLasPersona (){	
			return ResponseEntity.ok(servicio.getAllPersonas());			
	}
}
