package com.Trainee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Trainee.model.productos;

import com.Trainee.repository.ServicioProductos;

@Service 
public class ServicioProducto {


	@Autowired
	private ServicioProductos transacctionResporitory;
	
		
	public List<productos> getAllProductos(){
		return transacctionResporitory.findAll();
	}
	
	public productos modificarProducto(productos producto){
//		
		
		return null;
		}

}
