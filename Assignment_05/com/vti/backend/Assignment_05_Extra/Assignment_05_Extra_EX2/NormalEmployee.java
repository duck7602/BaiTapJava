package com.vti.backend.Assignment_05_Extra.Assignment_05_Extra_EX2;

/*a) Tạo class NormalEmployee được extends từ class trên và class NormalEmployee
nằm cùng file với class Employee, class NormalEmployee có access modifier là
public và có 1 method để tính toán lương hàng tháng của 1 nhân viên. Compile
class.*/

public class NormalEmployee extends Employee {
    public NormalEmployee(String name, String address, int basicSalary) {
        super(name, address, basicSalary);
    }

    @Override
    public int getMonthlySalary() {
        return basicSalary/12;
    }
}
