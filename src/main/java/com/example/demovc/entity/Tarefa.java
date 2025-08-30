package com.example.demovc.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@Entity
@Table(name="TAREFA")
@SuppressWarnings("serial")

public class Tarefa extends AbstractEntity<Long> {
	@NotBlank(message="O Nome da tarefa é obrigatório")
	@Size(min=2,max=60,message="O nome deve conter no mínimo {min} caractere")
	@Column(name="nome", nullable=false, unique=true, length=60)
	private String nome;
	
	@NotNull(message="O campo de Data é obrigatório")
	@Column(nullable=false, name="data_entrega", columnDefinition="DATE")
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	private LocalDate dataEntrega;
	
	@NotBlank(message="O Nome do responsável é obrigatório")
	@Column(name="responsavel", nullable=false, length=60)
	private String responsavel;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) { 
		this.nome = nome;
	}
	public LocalDate getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	//getters e setters
	public String getResponsavel() {
	    return responsavel;
	}
	public void setResponsavel(String responsavel) {
	    this.responsavel = responsavel;
	}
	
	//getters e setters
}
