package com.vti.backend.Assignment_05.Assignment_05_EX2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    // Question 1:

    // a) Tạo 10 học sinh, chia thành 3 nhóm

        Student student1 = new Student(1,"Đức",1);
        Student student2 = new Student(2,"Đạt",1);
        Student student3 = new Student(3,"A",1);
        Student student4 = new Student(4,"b",2);
        Student student5 = new Student(5,"c",2);
        Student student6 = new Student(6,"d",2);
        Student student7 = new Student(7,"e",2);
        Student student8 = new Student(8,"f",3);
        Student student9 = new Student(9,"g",3);
        Student student10 = new Student(10,"h",3);
        ArrayList<Student> danhSachHs = new ArrayList<>( Arrays.asList(
                student1, student2, student3,
                student4, student5, student6, student7,
                student8, student9, student10
        ));

        ArrayList<Student> hsNhom1 = new ArrayList<>();
        ArrayList<Student> hsNhom2 = new ArrayList<>();
        ArrayList<Student> hsNhom3 = new ArrayList<>();

        for(Student student:danhSachHs){
            if(student.getGroup()==1){
                hsNhom1.add(student);
            } else if (student.getGroup()==2) {
                hsNhom2.add(student);
            }else if (student.getGroup()==3){
                hsNhom3.add(student);
            }
        }
        // b) Kêu gọi cả lớp điểm danh.

        for (Student student:danhSachHs){
            System.out.println("\n");
            student.diemDanh();
        }

        // c) Gọi nhóm 1 đi học bài
        for (Student student:hsNhom1){
            System.out.println("\n");
            student.hocBai();
        }

        // d) Gọi nhóm 2 đi dọn vệ sinh
        for (Student student:hsNhom2){
            System.out.println("\n");
            student.donVeSinh();
        }

        // Question 2:
        Person person1 = new Person();
        person1.inputInfor(person1);
        person1.showInfo(person1);
    }
}
