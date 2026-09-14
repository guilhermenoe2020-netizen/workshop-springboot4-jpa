package com.projetoSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoSpring.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
