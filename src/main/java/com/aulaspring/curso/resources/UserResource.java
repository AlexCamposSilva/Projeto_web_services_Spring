package com.aulaspring.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspring.curso.entities.User;
import com.aulaspring.curso.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	private UserService service; //Ele precisa estar aqui no UserResouce

	
	
	//Criando método para encontrar os usuários
	// Pra indicar que o metodo vai buscar o get do http fazemos essa anotação
	
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
			
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.fidbyId(id);
		return ResponseEntity.ok().body(obj);
	}

}
