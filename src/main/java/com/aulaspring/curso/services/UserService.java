package com.aulaspring.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaspring.curso.entities.User;
import com.aulaspring.curso.repositories.UserRepository;

//Deixalo como componente do spring @Component

@Service
public class UserService {
//Vamos implementar  duas operações básicas
	//Busca por todos os usuários e busca de usuários por ID
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		
		return repository.findAll();
		
	}
	
	
	public User fidbyId (Long Id) {
		 Optional<User> obj = repository.findById(Id);
		 return obj.get();
	}
	
}
