package com.example.demo.resources;




import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.CategoriaDomain;


@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@RequestMapping(method = RequestMethod.GET)
	public List<CategoriaDomain> listar() {
		CategoriaDomain cat1 = new CategoriaDomain(1, "informática");
		CategoriaDomain cat2 = new CategoriaDomain(2, "Escritório");
		
		List<CategoriaDomain> listaDeCategorias = new ArrayList<>();
		listaDeCategorias.add(cat1);
		listaDeCategorias.add(cat2);
		
		return listaDeCategorias;
	}
}
