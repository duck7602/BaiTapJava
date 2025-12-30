package com.vti.backend.Assignment_05.Assignment_05_EX2;

import java.util.Scanner;

/*Question 2: Abstract Management
Tạo 1 class Person chứa các property sau: tên, giới tính, ngày sinh, địa chỉ với đầy đủ getter setter,
constructor không tham số, constructor đầy đủ tham số
a) Viết phương thức inputInfo(), nhập thông tin Person từ bàn phím
b) Viết phương thức showInfo(), hiển thị tất cả thông tin Person*/

public class Person {
    private String name;
    private Gender gender;
    private String birthDate;
    private String address;

    public Person(String name, Gender gender, String birthDate, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
        this.address = address;
    }

    public Person(){

    }

    public enum Gender{
        Male, Female
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfor(Person person){
        System.out.println("Nhập thông tin người dùng.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên:");
        person.setName(scanner.nextLine());
        System.out.println("Nhập giới tính:");
        person.setGender(Gender.valueOf(scanner.nextLine()));
        System.out.println("Nhập ngày sinh:");
        person.setBirthDate(scanner.nextLine());
        System.out.println("Nhập địa chỉ:");
        person.setAddress(scanner.nextLine());
    }

    public void showInfo(Person person){
        System.out.println(person);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", birthDate='" + birthDate + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
