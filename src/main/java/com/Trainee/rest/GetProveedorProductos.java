package com.Trainee.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.model.proveedores_productos;
import com.Trainee.services.ServicioProveedorProducto;
import com.Trainee.repository.ServicioProveedorProductos;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/proveedor_producto")
public class GetProveedorProductos {

	@Autowired
	private ServicioProveedorProducto servicio;
	@Autowired
	private ServicioProveedorProductos repository;
	
	@GetMapping
	private ResponseEntity<List<proveedores_productos>> listarTodoslosProveedoresyProductos(){	
			return ResponseEntity.ok(servicio.getAllProveedorProductos());			
	}
	
	@PostMapping
	private String guardar (@RequestBody proveedores_productos dato){	
		
		String temporal = servicio.create(dato);
		try {
			
				return temporal;				
			
		}catch (Exception e) {
			return null;
		}
	}
	
	@GetMapping
	@RequestMapping(path="/{id}")
	private ResponseEntity<List<proveedores_productos>> listar_proveedores_productos (@PathVariable Integer id){	
	
	return ResponseEntity.ok(repository.findByProveedor(id));
		} 
	
}
