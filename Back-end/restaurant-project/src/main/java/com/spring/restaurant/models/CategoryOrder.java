package com.spring.restaurant.models;


import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Id
//name

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class CategoryOrder extends BaseEntity{
	
    @Column(name ="name")
	private String name ;
    
    @Column(name ="Data_Create")
    @CreationTimestamp
    private Date dataCreate ;
    
    @Column(name ="Data_Update")
    @UpdateTimestamp
    private Date dataUpdate ;
    
}
