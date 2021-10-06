package com.Trainee.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Trainee.model.productos;
import com.Trainee.repository.ServicioProductos;
import com.Trainee.services.ServicioProducto;



@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(path="/rest/productos")
public class GetProductos {

	@Autowired
	private ServicioProducto servicio;
	@Autowired
	private ServicioProductos transacctionResporitory;
	 productos udproductos=new productos();
	 @PutMapping("/{id}")
     private String actualizar (@RequestBody productos producto,@PathVariable Integer id){	
		 transacctionResporitory.findById(id)
	      .map(udproductos -> {
	    	  udproductos.setPrecio(producto.getPrecio());	
	    	  udproductos.setDescripcion(producto.getDescripcion());	
	        return transacctionResporitory.save(udproductos);
	      });
		 
		 
            return "Producto modificado con exito";
        }
	
	@GetMapping
	private ResponseEntity<List<productos>> listarTodosLosProductos (){	
			return ResponseEntity.ok(servicio.getAllProductos());			
	}
	
	
	
}
