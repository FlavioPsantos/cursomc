package com.example.demo.repositorie;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Pagamento;

@Repository
public interface PagamentoRepository extends  JpaRepository<Pagamento, Integer>{
	
}

