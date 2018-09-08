package com.praticaspring.cursomc.dto;

import java.io.Serializable;

import com.praticaspring.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
//object básico utilizado somente para trafegar dados 

	private Integer id;
	private String nome;
	
	public CategoriaDTO() {}

	
	public CategoriaDTO(Categoria obj) {
	//Será o responsável por transformar a Categoria em CategoriaDTO
		//Ele recebe o objeto Categoria e passa para o Categoria DTO
		this.id = obj.getId();
		this.nome = obj.getNome();
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
