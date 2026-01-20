package com.vti.backend.EX2;

import com.vti.entity.Department;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentDao {

    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/testing_system";
        String user_name = "root";
        String password = "duc123";
        Connection connection = DriverManager.getConnection(url, user_name, password);
        System.out.println("Connection success");
        return connection;
    }

    /*Question 1: read data – get list departments
    Tạo method để lấy ra danh sách tất cả các Department
    Gợi ý:
    Viết method getDepartments() và return ra List<Department>, Nếu có lỗi sẽ
    throw Exception lên frontend để in ra
    Trên front-end sẽ gọi class DepartmentDao và demo method này.*/

    public List<Department> getDepartment(Connection connection) throws SQLException {
        @Deprecated
        Connection connection1 = connection;
        Statement statement = connection1.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT*FROM department");
        List<Department> departments = new ArrayList<>();
        while (resultSet.next()) {
            Department department = new Department(resultSet.getInt(1), resultSet.getString(2));
            departments.add(department);
        }
        connection1.close();
        return departments;
    }

    /*Question 2: read data – get department by id
    Tạo method để lấy ra Department có id = 5
    Gợi ý: Làm tương tự câu trên.
    Nếu không có department nào có id = 5 thì sẽ in ra là "Cannot find department which has id = 5"
    Nếu có lỗi sẽ throw Exception lên front-end để in ra
    Trên front-end sẽ gọi class DepartmentDao và demo method này.*/

    public Department getDepartmentById(Connection connection) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào id của Department cần tìm: ");
        int id = scanner.nextInt();
        @Deprecated
        Connection connection1 = connection;
        String sql = "SELECT * FROM department WHERE department_id = ?";
        PreparedStatement preparedStatement = connection1.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (!resultSet.next()) {
            throw new Exception("Cannot find department which has id = " + id);
        } else {
            Department department = new Department(resultSet.getInt(1), resultSet.getString(2));
            return department;
        }
    }

    /*Question 4: check data exists – check department name exists
    Tạo method để check department name có tồn tại hay không?
    Gợi ý:
    Trên backend sẽ viết method isDepartmentNameExists(String name) và return ra boolean
    Nếu tìm thấy department đã có name = name parameter thì sẽ return true
    Nếu không tìm thấy thì sẽ return ra false
    Nếu có lỗi sẽ throw Exception lên front-end để in ra
    Trên front-end sẽ gọi class DepartmentDao và demo method này*/

    public boolean isDepartmentNameExists(Connection connection, String name) throws SQLException {
        @Deprecated
        Connection connection1 = connection;
        String sql = "SELECT * FROM department WHERE department_name = ?";
        PreparedStatement preparedStatement = connection1.prepareStatement(sql);
        preparedStatement.setString(1, name);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return true;
        } else {
            return false;
        }
    }

    /*Question 5: create data – create department
    Tạo method để người dùng có thể tạo được department
    Gợi ý:
    Trên backend sẽ viết method void createDepartment (String name)
    Check xem đã có department nào có tên như parameter chưa (sử dụng method ở Question 4 để check)
    Nếu tìm đã có department có tên như parameter thì throw ra Exception "Department Name is Exists!"
    Nếu không tìm thấy thì sẽ create department
    Nếu có lỗi sẽ throw Exception lên front-end để in ra
    Trên front-end sẽ gọi class DepartmentDao và demo method này (dùng scanner để nhập thông tin của department muốn create)*/

    public void createDepartment(Connection connection, String name, int id) throws Exception {
        @Deprecated
        Connection connection1 = connection;
        String sql = "INSERT INTO department(department_id, department_name)" +
                " VALUES            ( ?, ?)";
        PreparedStatement preparedStatement = connection1.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, name);
        if (isDepartmentNameExists(connection, name)) {
            throw new Exception("Department Name is Exists!");
        } else {
            int createdRecordAmount = preparedStatement.executeUpdate();
            System.out.println("Created Record Amount: " + createdRecordAmount);
        }
    }

  /*  Question 6: update data – update department
    Tạo method để người dùng có thể update được department name
    Gợi ý:
    Trên backend sẽ viết method void updateDepartmentName (int id, String newName)
    Check xem đã có department nào có id như id parameter chưa (Viết thêm method như
    Question 6 để check, tên method là isDepartmentIdExists(int id))
    - Nếu không tìm thấy department có id = id parameter thì sẽ throw ra Exception có
    message "Cannot find department which has id = " + id
    - Nếu tìm thấy department có id = id parameter thì sẽ check xem tên mới của
    department có bị trùng không (sử dụng method ở Question 6 để check)
    - Nếu tìm đã có department có tên như parameter thì throw ra Exception "Department Name is Exists!"
    - Nếu không tìm thấy thì sẽ update department
    - Nếu có lỗi sẽ throw Exception lên front-end để in ra
    Trên front-end sẽ gọi class DepartmentDao và demo method này(dùng scanner để nhập thông tin của department muốn update)*/

    public boolean isDepartmentIdExists(Connection connection, int id) throws Exception {
        @Deprecated
        Connection connection1 = connection;
        String sql = "SELECT * FROM department WHERE department_id = ?";
        PreparedStatement preparedStatement = connection1.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            return true;
        } else {
            throw new Exception("Cannot find department which has id = " + id);
        }
    }

    public void updateDepartment(Connection connection, int id, String newName) throws Exception {
        @Deprecated
        Connection connection1 = connection;
        String sql = "UPDATE department SET department_name = ? WHERE department_id = ?";
        PreparedStatement preparedStatement = connection1.prepareStatement(sql);
        preparedStatement.setInt(2, id);
        preparedStatement.setString(1, newName);
        if (isDepartmentIdExists(connection1, id)) {
            if (!isDepartmentNameExists(connection1, newName)) {
                int updatedRecordAmount = preparedStatement.executeUpdate();
                System.out.println("Updated Record Amount: " + updatedRecordAmount);
            } else {
                throw new Exception("Department Name is Exists!");
            }
        }
    }

    /*Question 7:
    Tạo method để người dùng có thể xóa được department theo id mà user nhập vào
    Gợi ý:
    Trên backend sẽ viết method void deleteDepartment (int id)
    Check xem đã có department nào có id như id parameter chưa (sử dụng method ở Question 6 để check)
    Nếu không tìm thấy department có id = id parameter thì sẽ throw ra Exception có
    message "Cannot find department which has id = " + id
    Nếu tìm thấy thì sẽ delete department đó
    Nếu có lỗi sẽ throw Exception lên front-end để in ra
    Trên front-end sẽ gọi class DepartmentDao và demo method này (dùng scanner để nhập vào id của department muốn delete)*/

    public void deleteDepartment(Connection connection, int id) throws Exception {
        @Deprecated
        Connection connection1 = connection;
        String sql = "DELETE FROM department WHERE department_id = ?";
        PreparedStatement preparedStatement = connection1.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        if(isDepartmentIdExists(connection1,id)){
            int deletedRecordAmount = preparedStatement.executeUpdate();
            System.out.println("Deleted Record Amount: "+deletedRecordAmount);
        }else {
            throw new Exception("Cannot find department which has id = " + id);
        }
    }


}

