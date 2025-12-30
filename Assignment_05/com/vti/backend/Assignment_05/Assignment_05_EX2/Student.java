package com.vti.backend.Assignment_05.Assignment_05_EX2;

/*Question 1: Interface Management
Tạo 1 class Student gồm các property id, name, group(int)
Tạo 1 interface IStudent bao gồm các method : điểmDanh(), họcBài(), đi dọn vệ sinh()
Class Student sẽ implement interface như sau:

Method điểm danh() sẽ in ra nội dung như sau:
        "Nguyễn Văn A điểm danh"
        "Nguyễn Văn B điểm danh"
        "Nguyễn Văn C điểm danh"
        ….
Method học Bài () sẽ in ra nội dung như sau:
        "Nguyễn Văn A đang học bài"
        "Nguyễn Văn B đang học bài "
        "Nguyễn Văn C đang học bài "
        …
Tương tự với các method còn lại*/

public class Student implements IStudent {
    private int id;
    private String name;
    private int group;


    public Student(int id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    @Override
    public void diemDanh() {
        System.out.printf("%s điểm danh",name);
    }

    @Override
    public void hocBai() {
        System.out.printf("%s đang học bài",name);
    }

    @Override
    public void donVeSinh() {
        System.out.printf("%s đi dọn vệ sinh",name);
    }
}
