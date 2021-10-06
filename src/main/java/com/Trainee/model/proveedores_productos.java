package com.Trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class proveedores_productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_proveedor_producto;	
	private int id_proveedor;
	private int id_producto;
	

	public int getId_proveedor_producto() {
		return id_proveedor_producto;
	}
	public void setId_proveedor_producto(int id_proveedor_producto) {
		this.id_proveedor_producto = id_proveedor_producto;
	}

	public int getId_proveedor() {
		return id_proveedor;
	}
	public void setId_proveedor(int id_proveedor) {
		this.id_proveedor = id_proveedor;
	}
	
	public int getId_producto() {
		return id_producto;
	}
	public void setId_producto(int id_producto) {
		this.id_producto = id_producto;
	}
	
	public proveedores_productos() {
		super();
	}

}
