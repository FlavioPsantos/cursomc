package com.example.demo.repositorie;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Cidade;

@Repository
public interface CidadeRepository extends  JpaRepository<Cidade, Integer>{
	
}

