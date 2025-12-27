package com.vti.entity;

/*Exercise 4 : Encapsulation
Question 1:
Tạo Object Student có các property id, name, hometown, điểm học lực
a) Tất cả các property sẽ để là private để các class khác không chỉnh sửa hay nhìn thấy
b) Tạo constructor cho phép khi khởi tạo mỗi student thì người dùng sẽ nhập vào tên, hometown và có điểm học lực = 0
c) Tạo 1 method cho phép set điểm vào
d) Tạo 1 method cho phép cộng thêm điểm
e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên, điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu,
nếu điểm > 4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0 thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi).
Demo các chức năng trên bằng class ở front-end.*/

public class Student {

    // a)
    private int id;
    private String name;
    private String homeTown;
    private float point;

    // b)
    public Student(String name, String homeTown) {
        this.name = name;
        this.homeTown = homeTown;
        this.point = 0;
    }

    // c)
    public void setPoint(float point) {
        this.point = point;
    }

    // d)
    public void plusPoint(float point1) {
        this.point = this.point + point1;
    }

    // e)
    public void printStudent() {
        System.out.println("Tên: " + name);
        if (point < 4) {
            System.out.println("Yếu");
        } else if (point < 6 && point > 4) {
            System.out.println("Trung bình");
        } else if (point > 6 && point < 8) {
            System.out.println("Khá");
        } else if (point>8) {
            System.out.println("Giỏi");
        }
    }
}
