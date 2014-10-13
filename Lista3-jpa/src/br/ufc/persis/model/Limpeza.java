package br.ufc.persis.model;

import javax.persistence.Entity;


@Entity
public class Limpeza extends Funcionario {
	private String cargo;
	private String jornada;
}
