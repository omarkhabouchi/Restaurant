package com.spring.restaurant.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "order")
public class Order extends CategoryOrder {
	
	 @Column(name = "price")
    private double price;
	 @Column(name = "image")
    private String img;
	 @Column(name = "description")
    private String description;

}
