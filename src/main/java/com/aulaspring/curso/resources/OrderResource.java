package com.aulaspring.curso.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaspring.curso.entities.Order;
import com.aulaspring.curso.services.OrderService;

@RestController
@RequestMapping(value = "/Orders")
public class OrderResource {
	
	@Autowired
	private OrderService service; //Ele precisa estar aqui no OrderResouce

	
	
	//Criando método para encontrar os usuários
	// Pra indicar que o metodo vai buscar o get do http fazemos essa anotação
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		
			
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.fidbyId(id);
		return ResponseEntity.ok().body(obj);
	}

}
