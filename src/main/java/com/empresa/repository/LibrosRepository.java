package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.empresa.entity.Libros;
public interface LibrosRepository extends JpaRepository<Libros, Integer> {

}
