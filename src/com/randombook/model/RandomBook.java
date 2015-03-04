package com.randombook.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "BookList")
public class RandomBook {
    
    @Id @GeneratedValue
    @Column (name = "id")
    private int id;
    
    @Column (name = "name")
    private String name;
    
    @Column (name = "location")
    private String location;

    public RandomBook(){}
    public RandomBook(String name , String location){
        this.name = name;
        this.location = location;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
