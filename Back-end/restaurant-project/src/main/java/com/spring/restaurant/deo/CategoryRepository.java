package com.spring.restaurant.deo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.restaurant.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
