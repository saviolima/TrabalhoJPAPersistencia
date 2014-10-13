package br.ufc.persis.model;

import javax.persistence.OneToOne;

public class FuncionarioLimpeza extends Limpeza {
	
	@OneToOne
	private Limpeza limpeza;
}
