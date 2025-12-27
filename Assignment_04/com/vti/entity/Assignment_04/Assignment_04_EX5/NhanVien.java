package com.vti.entity.Assignment_04.Assignment_04_EX5;

public class NhanVien extends CanBo {
    private String job;

    // create constuctor
    public NhanVien(String name, int age, Gender gender, String address, String job){
        super(name, age, gender, address);
        this.job = job;
    }

    // getter && setter
    public void setJob(String job){
        this.job = job;
    }

    public String getJob(){
        return job;
    }
}
