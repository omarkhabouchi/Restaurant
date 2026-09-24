package com.spring.restaurant.deo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.restaurant.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
