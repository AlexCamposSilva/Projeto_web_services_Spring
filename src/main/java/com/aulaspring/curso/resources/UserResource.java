package com.aulaspring.curso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspring.curso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	//Criando método para encontrar os usuários
	// Pra indicar que o metodo vai buscar o get do http fazemos essa anotação
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User (1L, "Alex", "alex@gmail.com", "999999", "1234");
		return ResponseEntity.ok().body(u);
	}

}
