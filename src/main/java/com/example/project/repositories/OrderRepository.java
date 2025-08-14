package com.example.project.repositories;

import com.example.project.entities.Order;
import com.example.project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
