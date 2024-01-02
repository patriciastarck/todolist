package br.com.patriciastarck.todolist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String nome;
	private String descricao;
	private Boolean realizado;
	private Integer prioridade;
	public Todo() {
		
	}
	public Todo(Long id, String nome, String descricao, Boolean realizado, Integer prioridade) {
		
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.realizado = realizado;
		this.prioridade = prioridade;
	}
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Boolean getRealizado() {
		return realizado;
	}
	
	public void setRealizado(Boolean realizado) {
		this.realizado = realizado;
	}
	
	public Integer getPrioridade() {
		return prioridade;
	}
	
	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}	
	
}
