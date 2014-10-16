package br.ufc.persis.model;

import java.io.Serializable;

public class PesquisadorProjetoId implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int pesquisador;
	private int projeto;
	
	public int getPesquisador() {
		return pesquisador;
	}
	public void setPesquisador(int pesquisador) {
		this.pesquisador = pesquisador;
	}
	public int getProjeto() {
		return projeto;
	}
	public void setProjeto(int projeto) {
		this.projeto = projeto;
	}
	
	
	@Override
    public int hashCode() {
        return pesquisador + projeto;
    }
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof PesquisadorProjetoId){
			PesquisadorProjetoId pesProjId =  (PesquisadorProjetoId) obj;
			return pesProjId.pesquisador == pesquisador && pesProjId.projeto == projeto;
		}
		
		return false;
	}
	
}
