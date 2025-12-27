package com.vti.backend.Assignment_04;

import com.vti.entity.Assignment_01.*;

import java.util.Date;

public class Assignment_04_EX1 {
    public static void main(String[] args) {
        Position devPosition = new Position();
        devPosition.setPositionId(1);
        devPosition.setPositionName(PositionName.Dev);

        /*Question 1:
        Tạo constructor cho department:
        a) Không có parameters
        b) Có 1 parameter là nameDepartment và default id của Department = 0
        Khởi tạo 1 Object với mỗi constructor ở trên*/

        Department department1 = new Department();
        Department department2 = new Department("sale");

        /*Question 2:
        Tạo constructor cho Account:
        a) Không có parameters
        b) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName)
        c) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và Position của User, default createDate = now
        d) Có các parameter là id, Email, Username, FirstName, LastName (với FullName = FirstName + LastName) và Position của User, createDate.
        Khởi tạo 1 Object với mỗi constructor ở trên.*/

        Account account1 = new Account();
        Account account2 = new Account(1,"duc@gmail.com","Duc","Duc","Nguyen");
        Account account3 = new Account(1,"tai@gmail.com","Tai","Nguyen","Tai",devPosition);
        Account account4 = new Account(1,"tai@gmail.com","Tai","Nguyen","Tai",devPosition,new Date("2025/12/18"));

        /*Question 3:
        Tạo constructor cho Group:
        a) Không có parameters
        b) Có các parameter là GroupName, Creator, array Account[] accounts, CreateDate
        c) Có các parameter là GroupName, Creator, array String[] usernames , CreateDate
        Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin username, các thông tin còn lại = null).
        Khởi tạo 1 Object với mỗi constructor ở trên.*/

        Account[] accounts = {account1,account2};
        String[] usernames = {"Duc","Tam","Tai"};
        Group group = new Group();
        Group[] groups = {group};

        Group group1 = new Group("Group1",account4,accounts,new Date("2002/03/02"));
        Group group2 = new Group("Group1",account4,usernames,new Date("2002/03/02"));
    }
}
