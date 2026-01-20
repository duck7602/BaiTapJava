package com.vti.entity;

public class Department {
    private int department_id;
    private String department_name;

    public Department(int department_id, String department_name) {
        this.department_id = department_id;
        this.department_name = department_name;
    }

    public void setDepartment_id(int department_id){
        this.department_id = department_id;
    }

    public int getDepartment_id(){
        return department_id;
    }

    public void setDepartment_name(String department_name){
        this.department_name = department_name;
    }

    public String getDepartment_name(){
        return department_name;
    }

    @Override
    public String toString(){
        return "Department ID: "+department_id+" Department Name: "+ department_name;
    }
}
