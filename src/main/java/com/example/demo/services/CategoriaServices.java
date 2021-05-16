package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.CategoriaDomain;
import com.example.demo.repositorie.CategoriaRepository;

@Service
public class CategoriaServices {
	
	@Autowired
	private CategoriaRepository repo;
	
	public CategoriaDomain buscar(Integer id) {
		Optional<CategoriaDomain> obj = repo.findById(id);
		return obj.orElse(null);
	}

}
