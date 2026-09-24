package com.spring.restaurant.models;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Category")
public class Category  extends CategoryOrder {

	@OneToMany(mappedBy = "category")
	private Set<Order> orders ;
}
//OneToMany
