package com.Pavel2S.rest;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//@Data creates all the getters, setters, equals, hash, and toString methods, based on the fields
//@Entity makes this object ready for storage in a JPA-based data store
@Data
@Entity
class Employee{
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    public Employee() {}

    Employee(String name, String role){
        this.name = name;
        this.role = role;
    }
}