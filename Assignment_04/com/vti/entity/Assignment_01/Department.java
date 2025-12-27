package com.vti.entity.Assignment_01;/*Table 1:com.vti.entity.Assignment_01.Department
∙ DepartmentID: định danh của phòng ban (auto increment)
∙ DepartmentName: tên đầy đủ của phòng ban (VD: sale, marketing, …)*/

public class Department {
    private int departmentId;
    private String departmentName;

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    /*com.vti.entity.Assignment_01.Question 1:
    Tạo constructor cho department:
    a) Không có parameters
    b) Có 1 parameter là nameDepartment và default id của com.vti.entity.Assignment_01.Department = 0
    Khởi tạo 1 Object với mỗi constructor ở trên*/

    // a)
    public Department() {
    }

    // b)
    public Department(String departmentName) {
        this.departmentId = 0;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Thông tin của phòng ban là:\n" + "ID: " + departmentId + "\n" + "Name: " + departmentName;
    }
}
