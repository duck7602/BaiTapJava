package com.vti.backend.Assignment_05.Assignment_05_EX2;

import java.util.Scanner;

public class Student2 extends Person {
    private int id;
    private float point;
    private String email;

    public Student2(String name, Gender gender, String birthDate, String address, int id, float point, String email) {
        super(name, gender, birthDate, address);
        this.id = id;
        this.point = point;
        this.email = email;
    }

    public Student2() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPoint() {
        return point;
    }

    public void setPoint(float point) {
        this.point = point;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void checkHocBong(Person person){
        if(person instanceof Student2){
            Student2 student2 = (Student2) person;
            if(student2.getPoint() > 8){
                System.out.println("Xét học bổng.");
            }
        }
    }

    @Override
    public void inputInfor(Person person) {
        if (person instanceof Student2) {
            Student2 student2 = (Student2) person;
            System.out.println("Nhập thông tin người dùng.");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập mã sinh viên:");
            student2.setId(scanner.nextInt());
            System.out.println("Nhập điểm trung bình:");
            student2.setPoint(scanner.nextFloat());
            System.out.println("Nhập email:");
            student2.setEmail(scanner.nextLine());
            System.out.println("Nhập tên:");
            person.setName(scanner.nextLine());
            System.out.println("Nhập giới tính:");
            person.setGender(Gender.valueOf(scanner.nextLine()));
            System.out.println("Nhập ngày sinh:");
            person.setBirthDate(scanner.nextLine());
            System.out.println("Nhập địa chỉ:");
            person.setAddress(scanner.nextLine());
        }
    }

    @Override
    public void showInfo(Person person){
        System.out.println(person);
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", point=" + point +
                ", email=" + email +
                "} " + super.toString();
    }

}
