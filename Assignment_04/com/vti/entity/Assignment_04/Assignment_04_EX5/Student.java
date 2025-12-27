package com.vti.entity.Assignment_04.Assignment_04_EX5;

public abstract class Student extends Person {
    private int id;

    // create constructor
    public Student(String name, int id){
        super(name);
        this.id = id;
    }

    // getter && setter
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
}
