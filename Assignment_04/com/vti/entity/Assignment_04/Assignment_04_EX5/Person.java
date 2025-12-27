package com.vti.entity.Assignment_04.Assignment_04_EX5;

public abstract class Person {
    private String name;

    // create constructor
    public Person(String name){
        this.name = name;
    }

    // getter && setter
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
