package com.plataforma.cursoingles.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.plataforma.cursoingles.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Negócio");
		Categoria cat2 = new Categoria(1, "Casa");
		
		List<Categoria> Lista = new ArrayList<>();
		Lista.add(cat1);
		Lista.add(cat2);
		
		return Lista;
	}
	
}
