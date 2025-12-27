package com.vti.backend;

import com.vti.entity.Assignment_01.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Program {
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

        System.out.println("com.vti.entity.Assignment_01.Exam com.vti.entity.Assignment_01.Question 3: " + examQuestion3 + "\n");

        //EX 1:

        // Q1:
        check_dp_account2(account2);
        // Q2:
        GroupAccount[] groupAccounts = {groupAccount1, groupAccount2, groupAccount3};
        check_group_account(account2, groupAccounts);
        // Q3:
        check_dp_account2_c2(account2);
        // Q4:
        check_position_account(account1);
        // Q5:
        check_account_group(group1, groupAccounts);
        // Q6:
        check_group_account_c2(account2, groupAccounts);
        // Q7:
        check_position_account_c2(account1);
        // Q8:
        Account[] accounts = {account1, account2, account3};
        get_infor_account(accounts);
        // Q9:
        Department[] departments = {mediaDepartment, marketingDepartment, saleDepartment};
        get_infor_department(departments);
        // Q10:
        get_infor_account_c2(accounts);
        // Q11:
        get_infor_department_c2(departments);
        // Q12:
        get_infor_department_c3(departments);
        // Q13:
        get_infor_account_c3(accounts);
        // Q14:
        get_infor_account_c4(accounts);
        // Q15:
        get_number();
        // Q16:
        get_infor_account_while(accounts);
        get_infor_account_c3_while(accounts);
        get_infor_account_c4_while(accounts);
        // Q17
        get_infor_account_do_while(accounts);
        get_infor_account_c3_do_while(accounts);
        get_infor_account_c4_do_while(accounts);

        // EX 2:

        /*com.vti.entity.Assignment_01.Question 1:
        Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
        nguyên đó*/

        int x = 5;
        System.out.printf("Số nguyên: %d %n", x);

        /*com.vti.entity.Assignment_01.Question 2:
        Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
        ra số nguyên đó thành định dạng như sau: 100,000,000*/

        x = 100000000;
        System.out.printf("Số nguyên: %,d %n", x);

        /*com.vti.entity.Assignment_01.Question 3:
        Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
        thực đó chỉ bao gồm 4 số đằng sau*/

        float y = 5.567098f;
        System.out.printf("Số nguyên: %.4f %n", y);

      /*  com.vti.entity.Assignment_01.Question 4:
        Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
        dạng như sau:
        Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
        Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.*/

        String ten = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\"  và tôi đang độc thân. %n", ten);

       /* com.vti.entity.Assignment_01.Question 5:
        Lấy thời gian bây giờ và in ra theo định dạng sau:
        24/04/2020 11h:16p:20s*/

        Date now = new Date();
        String pattern = "dd-MM-yyyy HH:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println(date);

        // com.vti.entity.Assignment_01.Question 6:
        get_infor_account_ex2(accounts);

        // EX 3:

        get_infor_exam(exam1);
        get_infor_exam_c2(exam1);
        get_infor_exam_c3(exam1);
        get_infor_exam_c4(exam1);
        get_infor_exam_c5(exam1);


        // EX 4:
       /* com.vti.entity.Assignment_01.Question 1:
        In ngẫu nhiên ra 1 số nguyên*/

        Random random = new Random();
        int number = random.nextInt();
        System.out.println("Random integer: " + number);

        /*com.vti.entity.Assignment_01.Question 2:
        In ngẫu nhiên ra 1 số thực*/

        float number1 = random.nextFloat();
        System.out.println("Random float: " + number1);

        /*com.vti.entity.Assignment_01.Question 3:
        Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn*/

        String[] students = {"Đức", "Tâm", "Tài", "Dũng"};

        int index = random.nextInt(students.length);
        System.out.println("Random student: " + students[index]);


        /*com.vti.entity.Assignment_01.Question 4:
        Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24 - 07 - 1995 tới ngày 20 - 12 - 1995*/

        int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();

        int randomDayInt = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomDay = LocalDate.ofEpochDay(randomDayInt);

        System.out.println("Random date: " + randomDay);

        /*com.vti.entity.Assignment_01.Question 5:
        Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây*/

        LocalDate now1 = LocalDate.now();
        int maxDay1 = (int) now.getDay();
        int minDay1 = maxDay - 365;

        int randomDayInt1 = minDay1 + random.nextInt(maxDay - minDay1);
        LocalDate randomDay1 = LocalDate.ofEpochDay(randomDayInt);

        System.out.println("Random date (last year): " + randomDay1);

        /*com.vti.entity.Assignment_01.Question 6:
        Lấy ngẫu nhiên 1 ngày trong quá khứ.*/

        int maxDay2 = (int) LocalDate.now().toEpochDay();

        int randomDayInt2 = random.nextInt(maxDay2);
        LocalDate randomDay2 = LocalDate.ofEpochDay(randomDayInt2);
        System.out.println("Random past date: " + randomDay2);

        /*com.vti.entity.Assignment_01.Question 7:
        Lấy ngẫu nhiên 1 số có 3 chữ số.*/

        int number4 = random.nextInt(900) + 100;
        System.out.println("Random number: " + number4);


    //EX5:

    /*com.vti.entity.Assignment_01.Question 1
    Cho phép người dùng nhập 3 số nguyên*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ 1: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ 2: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ 3: ");
        int c = scanner.nextInt();
        System.out.println("Ba số vừa nhập: "+a +", "+b +", "+c);

    /*com.vti.entity.Assignment_01.Question 2
    Cho phép người dùng nhập 2 số thực*/
        System.out.print("Nhập số thực thứ 1: ");
        float x1 = scanner.nextFloat();
        System.out.print("Nhập số thực thứ 2: ");
        float y1 = scanner.nextFloat();
        System.out.println("Hai số thực vừa nhập: " + x1 + " và " + y1);

    /*com.vti.entity.Assignment_01.Question 3
    Cho phép người dùng nhập họ và tên*/
        scanner.nextLine();
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();
        System.out.println("Họ và tên: " + fullName);

   /* com.vti.entity.Assignment_01.Question 4
    Cho phép người dùng nhập ngày sinh nhật*/
        System.out.print("Nhập ngày sinh: ");
        String birthday = scanner.nextLine();
        System.out.println("Ngày sinh của bạn là: " + birthday);


    // EX6:
        in_so_chan();
        get_account(account1);
        in_so_nguyen_duong();
    }








// Exercise 1: Flow Control - Tiếp tục bài tập Day 01



    /*com.vti.entity.Assignment_01.Question 1:
   Kiểm tra account thứ 2
   Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
   Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"*/

    public static void check_dp_account2(Account account2) {
        if (account2.getDepartmentId() == null) {
            System.out.println("Nhân viên này chưa có phòng ban %n");
        } else {
            System.out.printf("Phòng ban của nhân viên là: %s %n", account2.getDepartmentId().getDepartmentName());
        }
    }
    /*
    com.vti.entity.Assignment_01.Question 2:
    Kiểm tra account thứ 2
    Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
    Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "com.vti.entity.Assignment_01.Group của nhân viên này là Java Fresher, C# Fresher"
    Nếu có mặt trong 3 com.vti.entity.Assignment_01.Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
    Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"*/

    public static void check_group_account(Account account, GroupAccount[] groupAccounts) {
        int countgroup = 0;
        for (GroupAccount ga : groupAccounts) {
            if (account == ga.getAccountId()) {
                countgroup++;
            }
        }
        if (countgroup == 1 || countgroup == 2) {
            System.out.println("com.vti.entity.Assignment_01.Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (countgroup == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else if (countgroup >= 4) {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

    }

    /* com.vti.entity.Assignment_01.Question 3:
    Sử dụng toán tử ternary để làm com.vti.entity.Assignment_01.Question 1*/
    public static void check_dp_account2_c2(Account account2) {
        System.out.printf(account2.getDepartmentId() == null ? "Nhân viên này chưa có phòng ban %n" : "Phòng ban của nhân viên là: %s %n", account2.getDepartmentId().getDepartmentName());
    }

    /*com.vti.entity.Assignment_01.Question 4:
    Sử dụng toán tử ternary để làm yêu cầu sau:
    Kiểm tra com.vti.entity.Assignment_01.Position của account thứ 1
    Nếu com.vti.entity.Assignment_01.Position = Dev thì in ra text "Đây là Developer"
    Nếu không phải thì in ra text "Người này không phải là Developer"*/

    public static void check_position_account(Account account) {
        System.out.println(account.getPositionId().getPositionName() == PositionName.Dev ? "Đây là Developer" : "Người này không phải là Developer");
    }

    /*com.vti.entity.Assignment_01.Question 5:
    Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
    Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
    Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
    Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
    Còn lại in ra "Nhóm có nhiều thành viên"*/
    public static void check_account_group(Group group, GroupAccount[] groupAccounts) {
        int countaccount = 0;
        for (GroupAccount ga : groupAccounts) {
            if (group == ga.getGroupId()) {
                countaccount++;
            }
        }
        switch (countaccount) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
        }
    }

    /*com.vti.entity.Assignment_01.Question 6:
    Sử dụng switch case để làm lại com.vti.entity.Assignment_01.Question 2*/

    public static void check_group_account_c2(Account account, GroupAccount[] groupAccounts) {
        int countgroup = 0;
        for (GroupAccount ga : groupAccounts) {
            if (account == ga.getAccountId()) {
                countgroup++;
            }
        }
        switch (countgroup) {
            case 1:
                System.out.println("com.vti.entity.Assignment_01.Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 2:
                System.out.println("com.vti.entity.Assignment_01.Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            case 4:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }
    }

    /*com.vti.entity.Assignment_01.Question 7:
    Sử dụng switch case để làm lại com.vti.entity.Assignment_01.Question 4*/

    public static void check_position_account_c2(Account account) {
        switch (account.getPositionId().getPositionName()) {
            case Dev:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");


        }
    }

    /*com.vti.entity.Assignment_01.Question 8:
    In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ*/

    public static void get_infor_account(Account[] accounts) {
        for (Account account : accounts) {
            System.out.printf("Email: %s, FullName: %s, Phòng Ban: %s %n", account.getEmail(), account.getFullName(), account.getPositionId().getPositionName());
        }
    }

    /*com.vti.entity.Assignment_01.Question 9:
    In ra thông tin các phòng ban bao gồm: id và name*/

    public static void get_infor_department(Department[] departments) {
        for (Department department : departments) {
            System.out.printf("Id: %s, Name: %s %n", department.getDepartmentId(), department.getDepartmentName());
        }

    }

/*    com.vti.entity.Assignment_01.Question 10:
    In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của
    họ theo định dạng như sau:
    Thông tin account thứ 1 là:
    Email: NguyenVanA@gmail.com
    Full name: Nguyễn Văn A
    Phòng ban: Sale
    Thông tin account thứ 2 là:
    Email: NguyenVanB@gmail.com
    Full name: Nguyễn Văn B
    Phòng ban: Marketting*/

    public static void get_infor_account_c2(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].getEmail(), accounts[i].getFullName(), accounts[i].getPositionId().getPositionName());
        }
    }

    /*com.vti.entity.Assignment_01.Question 11:
    In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
    Thông tin department thứ 1 là:
    Id: 1
    Name: Sale
    Thông tin department thứ 2 là:
    Id: 2
    Name: Marketing*/

    public static void get_infor_department_c2(Department[] departments) {
        for (int i = 0; i < departments.length; i++) {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].getDepartmentId(), departments[i].getDepartmentName());
        }

    }

    /*com.vti.entity.Assignment_01.Question 12:
    Chỉ in ra thông tin 2 department đầu tiên theo định dạng như com.vti.entity.Assignment_01.Question 10*/

    public static void get_infor_department_c3(Department[] departments) {
        for (int i = 0; i < 2; i++) {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].getDepartmentId(), departments[i].getDepartmentName());
        }

    }

  /*  com.vti.entity.Assignment_01.Question 13:
    In ra thông tin tất cả các account ngoại trừ account thứ 2*/

    public static void get_infor_account_c3(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (i == 1) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].getEmail(), accounts[i].getFullName(), accounts[i].getPositionId().getPositionName());
        }
    }

    /*com.vti.entity.Assignment_01.Question 14:
    In ra thông tin tất cả các account có id < 4*/

    public static void get_infor_account_c4(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getAccountId() > 4) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].getEmail(), accounts[i].getFullName(), accounts[i].getPositionId().getPositionName());
        }
    }

    /*com.vti.entity.Assignment_01.Question 15:
    In ra các số chẵn nhỏ hơn hoặc bằng 20*/
    public static void get_number() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + ",");
        }
    }

 /*   com.vti.entity.Assignment_01.Question 16:
    Làm lại các com.vti.entity.Assignment_01.Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
    lệnh break, continue*/

    public static void get_infor_account_while(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].getEmail(), accounts[i].getFullName(), accounts[i].getPositionId().getPositionName());
            i++;
        }
    }

    public static void get_infor_department_while(Department[] departments) {
        int i = 0;
        while (i < departments.length) {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].getDepartmentId(), departments[i].getDepartmentName());
            i++;
        }
    }

    public static void get_infor_department_c3_while(Department[] departments) {
        int i = 0;
        while (i < 2) {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].getDepartmentId(), departments[i].getDepartmentName());
            i++;
        }
    }

    public static void get_infor_account_c3_while(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            if (i == 1) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].getEmail(), accounts[i].getFullName(), accounts[i].getPositionId().getPositionName());
            i++;
        }
    }

    public static void get_infor_account_c4_while(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            if (accounts[i].getAccountId() > 4) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].getEmail(), accounts[i].getFullName(), accounts[i].getPositionId().getPositionName());
            i++;
        }
    }

/*    com.vti.entity.Assignment_01.Question 17:
    Làm lại các com.vti.entity.Assignment_01.Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
    lệnh break, continue*/

    public static void get_infor_account_do_while(Account[] accounts) {
        int i = 0;
        do {
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].getEmail(), accounts[i].getFullName(), accounts[i].getPositionId().getPositionName());
            i++;
        } while (i < accounts.length);
    }

    public static void get_infor_department_do_while(Department[] departments) {
        int i = 0;
        do {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].getDepartmentId(), departments[i].getDepartmentName());
            i++;
        } while (i < departments.length);
    }

    public static void get_infor_department_c3_do_while(Department[] departments) {
        int i = 0;
        do {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].getDepartmentId(), departments[i].getDepartmentName());
            i++;
        } while (i < 2);
    }

    public static void get_infor_account_c3_do_while(Account[] accounts) {
        int i = 0;
        do {
            if (i == 1) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].getEmail(), accounts[i].getFullName(), accounts[i].getPositionId().getPositionName());
            i++;
        } while (i < accounts.length);
    }

    public static void get_infor_account_c4_do_while(Account[] accounts) {
        int i = 0;
        do {
            if (accounts[i].getAccountId() > 4) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].getEmail(), accounts[i].getFullName(), accounts[i].getPositionId().getPositionName());
            i++;
        } while (i < accounts.length);
    }


//    Exercise2:


//    com.vti.entity.Assignment_01.Question 6:
//    In ra thông tin account (như com.vti.entity.Assignment_01.Question 8 phần FOREACH) theo định dạng
//    table (giống trong Database)

    public static void get_infor_account_ex2(Account[] accounts) {
        System.out.println("+----+-------------------+----------+----------------------+------------+----------+");

        for (Account acc : accounts) {
            System.out.printf(
                    "| %-2d | %-17s | %-8s | %-20s | %-10s | %-8s |\n",
                    acc.getAccountId(),
                    acc.getEmail(),
                    acc.getUserName(),
                    acc.getFullName(),
                    acc.getDepartmentId().getDepartmentName(),
                    acc.getPositionId().getPositionName()
            );
        }

        System.out.println("+----+-------------------+----------+----------------------+------------+----------+");

    }


    //Exercise 3:




    /*com.vti.entity.Assignment_01.Question 1:
    In ra thông tin com.vti.entity.Assignment_01.Exam thứ 1 và property create date sẽ được format theo định
    dạng vietnamese*/

    public static void get_infor_exam(Exam exam) {

        Date now = exam.getCreateDate();
        String pattern = "dd-MM-yyyy HH:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println("===== EXAM INFO =====");
        System.out.println("com.vti.entity.Assignment_01.Exam ID: " + exam.getExamId());
        System.out.println("Code: " + exam.getCode());
        System.out.println("Title: " + exam.getTitle());
        System.out.println("Category: " + exam.getCategoryId().getCategoryName());
        System.out.println("Duration: " + exam.getDuration() + " minutes");
        System.out.println("Creator: " + exam.getCreatorId().getFullName());
        System.out.println("Create Date: " + date);
    }

/*    com.vti.entity.Assignment_01.Question 2

    In ra com.vti.entity.Assignment_01.Exam đã tạo ngày nào theo định dạng:
    Năm – tháng – ngày – giờ – phút – giây*/

    public static void get_infor_exam_c2(Exam exam) {

        Date now = exam.getCreateDate();
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println("Create Date: " + date);
    }

    /*  com.vti.entity.Assignment_01.Question 3

      Chỉ in ra năm của create date*/
    public static void get_infor_exam_c3(Exam exam) {

        Date now = exam.getCreateDate();
        String pattern = "yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println("Create Date: " + date);
    }
    /*com.vti.entity.Assignment_01.Question 4

    Chỉ in ra tháng và năm của create date*/

    public static void get_infor_exam_c4(Exam exam) {

        Date now = exam.getCreateDate();
        String pattern = "MM-yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println("Create Date: " + date);
    }

    /*com.vti.entity.Assignment_01.Question 5

    Chỉ in ra "MM-DD" của create date*/
    public static void get_infor_exam_c5(Exam exam) {

        Date now = exam.getCreateDate();
        String pattern = "MM-dd";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println("Create Date: " + date);
    }


    // Exercise 6:

    /*com.vti.entity.Assignment_01.Question 1
    Tạo method in ra các số chẵn nguyên dương nhỏ hơn 10*/

    public static void in_so_chan(){
        for (int i = 0; i<10; i+=2 ){
            System.out.print(i + ",");
        }
    }

    /*com.vti.entity.Assignment_01.Question 2
    Tạo method để in thông tin các account*/
    public static void get_account(Account acc) {
        System.out.println("com.vti.entity.Assignment_01.Account ID: " + acc.getAccountId());
        System.out.println("Email: " + acc.getEmail());
        System.out.println("Username: " + acc.getUserName());
        System.out.println("Full Name: " + acc.getFullName());
        System.out.println("com.vti.entity.Assignment_01.Department: " + acc.getDepartmentId().getDepartmentName());
        System.out.println("com.vti.entity.Assignment_01.Position: " + acc.getPositionId().getPositionName());
        System.out.println("Create Date: " + acc.getCreateDate());}

   /* com.vti.entity.Assignment_01.Question 3
    Tạo method để in ra các số nguyên dương nhỏ hơn 10*/

    public static void in_so_nguyen_duong() {
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ",");
        }
    }
}
