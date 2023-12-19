package com.aulaspring.curso.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aulaspring.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
