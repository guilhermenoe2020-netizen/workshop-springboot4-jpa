package com.projetoSpring.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoSpring.course.entities.User;
import com.projetoSpring.course.repositories.UserRepository;

@Configuration // Indica que esta classe é uma configuração do Spring
@Profile("test") // Define que este perfil só será ativo em testes
class TestConfig implements CommandLineRunner {

	// Injeta o repositório que acessa os dados dos usuários
	@Autowired 
	private UserRepository userRepository; //obj que acessa os dados

	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		// Salva a lista de usuários no repositório
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
}
