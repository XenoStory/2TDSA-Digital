package br.com.fiap.ws.resource;

import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

import br.com.fiap.ws.dao.PartidoDAO;
import br.com.fiap.ws.dao.impl.PartidoDAOImpl;
import br.com.fiap.ws.entity.Partido;
import br.com.fiap.ws.singleton.EntityManagerFactorySingleton;

@Path("/partido")
public class PartidoResource 
{
	private PartidoDAO dao;
	
	public PartidoResource()
	{
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		dao = new PartidoDAOImpl(em);
	}
	
	@GET
	@Path("{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Partido buscar(@PathParam("id") int codigo)
	{
		return dao.buscar(codigo);
	}
}
