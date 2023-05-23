package com.empresa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="libros")
public class Libros {
	@Id
	@Column(name="idLibro")
	private int	idLibro ;
	private String titulo ;
	private String  precio ;
	private String  cantEjemplares ;
	private String  origen ;
	private String  nomTema ;
}
