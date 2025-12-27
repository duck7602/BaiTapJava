package com.vti.entity;/*Table 3: com.vti.entity.Account
∙ AccountID: định danh của User (auto increment)
∙ Email:
∙ Username:
∙ FullName:
∙ DepartmentID: phòng ban của user trong hệ thống
∙ PositionID: chức vụ của User
∙ CreateDate: ngày tạo tài khoản*/

import java.util.Date;

public class Account {
    private int accountId;
    private String email;
    String userName;
    private String fullName;
    private Department departmentId;
    private Position positionId;
    private Date createDate;

  /*  com.vti.entity.Question 2:
    Tạo constructor cho com.vti.entity.Account:
    a) Không có parameters
    b) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)
    c) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)
    và com.vti.entity.Position của User, default createDate = now
    d) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)
    và com.vti.entity.Position của User, createDate.
    Khởi tạo 1 Object với mỗi constructor ở trên.*/

    // a)
    public Account() {
    }

    // b)
    public Account(int id, String email, String userName, String firstName, String lastName) {
        this.accountId = id;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName + " " + lastName;
    }

    // c)
    public Account(int id, String email, String userName, String firstName, String lastName, Position positionId) {
        this.accountId = id;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName + " " + lastName;
        this.positionId = positionId;
        this.createDate = new Date();
    }

    // d)
    public Account(int id, String email, String userName, String firstName, String lastName, Position positionId, Date createDate) {
        this.accountId = id;
        this.email = email;
        this.userName = userName;
        this.fullName = firstName + " " + lastName;
        this.positionId = positionId;
        this.createDate = createDate;
    }

    // Getter & Setter
    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFullName() {
        return fullName;
    }

    public Department getDepartment() {
        return departmentId;
    }

    public void setDepartment(Department department) {
        this.departmentId = department;
    }

    public Position getPosition() {
        return positionId;
    }

    public void setPosition(Position position) {
        this.positionId = position;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
