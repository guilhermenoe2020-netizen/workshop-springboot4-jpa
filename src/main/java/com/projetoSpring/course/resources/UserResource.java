package com.projetoSpring.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoSpring.course.entities.User;
import com.projetoSpring.course.services.UserService;


@RestController // Anotação que indica que esta classe é um controlador REST
@RequestMapping(value = "/users")  // Define o caminho base para as requisições deste controlador
public class UserResource {

	@Autowired
	private UserService service;
	
    // Método que responde a requisições GET na rota /users
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = service.findAll();
        // Retorna o usuário em formato JSON com status 200 OK
        return ResponseEntity.ok().body(list);
    }
    
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
    	User obj = service.findById(id);
    	return ResponseEntity.ok().body(obj);
    }
    
}
