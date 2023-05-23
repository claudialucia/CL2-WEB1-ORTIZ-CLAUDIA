package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.empresa.entity.Libros;
public interface LibrosRepository extends JpaRepository<Libros, Integer> {

	
	@Query("select e from Libros e where e.idLibro = ?1" )
	public List<Libros>listaPorID(int idLibro);
}
