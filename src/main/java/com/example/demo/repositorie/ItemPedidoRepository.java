package com.example.demo.repositorie;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository extends  JpaRepository<ItemPedido, Integer>{
	
}

