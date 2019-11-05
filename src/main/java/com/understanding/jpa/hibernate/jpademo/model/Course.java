package com.understanding.jpa.hibernate.jpademo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity     //This defines the class as an entity
public class Course {
    @Id     //This indicates that this is an ID field - Primary Key
    @GeneratedValue     //Automatically generates value for this field
    private Long id;

    private String name;

    //No Arg constructor is used by JPA to create the bean
    //Although the default constructor is there by default, because I have a declared another arg(name) constructor, I must also declare a default constructor
    protected Course() {}

    public Course(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
