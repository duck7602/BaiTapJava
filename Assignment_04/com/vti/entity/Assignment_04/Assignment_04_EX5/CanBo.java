package com.vti.entity.Assignment_04.Assignment_04_EX5;

public class CanBo {
    private String name;
    private int age;
    private Gender gender;
    private String address;

    // create constructor

    public CanBo(String name, int age, Gender gender, String address) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.gender = gender;
    }

    // getter && setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + age + " Gender: " + gender + " Address: " + address;
    }


}
