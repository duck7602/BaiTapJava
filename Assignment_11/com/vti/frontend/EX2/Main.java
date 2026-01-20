package com.vti.frontend.EX2;

import com.vti.backend.EX2.DepartmentDao;
import com.vti.entity.Department;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        // Question 1:
        DepartmentDao departmentDao = new DepartmentDao();
        Connection connection = departmentDao.getConnection();
//        List<Department> departments =  departmentDao.getDepartment(connection);
//        for (Department department:departments){
//            System.out.println(department);
//        }

        // Question 2,3:
//        System.out.println(departmentDao.getDepartmentById(connection));

        // Question 4:
//        if(departmentDao.isDepartmentNameExists(connection,"R&D")){
//            System.out.println("Có phòng ban.");}
//        else {
//            System.out.println("Không có phòng ban.");
//        }

        // Question 5:
//        departmentDao.createDepartment(connection,"New Department",69);

        // Question 6:
//        if(departmentDao.isDepartmentIdExists(connection,69))
//            System.out.println("Tồn tại ID.");
//        System.out.println("Nhập vào ID của department:");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Nhâp vào tên mới của department:");
//        String name = scanner.nextLine();
//        departmentDao.updateDepartment(connection,id, name);

        // Question 7:
        System.out.println("Nhập ID của department cần xóa: ");
        int id = scanner.nextInt();
        departmentDao.deleteDepartment(connection, id);

    }
}
