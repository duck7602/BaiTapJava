package com.vti.backend.Assignement_03;

import java.util.Date;

public class Assignment_03_EX2 {
    public static void main(String[] args) {
   /* com.vti.entity.Assignment_01.Question 1:
    Không sử dụng data đã insert từ bài trước, tạo 1 array com.vti.entity.Assignment_01.Account và khởi tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
    ∙ Email: "Email 1"
    ∙ Username: "User name 1"
    ∙ FullName: "Full name 1"
    ∙ CreateDate: now*/

        String[] accounts = new String[5];
        for(int i = 1; i<6; i++){
            String sI = String.valueOf(i);
            Date date = new Date();
            String sD = String.valueOf(date);
            String account = "∙ Email: \"Email " + sI + "\" \n" +
                            "∙ Username: \"User name"+ sI+ "\" \n"+
                            "∙ FullName: \"Full name" + sI+ "\" \n"+
                            "∙ CreateDate: "+sD;
            accounts[i-1] = account;
        }
        System.out.println(accounts[0]);

    }
}
