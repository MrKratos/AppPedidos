package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.proveedores_productos;
import com.Trainee.repository.ServicioProveedorProductos;

@Service 
public class ServicioProveedorProducto {
	@Autowired
	private ServicioProveedorProductos transacctionResporitory;
	
		
	public List<proveedores_productos> getAllProveedorProductos (){
		return transacctionResporitory.findAll();
	}
	
	
	
	public String create (proveedores_productos dato) {
	
		transacctionResporitory.save(dato);
		
		return "ok";
	}



	
}
