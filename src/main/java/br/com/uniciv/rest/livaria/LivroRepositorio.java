package br.com.uniciv.rest.livaria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LivroRepositorio {
	private Map<Long, Livro> livros = new HashMap<>();
	
	public LivroRepositorio() {
		Livro livro1 = new Livro(1L, "Livro A", "ISBN-12345", "Genreno A", 23.99, "Autor 1");
		Livro livro2 = new Livro(2L, "Livro B", "ISBN-45123", "Genreno B", 19.99, "Autor 2");
		livros.put(livro1.getId(), livro1);
		livros.put(livro2.getId(), livro2);
	}

	public List<Livro> getLivros(){
		return new ArrayList<>(livros.values());
	}
	
}

