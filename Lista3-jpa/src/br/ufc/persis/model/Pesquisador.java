package br.ufc.persis.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Pesquisador extends Funcionario {
	
	private String areaAtuacao;
	
	@OneToMany(mappedBy = "pesquisador")
	private List<Projeto> projetos;
	
}
