package br.com.fiap.ws.dao.impl;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Pacote;
import br.com.fiap.ws.dao.PacoteDAO;

public class PacoteDAOImpl extends GenericDAOImpl<Pacote, Integer> implements PacoteDAO
{
	public PacoteDAOImpl(EntityManager em) 
	{
		super(em);
	}
}
