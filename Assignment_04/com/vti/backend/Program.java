package com.vti.backend;

import com.vti.entity.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // 1. com.vti.entity.Department:
        Department saleDepartment = new Department();
        saleDepartment.departmentId = 1;
        saleDepartment.departmentName = "Sale";

        Department marketingDepartment = new Department();
        marketingDepartment.departmentId = 2;
        marketingDepartment.departmentName = "Marketing";

        Department mediaDepartment = new Department();
        mediaDepartment.departmentId = 3;
        mediaDepartment.departmentName = "Media";

        System.out.println("com.vti.entity.Department 1: " + saleDepartment);
        System.out.println("com.vti.entity.Department 2 (Name): " + marketingDepartment.departmentName + "\n");

        // 2. com.vti.entity.Position:
        Position devPosition = new Position();
        devPosition.positionId = 1;
        devPosition.positionName = PositionName.Dev;

        Position testPosition = new Position();
        testPosition.positionId = 2;
        testPosition.positionName = PositionName.Test;

        Position pmPosition = new Position();
        pmPosition.positionId = 3;
        pmPosition.positionName = PositionName.PM;

        System.out.println("com.vti.entity.Position 1: " + devPosition + "\n");

        // 3. com.vti.entity.Account:
        Account account1 = new Account();
        account1.accountId = 1;
        account1.email = "duc1@gmail.com";
        account1.userName = "Duc";
        account1.fullName = "Nguyen Ba Minh Duc";
        account1.departmentId = saleDepartment;
        account1.positionId = devPosition;
        account1.creatDate = new Date("2025/12/18");

        Account account2 = new Account();
        account2.accountId = 2;
        account2.email = "tam1@gmail.com";
        account2.userName = "Tam";
        account2.fullName = "Nguyen My Minh Tam";
        account2.departmentId = marketingDepartment;
        account2.positionId = testPosition;
        account2.creatDate = new Date("2025/12/18");

        Account account3 = new Account();
        account3.accountId = 3;
        account3.email = "tai1@gmail.com";
        account3.userName = "Tai";
        account3.fullName = "Nguyen Ba Minh Tai";
        account3.departmentId = mediaDepartment;
        account3.positionId = pmPosition;
        account3.creatDate = new Date("2025/12/18");

        System.out.println("com.vti.entity.Account 3: " + account3 + "\n");

        // 4. com.vti.entity.Group:
        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "com.vti.entity.Group 1";
        group1.creatorId = account1;
        group1.createDate = new Date("2003/02/03");

        Group group2 = new Group();
        group2.groupId = 2;
        group2.groupName = "com.vti.entity.Group 2";
        group2.creatorId = account2;
        group2.createDate = new Date("2003/05/03");

        Group group3 = new Group();
        group3.groupId = 3;
        group3.groupName = "com.vti.entity.Group 3";
        group3.creatorId = account3;
        group3.createDate = new Date("2005/02/03");

        System.out.println("com.vti.entity.Group 3: " + group3 + "\n");

        // 5. com.vti.entity.GroupAccount:
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.groupId = group1;
        groupAccount1.accountId = account1;
        groupAccount1.joinDate = new Date("2007/04/02");

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.groupId = group2;
        groupAccount2.accountId = account2;
        groupAccount2.joinDate = new Date("2003/04/02");

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.groupId = group3;
        groupAccount3.accountId = account2;
        groupAccount3.joinDate = new Date("2007/04/02");

        System.out.println("com.vti.entity.Group com.vti.entity.Account 3: " + groupAccount3 + "\n");

        // 6. TypeQuesion:
        TypeQuestion typeQuestion1 = new TypeQuestion();
        typeQuestion1.typeId = 1;
        typeQuestion1.typeName = TypeName.Essay;

        TypeQuestion typeQuestion2 = new TypeQuestion();
        typeQuestion2.typeId = 2;
        typeQuestion2.typeName = TypeName.Essay;

        TypeQuestion typeQuestion3 = new TypeQuestion();
        typeQuestion3.typeId = 3;
        typeQuestion3.typeName = TypeName.Multiple_Choice;

        System.out.println("Type com.vti.entity.Question 3: " + typeQuestion3 + "\n");

        // 7. com.vti.entity.CategoryQuestion:
        CategoryQuestion categoryQuestion1 = new CategoryQuestion();
        categoryQuestion1.categoryId = 1;
        categoryQuestion1.categoryName = "Java";

        CategoryQuestion categoryQuestion2 = new CategoryQuestion();
        categoryQuestion2.categoryId = 2;
        categoryQuestion2.categoryName = "Python";

        CategoryQuestion categoryQuestion3 = new CategoryQuestion();
        categoryQuestion3.categoryId = 3;
        categoryQuestion3.categoryName = "Ruby";

        System.out.println("Category com.vti.entity.Question 3: " + categoryQuestion3 + "\n");

        // 8. com.vti.entity.Question:
        Question question1 = new Question();
        question1.questionId = 1;
        question1.content = "Content1";
        question1.categoryId = categoryQuestion1;
        question1.typeId = typeQuestion1;
        question1.creatorId = account1;
        question1.createDate = new Date("2020/01/01");

        Question question2 = new Question();
        question2.questionId = 2;
        question2.content = "Content2";
        question2.categoryId = categoryQuestion2;
        question2.typeId = typeQuestion2;
        question2.creatorId = account2;
        question2.createDate = new Date("2020/01/08");

        Question question3 = new Question();
        question3.questionId = 3;
        question3.content = "Content3";
        question3.categoryId = categoryQuestion3;
        question3.typeId = typeQuestion3;
        question3.creatorId = account3;
        question3.createDate = new Date("2023/01/01");

        System.out.println("com.vti.entity.Question 3: " + question3 + "\n");

        // 9. com.vti.entity.Answer:
        Answer answer1 = new Answer();
        answer1.answerId = 1;
        answer1.content = "Content1";
        answer1.questionId = question1;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.answerId = 2;
        answer2.content = "Content2";
        answer2.questionId = question2;
        answer2.isCorrect = true;

        Answer answer3 = new Answer();
        answer3.answerId = 3;
        answer3.content = "Content3";
        answer3.questionId = question3;
        answer3.isCorrect = false;

        System.out.println("com.vti.entity.Answer 3: " + answer3 + "\n");

        // 10. com.vti.entity.Exam:
        Exam exam1 = new Exam();
        exam1.examId = 1;
        exam1.code = 1;
        exam1.title = "Title1";
        exam1.categoryId = categoryQuestion1;
        exam1.duration = 60;
        exam1.creatorId = account1;
        exam1.createDate = new Date("2003/03/02");

        Exam exam2 = new Exam();
        exam2.examId = 2;
        exam2.code = 2;
        exam2.title = "Title2";
        exam2.categoryId = categoryQuestion2;
        exam2.duration = 60;
        exam2.creatorId = account2;
        exam2.createDate = new Date("2003/03/02");

        Exam exam3 = new Exam();
        exam3.examId = 3;
        exam3.code = 3;
        exam3.title = "Title3";
        exam3.categoryId = categoryQuestion3;
        exam3.duration = 60;
        exam3.creatorId = account3;
        exam3.createDate = new Date("2003/03/02");

        System.out.println("com.vti.entity.Exam 3: " + exam3 + "\n");

        // 11.com.vti.entity.ExamQuestion:
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.examId = exam1;
        examQuestion1.questionId = question1;

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.examId = exam2;
        examQuestion2.questionId = question2;

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.examId = exam3;
        examQuestion3.questionId = question3;

        System.out.println("com.vti.entity.Exam com.vti.entity.Question 3: " + examQuestion3 + "\n");

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

        /*com.vti.entity.Question 1:
        Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số
        nguyên đó*/

        int x = 5;
        System.out.printf("Số nguyên: %d %n", x);

        /*com.vti.entity.Question 2:
        Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in
        ra số nguyên đó thành định dạng như sau: 100,000,000*/

        x = 100000000;
        System.out.printf("Số nguyên: %,d %n", x);

        /*com.vti.entity.Question 3:
        Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số
        thực đó chỉ bao gồm 4 số đằng sau*/

        float y = 5.567098f;
        System.out.printf("Số nguyên: %.4f %n", y);

      /*  com.vti.entity.Question 4:
        Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định
        dạng như sau:
        Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau:
        Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.*/

        String ten = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\"  và tôi đang độc thân. %n", ten);

       /* com.vti.entity.Question 5:
        Lấy thời gian bây giờ và in ra theo định dạng sau:
        24/04/2020 11h:16p:20s*/

        Date now = new Date();
        String pattern = "dd-MM-yyyy HH:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println(date);

        // com.vti.entity.Question 6:
        get_infor_account_ex2(accounts);

        // EX 3:

        get_infor_exam(exam1);
        get_infor_exam_c2(exam1);
        get_infor_exam_c3(exam1);
        get_infor_exam_c4(exam1);
        get_infor_exam_c5(exam1);


        // EX 4:
       /* com.vti.entity.Question 1:
        In ngẫu nhiên ra 1 số nguyên*/

        Random random = new Random();
        int number = random.nextInt();
        System.out.println("Random integer: " + number);

        /*com.vti.entity.Question 2:
        In ngẫu nhiên ra 1 số thực*/

        float number1 = random.nextFloat();
        System.out.println("Random float: " + number1);

        /*com.vti.entity.Question 3:
        Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn*/

        String[] students = {"Đức", "Tâm", "Tài", "Dũng"};

        int index = random.nextInt(students.length);
        System.out.println("Random student: " + students[index]);


        /*com.vti.entity.Question 4:
        Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24 - 07 - 1995 tới ngày 20 - 12 - 1995*/

        int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();

        int randomDayInt = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomDay = LocalDate.ofEpochDay(randomDayInt);

        System.out.println("Random date: " + randomDay);

        /*com.vti.entity.Question 5:
        Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây*/

        LocalDate now1 = LocalDate.now();
        int maxDay1 = (int) now.getDay();
        int minDay1 = maxDay - 365;

        int randomDayInt1 = minDay1 + random.nextInt(maxDay - minDay1);
        LocalDate randomDay1 = LocalDate.ofEpochDay(randomDayInt);

        System.out.println("Random date (last year): " + randomDay1);

        /*com.vti.entity.Question 6:
        Lấy ngẫu nhiên 1 ngày trong quá khứ.*/

        int maxDay2 = (int) LocalDate.now().toEpochDay();

        int randomDayInt2 = random.nextInt(maxDay2);
        LocalDate randomDay2 = LocalDate.ofEpochDay(randomDayInt2);
        System.out.println("Random past date: " + randomDay2);

        /*com.vti.entity.Question 7:
        Lấy ngẫu nhiên 1 số có 3 chữ số.*/

        int number4 = random.nextInt(900) + 100;
        System.out.println("Random number: " + number4);


    //EX5:

    /*com.vti.entity.Question 1
    Cho phép người dùng nhập 3 số nguyên*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ 1: ");
        int a = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ 2: ");
        int b = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ 3: ");
        int c = scanner.nextInt();
        System.out.println("Ba số vừa nhập: "+a +", "+b +", "+c);

    /*com.vti.entity.Question 2
    Cho phép người dùng nhập 2 số thực*/
        System.out.print("Nhập số thực thứ 1: ");
        float x1 = scanner.nextFloat();
        System.out.print("Nhập số thực thứ 2: ");
        float y1 = scanner.nextFloat();
        System.out.println("Hai số thực vừa nhập: " + x1 + " và " + y1);

    /*com.vti.entity.Question 3
    Cho phép người dùng nhập họ và tên*/
        scanner.nextLine();
        System.out.print("Nhập họ và tên: ");
        String fullName = scanner.nextLine();
        System.out.println("Họ và tên: " + fullName);

   /* com.vti.entity.Question 4
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



    /*com.vti.entity.Question 1:
   Kiểm tra account thứ 2
   Nếu không có phòng ban (tức là department == null) thì sẽ in ra text "Nhân viên này chưa có phòng ban"
   Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"*/

    public static void check_dp_account2(Account account2) {
        if (account2.departmentId == null) {
            System.out.println("Nhân viên này chưa có phòng ban %n");
        } else {
            System.out.printf("Phòng ban của nhân viên là: %s %n", account2.departmentId.departmentName);
        }
    }
    /*
    com.vti.entity.Question 2:
    Kiểm tra account thứ 2
    Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
    Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "com.vti.entity.Group của nhân viên này là Java Fresher, C# Fresher"
    Nếu có mặt trong 3 com.vti.entity.Group thì sẽ in ra text "Nhân viên này là người quan trọng, tham gia nhiều group"
    Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là người hóng chuyện, tham gia tất cả các group"*/

    public static void check_group_account(Account account, GroupAccount[] groupAccounts) {
        int countgroup = 0;
        for (GroupAccount ga : groupAccounts) {
            if (account == ga.accountId) {
                countgroup++;
            }
        }
        if (countgroup == 1 || countgroup == 2) {
            System.out.println("com.vti.entity.Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (countgroup == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else if (countgroup >= 4) {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

    }

    /* com.vti.entity.Question 3:
    Sử dụng toán tử ternary để làm com.vti.entity.Question 1*/
    public static void check_dp_account2_c2(Account account2) {
        System.out.printf(account2.departmentId == null ? "Nhân viên này chưa có phòng ban %n" : "Phòng ban của nhân viên là: %s %n", account2.departmentId.departmentName);
    }

    /*com.vti.entity.Question 4:
    Sử dụng toán tử ternary để làm yêu cầu sau:
    Kiểm tra com.vti.entity.Position của account thứ 1
    Nếu com.vti.entity.Position = Dev thì in ra text "Đây là Developer"
    Nếu không phải thì in ra text "Người này không phải là Developer"*/

    public static void check_position_account(Account account) {
        System.out.println(account.positionId.positionName == PositionName.Dev ? "Đây là Developer" : "Người này không phải là Developer");
    }

    /*com.vti.entity.Question 5:
    Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
    Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
    Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
    Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
    Còn lại in ra "Nhóm có nhiều thành viên"*/
    public static void check_account_group(Group group, GroupAccount[] groupAccounts) {
        int countaccount = 0;
        for (GroupAccount ga : groupAccounts) {
            if (group == ga.groupId) {
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

    /*com.vti.entity.Question 6:
    Sử dụng switch case để làm lại com.vti.entity.Question 2*/

    public static void check_group_account_c2(Account account, GroupAccount[] groupAccounts) {
        int countgroup = 0;
        for (GroupAccount ga : groupAccounts) {
            if (account == ga.accountId) {
                countgroup++;
            }
        }
        switch (countgroup) {
            case 1:
                System.out.println("com.vti.entity.Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 2:
                System.out.println("com.vti.entity.Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            case 4:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }
    }

    /*com.vti.entity.Question 7:
    Sử dụng switch case để làm lại com.vti.entity.Question 4*/

    public static void check_position_account_c2(Account account) {
        switch (account.positionId.positionName) {
            case Dev:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");


        }
    }

    /*com.vti.entity.Question 8:
    In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ*/

    public static void get_infor_account(Account[] accounts) {
        for (Account account : accounts) {
            System.out.printf("Email: %s, FullName: %s, Phòng Ban: %s %n", account.email, account.fullName, account.positionId.positionName);
        }
    }

    /*com.vti.entity.Question 9:
    In ra thông tin các phòng ban bao gồm: id và name*/

    public static void get_infor_department(Department[] departments) {
        for (Department department : departments) {
            System.out.printf("Id: %s, Name: %s %n", department.departmentId, department.departmentName);
        }

    }

/*    com.vti.entity.Question 10:
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
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].email, accounts[i].fullName, accounts[i].positionId.positionName);
        }
    }

    /*com.vti.entity.Question 11:
    In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau:
    Thông tin department thứ 1 là:
    Id: 1
    Name: Sale
    Thông tin department thứ 2 là:
    Id: 2
    Name: Marketing*/

    public static void get_infor_department_c2(Department[] departments) {
        for (int i = 0; i < departments.length; i++) {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].departmentId, departments[i].departmentName);
        }

    }

    /*com.vti.entity.Question 12:
    Chỉ in ra thông tin 2 department đầu tiên theo định dạng như com.vti.entity.Question 10*/

    public static void get_infor_department_c3(Department[] departments) {
        for (int i = 0; i < 2; i++) {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].departmentId, departments[i].departmentName);
        }

    }

  /*  com.vti.entity.Question 13:
    In ra thông tin tất cả các account ngoại trừ account thứ 2*/

    public static void get_infor_account_c3(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (i == 1) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].email, accounts[i].fullName, accounts[i].positionId.positionName);
        }
    }

    /*com.vti.entity.Question 14:
    In ra thông tin tất cả các account có id < 4*/

    public static void get_infor_account_c4(Account[] accounts) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].accountId > 4) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].email, accounts[i].fullName, accounts[i].positionId.positionName);
        }
    }

    /*com.vti.entity.Question 15:
    In ra các số chẵn nhỏ hơn hoặc bằng 20*/
    public static void get_number() {
        for (int i = 0; i <= 20; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + ",");
        }
    }

 /*   com.vti.entity.Question 16:
    Làm lại các com.vti.entity.Question ở phần FOR bằng cách sử dụng WHILE kết hợp với
    lệnh break, continue*/

    public static void get_infor_account_while(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].email, accounts[i].fullName, accounts[i].positionId.positionName);
            i++;
        }
    }

    public static void get_infor_department_while(Department[] departments) {
        int i = 0;
        while (i < departments.length) {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].departmentId, departments[i].departmentName);
            i++;
        }
    }

    public static void get_infor_department_c3_while(Department[] departments) {
        int i = 0;
        while (i < 2) {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].departmentId, departments[i].departmentName);
            i++;
        }
    }

    public static void get_infor_account_c3_while(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            if (i == 1) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].email, accounts[i].fullName, accounts[i].positionId.positionName);
            i++;
        }
    }

    public static void get_infor_account_c4_while(Account[] accounts) {
        int i = 0;
        while (i < accounts.length) {
            if (accounts[i].accountId > 4) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].email, accounts[i].fullName, accounts[i].positionId.positionName);
            i++;
        }
    }

/*    com.vti.entity.Question 17:
    Làm lại các com.vti.entity.Question ở phần FOR bằng cách sử dụng DO-WHILE kết hợp với
    lệnh break, continue*/

    public static void get_infor_account_do_while(Account[] accounts) {
        int i = 0;
        do {
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].email, accounts[i].fullName, accounts[i].positionId.positionName);
            i++;
        } while (i < accounts.length);
    }

    public static void get_infor_department_do_while(Department[] departments) {
        int i = 0;
        do {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].departmentId, departments[i].departmentName);
            i++;
        } while (i < departments.length);
    }

    public static void get_infor_department_c3_do_while(Department[] departments) {
        int i = 0;
        do {
            System.out.printf("Thông tin department thứ %d là: %n Id: %s %n Name: %s %n", i + 1, departments[i].departmentId, departments[i].departmentName);
            i++;
        } while (i < 2);
    }

    public static void get_infor_account_c3_do_while(Account[] accounts) {
        int i = 0;
        do {
            if (i == 1) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].email, accounts[i].fullName, accounts[i].positionId.positionName);
            i++;
        } while (i < accounts.length);
    }

    public static void get_infor_account_c4_do_while(Account[] accounts) {
        int i = 0;
        do {
            if (accounts[i].accountId > 4) {
                continue;
            }
            System.out.printf("Thông tin account thứ %d là: %n Email: %s %n, FullName: %s %n, Phòng Ban: %s %n", i + 1, accounts[i].email, accounts[i].fullName, accounts[i].positionId.positionName);
            i++;
        } while (i < accounts.length);
    }


//    Exercise2:


//    com.vti.entity.Question 6:
//    In ra thông tin account (như com.vti.entity.Question 8 phần FOREACH) theo định dạng
//    table (giống trong Database)

    public static void get_infor_account_ex2(Account[] accounts) {
        System.out.println("+----+-------------------+----------+----------------------+------------+----------+");

        for (Account acc : accounts) {
            System.out.printf(
                    "| %-2d | %-17s | %-8s | %-20s | %-10s | %-8s |\n",
                    acc.accountId,
                    acc.email,
                    acc.userName,
                    acc.fullName,
                    acc.departmentId.departmentName,
                    acc.positionId.positionName
            );
        }

        System.out.println("+----+-------------------+----------+----------------------+------------+----------+");

    }


    //Exercise 3:




    /*com.vti.entity.Question 1:
    In ra thông tin com.vti.entity.Exam thứ 1 và property create date sẽ được format theo định
    dạng vietnamese*/

    public static void get_infor_exam(Exam exam) {

        Date now = exam.createDate;
        String pattern = "dd-MM-yyyy HH:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println("===== EXAM INFO =====");
        System.out.println("com.vti.entity.Exam ID: " + exam.examId);
        System.out.println("Code: " + exam.code);
        System.out.println("Title: " + exam.title);
        System.out.println("Category: " + exam.categoryId.categoryName);
        System.out.println("Duration: " + exam.duration + " minutes");
        System.out.println("Creator: " + exam.creatorId.fullName);
        System.out.println("Create Date: " + date);
    }

/*    com.vti.entity.Question 2

    In ra com.vti.entity.Exam đã tạo ngày nào theo định dạng:
    Năm – tháng – ngày – giờ – phút – giây*/

    public static void get_infor_exam_c2(Exam exam) {

        Date now = exam.createDate;
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println("Create Date: " + date);
    }

    /*  com.vti.entity.Question 3

      Chỉ in ra năm của create date*/
    public static void get_infor_exam_c3(Exam exam) {

        Date now = exam.createDate;
        String pattern = "yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println("Create Date: " + date);
    }
    /*com.vti.entity.Question 4

    Chỉ in ra tháng và năm của create date*/

    public static void get_infor_exam_c4(Exam exam) {

        Date now = exam.createDate;
        String pattern = "MM-yyyy";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println("Create Date: " + date);
    }

    /*com.vti.entity.Question 5

    Chỉ in ra "MM-DD" của create date*/
    public static void get_infor_exam_c5(Exam exam) {

        Date now = exam.createDate;
        String pattern = "MM-dd";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        String date = format.format(now);
        System.out.println("Create Date: " + date);
    }


    // Exercise 6:

    /*com.vti.entity.Question 1
    Tạo method in ra các số chẵn nguyên dương nhỏ hơn 10*/

    public static void in_so_chan(){
        for (int i = 0; i<10; i+=2 ){
            System.out.print(i + ",");
        }
    }

    /*com.vti.entity.Question 2
    Tạo method để in thông tin các account*/
    public static void get_account(Account acc) {
        System.out.println("com.vti.entity.Account ID: " + acc.accountId);
        System.out.println("Email: " + acc.email);
        System.out.println("Username: " + acc.userName);
        System.out.println("Full Name: " + acc.fullName);
        System.out.println("com.vti.entity.Department: " + acc.departmentId.departmentName);
        System.out.println("com.vti.entity.Position: " + acc.positionId.positionName);
        System.out.println("Create Date: " + acc.creatDate);}

   /* com.vti.entity.Question 3
    Tạo method để in ra các số nguyên dương nhỏ hơn 10*/

    public static void in_so_nguyen_duong() {
        for (int i = 1; i < 10; i++) {
            System.out.print(i + ",");
        }
    }
}
