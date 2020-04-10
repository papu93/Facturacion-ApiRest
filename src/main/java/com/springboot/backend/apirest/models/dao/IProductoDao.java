package com.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.springboot.backend.apirest.models.entity.Producto;

public interface IProductoDao extends CrudRepository<Producto, Long>{
	// 3 alternativas para buscar todos los productos, de acuerdo a lo ingresado
	
	//1- Forma manual
	@Query("select p from Producto p where p.nombre like %?1%")
	public List<Producto> findByNombre(String term);	
	
	//2- Agregando las palabras claves de Spring Data: modificamos el funcionamiento del metodo  
	// Containing para buscar si contiene el texto en algun lugar. E ignoreCase para no tener en cuenta mayusculas o min.
	public List<Producto> findByNombreContainingIgnoreCase(String term);

	//3- Agregando las palabras claves de Spring Data.
	//Starting With para filtrar aquellos que empiezan con...
	public List<Producto> findByNombreStartingWithIgnoreCase(String term);
}
