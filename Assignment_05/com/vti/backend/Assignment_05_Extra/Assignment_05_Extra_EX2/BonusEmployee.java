package com.vti.backend.Assignment_05_Extra.Assignment_05_Extra_EX2;

/*b) Tạo class BonusEmployee được extends từ class trên và class BonusEmployee
nằm cùng file với class Employee. Class này mô tả 1 nhân viên có 1 khoảng tiền
bonus hàng tháng được thêm vào lương hàng tháng của họ.
Class BonusEmployee có access modifier là public và xóa keyword public ở class NormalEmployee. (Java chỉ cho 1 class trong file có access modifier là public.)
Đổi tên file thành BonusEmployee.java.*/

public class BonusEmployee extends Employee {

    private int bonus;

    public BonusEmployee(String name, String address, int basicSalary) {
        super(name, address, basicSalary);
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public int getMonthlySalary() {
        return (basicSalary / 12) + bonus;
    }
}

