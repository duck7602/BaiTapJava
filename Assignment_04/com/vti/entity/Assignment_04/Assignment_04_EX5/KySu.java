package com.vti.entity.Assignment_04.Assignment_04_EX5;

public class KySu extends CanBo {
    private String branch;

    // create constructor
    public KySu(String name, int age, Gender gender, String address, String branch){
        super(name, age, gender, address);
        this.branch = branch;
    }

    // getter && setter
    public void setBranch(String branch){
        this.branch = branch;
    }

    public String getBranch(){
        return branch;
    }


}
