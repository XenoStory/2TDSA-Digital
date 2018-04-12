package br.com.fiap.jsf.bean;

import javax.annotation.PostConstruct;

public class CandidatoBean {
	private CandidatoTO candidato;

	// Criar um m�todo de inicializa��o
	@PostConstruct
	private void init()
	{
		candidato = new CandidatoTO();
	}
	
	public CandidatoTO getCandidato() 
	{
		return candidato;
	}

	public void setCandidato(CandidatoTO candidato) 
	{
		this.candidato = candidato;
	}
	
	
}
