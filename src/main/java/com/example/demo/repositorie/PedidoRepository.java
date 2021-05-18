package com.example.demo.repositorie;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Pedido;

@Repository
public interface PedidoRepository extends  JpaRepository<Pedido, Integer>{
	
}

