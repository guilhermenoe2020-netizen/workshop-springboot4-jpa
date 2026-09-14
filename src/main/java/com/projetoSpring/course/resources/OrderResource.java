package com.projetoSpring.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoSpring.course.entities.Order;
import com.projetoSpring.course.services.OrderService;


@RestController // Anotação que indica que esta classe é um controlador REST
@RequestMapping(value = "/orders")  // Define o caminho base para as requisições deste controlador
public class OrderResource {

	@Autowired
	private OrderService service;
	
    // Método que responde a requisições GET na rota /Orders
    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> list = service.findAll();
        // Retorna o usuário em formato JSON com status 200 OK
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id){
    	Order obj = service.findById(id);
    	return ResponseEntity.ok().body(obj);
    }
    
}
