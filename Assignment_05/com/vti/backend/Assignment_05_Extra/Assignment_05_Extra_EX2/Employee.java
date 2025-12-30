package com.vti.backend.Assignment_05_Extra.Assignment_05_Extra_EX2;

public abstract class Employee {
    private String name, address;
    protected int basicSalary;

    public Employee(String name, String address, int basicSalary) {
        this.name = name;
        this.address = address;
        this.basicSalary = basicSalary;
    }

    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    public int getBasicSalary(){
        return basicSalary;
    }

    public void setAddress(String add){
        address = add;
    }

    public void setName(String nm){
        name = nm;
    }

    public void setBasicSalary(int sal){
        basicSalary = sal;
    }

    public abstract int getMonthlySalary();
}
