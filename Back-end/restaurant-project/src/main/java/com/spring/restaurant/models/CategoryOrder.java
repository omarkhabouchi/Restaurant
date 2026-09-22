package com.spring.restaurant.models;


import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Id
//name

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryOrder extends BaseEntity{
    @Column(name ="name")
	private String name ;
}
