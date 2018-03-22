package br.com.fiap.ws.repository;

import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import br.com.fiap.entity.Pacote;
import br.com.fiap.ws.dao.PacoteDAO;
import br.com.fiap.ws.dao.impl.PacoteDAOImpl;
import br.com.fiap.ws.singleton.EntityManagerFactorySingleton;

@Path("/pacote")
public class PacoteRepository 
{
	private PacoteDAO dao; 
	/* Criamos como privado, pois será utilizado por todos os métodos, realizando reaproveitamento.
	 * O construtor se carrega de instanciar, quando chamado no main 
	 * */
		
	public PacoteRepository()
	{
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new PacoteDAOImpl(em);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void cadastrar(Pacote pacote, @Context UriInfo uri)
	{
		
	}
}
