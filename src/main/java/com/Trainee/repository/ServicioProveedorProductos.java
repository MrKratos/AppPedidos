package com.Trainee.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.Trainee.model.proveedores_productos;

public interface ServicioProveedorProductos extends JpaRepository<proveedores_productos, Integer> {


	@Query("SELECT pp FROM proveedores_productos pp WHERE pp.id_proveedor = ?1")
	List<proveedores_productos> findByProveedor(Integer id_proveedor);
}

