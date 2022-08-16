package br.com.uniciv.rest.livaria;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("livro")
public class LivroResource {
	
	private LivroRepositorio livroRep = new LivroRepositorio();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Livro> getLivros(){
		return livroRep.getLivros();
	}

}
