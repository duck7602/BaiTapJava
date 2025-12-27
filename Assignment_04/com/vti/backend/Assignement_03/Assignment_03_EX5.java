package com.vti.backend.Assignement_03;

import com.vti.entity.Assignment_01.*;

import java.util.Arrays;
import java.util.Date;

public class Assignment_03_EX5 {
    public static void main(String[] args) {
        // 1. com.vti.entity.Assignment_01.Department:
        Department saleDepartment = new Department();
        saleDepartment.setDepartmentId(1);
        saleDepartment.setDepartmentName("Sale");

        Department marketingDepartment = new Department();
        marketingDepartment.setDepartmentId(2);
        marketingDepartment.setDepartmentName("Marketing");

        Department mediaDepartment = new Department();
        mediaDepartment.setDepartmentId(3);
        mediaDepartment.setDepartmentName("Media");


        // 2. com.vti.entity.Assignment_01.Position:
        Position devPosition = new Position();
        devPosition.setPositionId(1);
        devPosition.setPositionName(PositionName.Dev);

        Position testPosition = new Position();
        testPosition.setPositionId(2);
        testPosition.setPositionName(PositionName.Test);

        Position pmPosition = new Position();
        pmPosition.setPositionId(3);
        pmPosition.setPositionName(PositionName.PM);


        // 3. com.vti.entity.Assignment_01.Account:
        Account account1 = new Account();
        account1.setAccountId(1);
        account1.setEmail("duc1@gmail.com");
        account1.setUserName("Duc");
        account1.setFullName("Nguyen Ba Minh Duc");
        account1.setDepartmentId(saleDepartment);
        account1.setPositionId(devPosition);
        account1.setCreateDate(new Date("2025/12/18"));

        Account account2 = new Account();
        account2.setAccountId(2);
        account2.setEmail("tam1@gmail.com");
        account2.setUserName("Tam");
        account2.setFullName("Nguyen My Minh Tam");
        account2.setDepartmentId(marketingDepartment);
        account2.setPositionId(testPosition);
        account2.setCreateDate(new Date("2025/12/18"));

        Account account3 = new Account();
        account3.setAccountId(3);
        account3.setEmail("tai1@gmail.com");
        account3.setUserName("Tai");
        account3.setFullName("Nguyen Ba Minh Tai");
        account3.setDepartmentId(mediaDepartment);
        account3.setPositionId(pmPosition);
        account3.setCreateDate(new Date("2025/12/18"));


        // 4. com.vti.entity.Assignment_01.Group:
        Group group1 = new Group();
        group1.setGroupId(1);
        group1.setGroupName("com.vti.entity.Assignment_01.Group 1");
        group1.setCreatorId(account1);
        group1.setCreateDate(new Date("2003/02/03"));

        Group group2 = new Group();
        group2.setGroupId(2);
        group2.setGroupName("com.vti.entity.Assignment_01.Group 2");
        group2.setCreatorId(account2);
        group2.setCreateDate(new Date("2003/05/03"));

        Group group3 = new Group();
        group3.setGroupId(3);
        group3.setGroupName("com.vti.entity.Assignment_01.Group 3");
        group3.setCreatorId(account3);
        group3.setCreateDate(new Date("2005/02/03"));


        // 5. com.vti.entity.Assignment_01.GroupAccount:
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.setGroupId(group1);
        groupAccount1.setAccountId(account1);
        groupAccount1.setJoinDate(new Date("2007/04/02"));

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.setGroupId(group2);
        groupAccount2.setAccountId(account2);
        groupAccount2.setJoinDate(new Date("2003/04/02"));

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.setGroupId(group3);
        groupAccount3.setAccountId(account2);
        groupAccount3.setJoinDate(new Date("2007/04/02"));


        // 6. TypeQuesion:
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.setTypeId(1);
        typeQuestion1.setTypeName(TypeName.Essay);

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.setTypeId(2);
        typeQuestion2.setTypeName(TypeName.Essay);

        TypeQuestion typeQuestion3 = new TypeQuestion();
        typeQuestion3.setTypeId(3);
        typeQuestion3.setTypeName(TypeName.Multiple_Choice);


        // 7. com.vti.entity.Assignment_01.CategoryQuestion:
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.setCategoryId(1);
        categoryQuestion1.setCategoryName("Java");

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.setCategoryId(2);
        categoryQuestion2.setCategoryName("Python");

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.setCategoryId(3);
        categoryQuestion3.setCategoryName("Ruby");


        // 8. com.vti.entity.Assignment_01.Question:
        Question question1 = new Question();
        question1.setQuestionId(1);
        question1.setContent("Content1");
        question1.setCategoryId(categoryQuestion1);
        question1.setTypeId(typeQuestion1);
        question1.setCreatorId(account1);
        question1.setCreateDate(new Date("2020/01/01"));

        Question question2 = new Question();
        question2.setQuestionId(2);
        question2.setContent("Content2");
        question2.setCategoryId(categoryQuestion2);
        question2.setTypeId(typeQuestion2);
        question2.setCreatorId(account2);
        question2.setCreateDate(new Date("2020/01/08"));

        Question question3 = new Question();
        question3.setQuestionId(3);
        question3.setContent("Content3");
        question3.setCategoryId(categoryQuestion3);
        question3.setTypeId(typeQuestion3);
        question3.setCreatorId(account3);
        question3.setCreateDate(new Date("2023/01/01"));


        // 9. com.vti.entity.Assignment_01.Answer:
        Answer answer1 = new Answer();
        answer1.setAnswerId(1);
        answer1.setContent("Content1");
        answer1.setQuestionId(question1);
        answer1.setCorrect(true);

        Answer answer2 = new Answer();
        answer2.setAnswerId(2);
        answer2.setContent("Content2");
        answer2.setQuestionId(question2);
        answer2.setCorrect(true);

        Answer answer3 = new Answer();
        answer3.setAnswerId(3);
        answer3.setContent("Content3");
        answer3.setQuestionId(question3);
        answer3.setCorrect(false);


        // 10. com.vti.entity.Assignment_01.Exam:
        Exam exam1 = new Exam();
        exam1.setExamId(1);
        exam1.setCode(1);
        exam1.setTitle("Title1");
        exam1.setCategoryId(categoryQuestion1);
        exam1.setDuration(60);
        exam1.setCreatorId(account1);
        exam1.setCreateDate(new Date("2003/03/02"));

        Exam exam2 = new Exam();
        exam2.setExamId(2);
        exam2.setCode(2);
        exam2.setTitle("Title2");
        exam2.setCategoryId(categoryQuestion2);
        exam2.setDuration(60);
        exam2.setCreatorId(account2);
        exam2.setCreateDate(new Date("2003/03/02"));

        Exam exam3 = new Exam();
        exam3.setExamId(3);
        exam3.setCode(3);
        exam3.setTitle("Title3");
        exam3.setCategoryId(categoryQuestion3);
        exam3.setDuration(60);
        exam3.setCreatorId(account3);
        exam3.setCreateDate(new Date("2003/03/02"));


        // 11.com.vti.entity.Assignment_01.ExamQuestion:
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.setExamId(exam1);
        examQuestion1.setQuestionId(question1);

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.setExamId(exam2);
        examQuestion2.setQuestionId(question2);

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.setExamId(exam3);
        examQuestion3.setQuestionId(question3);

        System.out.println(saleDepartment);
        // com.vti.entity.Assignment_01.Question 1:
        //    In ra thông tin của phòng ban thứ 1 (sử dụng toString())
        System.out.println(saleDepartment);

       /* com.vti.entity.Assignment_01.Question 2:
        In ra thông tin của tất cả phòng ban (sử dụng toString())*/

        Department[] departments = {mediaDepartment,saleDepartment,marketingDepartment};
        for (int i = 0; i < departments.length; i++) {
            System.out.println(departments[i]);
        }

        /*com.vti.entity.Assignment_01.Question 3:
        In ra địa chỉ của phòng ban thứ 1*/

        System.out.println("Địa chỉ phòng ban thứ 1: "+ saleDepartment.getDepartmentId());

        /*com.vti.entity.Assignment_01.Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?*/

        if(saleDepartment.getDepartmentName().equals("Phòng A")){
            System.out.println("Trùng tên.");
        }else {
            System.out.println("Không trùng tên.");
        }

        /*com.vti.entity.Assignment_01.Question 5:
        So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)*/

        if(saleDepartment.getDepartmentName().equals(marketingDepartment.getDepartmentName())){
            System.out.println("Phòng ban trùng tên.");
        }else {
            System.out.println("Phòng ban không trùng tên.");
        }

        /*com.vti.entity.Assignment_01.Question 6:
        Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
        VD:
        Accounting
        Boss of director
        Marketing
        Sale
        Waiting room*/

        // C1:
        String[] arrDepartment = { "Boss of director","Accounting","Marketing","Sale","Waiting"};
        Arrays.sort(arrDepartment);
        for(String arr:arrDepartment){
            System.out.println(arr);
        }
        System.out.println("-----------------------");
        // C2:
        Arrays.sort(departments,(d1,d2)-> d1.getDepartmentName().compareTo(d2.getDepartmentName()));
        for(Department de : departments){
            System.out.println(de.getDepartmentName());
        }

        /*com.vti.entity.Assignment_01.Question 7:
        Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra dan sách phòng ban được sắp xếp theo tên
        VD:
        Accounting
        Boss of director
        Marketing
        waiting room
        Sale*/


    }
    }

