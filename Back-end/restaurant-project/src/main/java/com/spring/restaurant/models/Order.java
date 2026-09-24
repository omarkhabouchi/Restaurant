package com.spring.restaurant.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "orderfood")
public class Order extends CategoryOrder {
	
	 @Column(name = "price")
    private double price;
	 
	 @Column(name = "image")
    private String img;
	 
	 @Column(name = "description")
	 @Lob
    private String description;
	 
	 @ManyToOne()
	 @JoinColumn(name = "category_id")
	 private Category category ;

}
//ManyToOne