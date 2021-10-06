package com.Trainee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.model.proveedores;
import com.Trainee.model.transaccionfinal;
import com.Trainee.services.ServicioProveedor;



@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/proveedores")
public class GetProveedores {

	@Autowired
	private ServicioProveedor servicio;

	
	@GetMapping
	private ResponseEntity<List<proveedores>> listarTodasLasPersona (){	
			return ResponseEntity.ok(servicio.getAllPersonas());			
	}
@PostMapping
 private String guardar (@RequestBody proveedores dato){	
		
		String temporal = servicio.create(dato);
		try {
			
				return temporal;				
			
		}catch (Exception e) {
			return null;
		}
	}
	
}
