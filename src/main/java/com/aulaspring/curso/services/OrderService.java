package com.aulaspring.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaspring.curso.entities.Order;
import com.aulaspring.curso.repositories.OrderRepository;

//Deixalo como componente do spring @Component

@Service
public class OrderService {
//Vamos implementar  duas operações básicas
	//Busca por todos os usuários e busca de usuários por ID
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		
		return repository.findAll();
		
	}
	
	
	public Order fidbyId (Long Id) {
		 Optional<Order> obj = repository.findById(Id);
		 return obj.get();
	}
	
}
