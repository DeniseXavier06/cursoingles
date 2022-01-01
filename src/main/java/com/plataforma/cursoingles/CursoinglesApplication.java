package com.plataforma.cursoingles;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;
import com.plataforma.cursoingles.domain.Categoria;
import com.plataforma.cursoingles.repositories.CategoriaRepository;

@SpringBootApplication
public class CursoinglesApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursoinglesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	
		Categoria cat1 = new Categoria(null, "Planetas");
		Categoria cat2 = new Categoria(null, "Números");
		
		//como salvar os objetos
		categoriaRepository.saveAll(Arrays.asList(cat1,cat2));
		
	}
	
	

}
