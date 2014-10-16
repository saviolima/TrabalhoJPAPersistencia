package br.ufc.persis.model;

import javax.persistence.*;

@Entity
@IdClass(PesquisadorProjetoId.class)
public class PesquisadorProjeto {
	@Id
	@ManyToOne
	@JoinColumn(name="pesquisador_id")
	private Pesquisador pesquisador;
	
	@Id
	@ManyToOne
	@JoinColumn(name="projeto_id")
	private Projeto projeto;
	
	private int numHorasTrabalhadas;

	public Pesquisador getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public int getNumHorasTrabalhadas() {
		return numHorasTrabalhadas;
	}

	public void setNumHorasTrabalhadas(int numHorasTrabalhadas) {
		this.numHorasTrabalhadas = numHorasTrabalhadas;
	}
	
	
	
}
