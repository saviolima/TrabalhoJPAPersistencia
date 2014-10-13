package br.ufc.persis.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Funcionario {
	
	private String nome;
	private String endereco;
	private String sexo;
	@Column(name="datanascimento", columnDefinition="DATE")
	@Temporal(TemporalType.DATE)
	private String dataAniversario;
	private float salario;
	
	@ManyToOne
	private Departamento departamento;
	
}
