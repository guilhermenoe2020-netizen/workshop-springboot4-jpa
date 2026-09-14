package com.projetoSpring.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoSpring.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
