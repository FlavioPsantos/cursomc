package com.example.demo.repositorie;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.CategoriaDomain;

@Repository
public interface CategoriaRepository extends  JpaRepository<CategoriaDomain, Integer>{
	
}

