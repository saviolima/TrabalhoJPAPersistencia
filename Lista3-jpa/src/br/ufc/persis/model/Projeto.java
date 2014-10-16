package br.ufc.persis.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Projeto {
	
	private String nome;
	
	@Id
	private float numero;
	
	private String periodo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Departamento departamento;
	
	@OneToMany(mappedBy = "projeto")
	private List<Pesquisador> pesquisadores;

	public List<Pesquisador> getPesquisadores() {
		return pesquisadores;
	}

	public void setPesquisadores(List<Pesquisador> pesquisadores) {
		this.pesquisadores = pesquisadores;
	}

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

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
}
