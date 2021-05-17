package com.example.demo.repositorie;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Estado;

@Repository
public interface EstadoRepository extends  JpaRepository<Estado, Integer>{
	
}

