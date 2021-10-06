package com.Trainee.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(columnDefinition = "serial")
	private int id_cliente;
	private String nombre;
	private String cedula;
	private String telefono;
	
	
	
	public clientes() {
		super();
	}
	
	public int getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(int id_banco) {
		this.id_cliente = id_banco;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setcedula(String cedula) {
		this.cedula = cedula;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
