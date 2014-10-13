package br.ufc.persis.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Departamento {
	
	private String nome;
	
	@Id
	private float numero;
	
	@OneToMany
	private List<Funcionario> funcionario;
	
	@OneToMany
	private List<Projeto> projetos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getNumero() {
		return numero;
	}

	public void setNumero(float numero) {
		this.numero = numero;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}
	
	
}
