package com.vti.frontend.Assignment_04;

import com.vti.entity.Assignment_01.Student;

public class Assignmen_04_EX4 {
    public static void main(String[] args) {
        Student student1 = new Student("Đức","Hà Nội");
        student1.setPoint(1.1f);
        student1.plusPoint(5.5f);
        student1.printStudent();
    }
}
