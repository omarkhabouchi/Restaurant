package com.spring.restaurant.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order extends CategoryOrder {
	
	
    private double price;
    private String img;
    private String description;

}
