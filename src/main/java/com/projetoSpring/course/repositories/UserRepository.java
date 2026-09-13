package com.projetoSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoSpring.course.entities.User;

// instanciando um obj repository
public interface UserRepository extends JpaRepository<User, Long> {

}
