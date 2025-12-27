package com.vti.backend.Assignement_03;

import com.vti.entity.Group;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Assignment_03_EX4 {
    public static void main(String[] args) {
        // 4. com.vti.entity.Group:
        Group group1 = new Group();
        group1.setGroupId(1);
        group1.setGroupName("com.vti.entity.Group 1");
        group1.setCreateDate(new Date("2003/02/03"));

        Group group2 = new Group();
        group2.setGroupId(2);
        group2.setGroupName("com.vti.entity.Group 2");
        group2.setCreateDate(new Date("2003/05/03"));

        Group group3 = new Group();
        group3.setGroupId(3);
        group3.setGroupName("com.vti.entity.Group 3");
        group3.setCreateDate(new Date("2005/02/03"));

        /*com.vti.entity.Question 1:
        Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có thể cách nhau bằng nhiều khoảng trắng );*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi ký tự: ");
        String string = scanner.nextLine();
        String[] array = string.split("\\s+");
        int counter = 0;
        int space = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals("")){
                space++;
            }
            System.out.println(array[i]);
            counter = array.length - space;
        } System.out.println(counter);

     /*   com.vti.entity.Question 2:
        Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;*/
        System.out.println("Nhập vào kí tự s1: ");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào kí tự s2: ");
        String s2 = scanner.nextLine();
        String s3 = s1 + s2;
        System.out.println(s3);

        /*com.vti.entity.Question 3:
        Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chữ viết hoa chữ cái đầu thì viết hoa lên.*/

        System.out.println("Nhập vào tên: ");
        String ten = scanner.nextLine();
        char chuDauTien = ten.charAt(0);
        if(Character.isLowerCase(chuDauTien)){
            ten = Character.toUpperCase(chuDauTien)+ ten.substring(1);
        }
        System.out.println("Nhập vào môn kiểm tra: ");
        String monHoc = scanner.nextLine();
        System.out.println("Tên: "+ten);
        System.out.println("Môn kiểm tra: "+monHoc);

        /*com.vti.entity.Question 4:
        Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên của người dùng ra
        VD:
        Người dùng nhập vào "Nam", hệ thống sẽ in ra
        "Ký tự thứ 1 là: N"
        "Ký tự thứ 1 là: A"
        "Ký tự thứ 1 là: M"*/

        System.out.println("Nhập vào tên: ");
        String name = scanner.nextLine();
        String[] arrName = name.split("");
        for (int i = 0; i < arrName.length; i++) {
            System.out.printf("\"Ký tự thứ %d là: %s\" %n",i+1,arrName[i]);
        }

        /*com.vti.entity.Question 5:
        Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ.*/

        System.out.println("Nhập vào họ: ");
        String ho = scanner.nextLine();
        System.out.println("Nhập vào tên: ");
        String ten1 = scanner.nextLine();
        String hoTen = ho + ten1;
        System.out.println("Họ và Tên: "+hoTen);

        /*com.vti.entity.Question 6:
        Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm
        VD:
        Người dùng nhập vào "Nguyễn Văn Nam"
        Hệ thống sẽ in ra
        "Họ là: Nguyễn"
        "Tên đệm là: Văn"
        "Tên là: Nam"*/

        System.out.println("Nhập vào họ và Tên: ");
        String hoVaTen = scanner.nextLine();
        String[] arrHoTen = hoVaTen.split(" ");
        String tenDem = "";
        String name2 = "";
        for (int i = 0; i < arrHoTen.length; i++) {
            if(i == 0){
                System.out.printf("Họ là: %s%n",arrHoTen[0]);
            }
            else if(i == arrHoTen.length-1 ){
                name2 = arrHoTen[arrHoTen.length-1];
            }
            else{
                tenDem += arrHoTen[i]+" ";;
            }
        }
        System.out.println("Tên đệm là: "+tenDem);
        System.out.println("Tên là: "+ten);

/*        com.vti.entity.Question 7:
        Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên của họ như sau:
        a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
        VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn   nam"
        b) Viết hoa chữ cái mỗi từ của người dùng
        VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"*/

        System.out.println("Nhập vào họ và tên: ");
        String hoTen2 = scanner.nextLine().trim();;
        String[] arrHoTen2 = hoTen2.split("\\s+");
        String hoTen3 = "";
        for (int i = 0; i < arrHoTen2.length; i++) {
                arrHoTen2[i] =arrHoTen2[i].substring(0,1).toUpperCase()+arrHoTen2[i].substring(1).toLowerCase();
                hoTen3 += arrHoTen2[i]+ " ";
        }
        System.out.println(hoTen3);

       /* com.vti.entity.Question 8:
        In ra tất cả các group có chứa chữ "Java"*/

        Group[] groups = {group1, group2, group3};
        for (Group group : groups) {
            if (group.getGroupName().contains("Java")) {
                System.out.println(group.getGroupName());
            }
        }

        /*com.vti.entity.Question 9:
        In ra tất cả các group "Java"*/

        for (Group group : groups) {
            if (group.getGroupName() == "Java") {
                System.out.println(group.getGroupName());
            }
        }

       /* com.vti.entity.Question 10:
        Kiểm tra 2 chuỗi có là đảo ngược của nhau hay không.
        Nếu có xuất ra “OK” ngược lại “KO”.
        Ví dụ “word” và “drow” là 2 chuỗi đảo ngược nhau.*/

        System.out.println("Nhập vào chuỗi 1:");
        String string1 = scanner.nextLine();
        System.out.println("Nhập vào chuỗi 2:");
        String string2 = scanner.nextLine();
        String[] arr1 = string1.split("");
        String[] arr2 = string2.split("");
        for (int i = 0; i < arr2.length/2; i++) {
            String temp = arr2[i];
            arr2[i] = arr2[arr2.length-1-i];
            arr2[arr2.length-1-i] = temp;
        }
        if(Arrays.equals(arr1,arr2)){
            System.out.printf("\"%s\" và \"%s\" là 2 chuỗi đảo ngược của nhau. ",string1,string2);
        }

       /* com.vti.entity.Question 11: Count special Character
        Tìm số lần xuất hiện ký tự "a" trong chuỗi*/

        System.out.println("Nhập vào chuỗi: ");
        String string3 = scanner.nextLine();
        String[] arr3 = string3.split("");
        int counterr = 0;
        for (int i = 0; i < arr3.length; i++) {
            if(arr3[i].equals("a")){
                counterr++;
            }
        }
        System.out.println(counterr);


        /*com.vti.entity.Question 12: Reverse String
        Đảo ngược chuỗi sử dụng vòng lặp*/

        System.out.println("Nhập vào chuỗi: ");
        String string4 = scanner.nextLine();
        String[] arr4 = string4.split("");
        String newString4 = "";
        for (int i = 0; i < arr4.length/2; i++) {
            String temp = arr4[i];
            arr4[i] = arr4[arr4.length-1-i];
            arr4[arr4.length-1-i] = temp;
        }
        for (int i = 0; i < arr4.length; i++) {
            newString4+=arr4[i];
        }
        System.out.println(newString4);

/*        com.vti.entity.Question 13:
        String not contains digit
        Kiểm tra một chuỗi có chứa chữ số hay không, nếu có in ra false ngược lại true.
        Ví dụ:
        "abc" => true
        "1abc", "abc1", "123", "a1bc", null => false*/

        System.out.println("Nhập vào chuỗi: ");
        String string5 = scanner.nextLine();
        String[] arr5 = string5.split("");
        boolean True = false;
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < 10; j++) {
                if(arr5[i].equals(String.valueOf(j)) || arr5[i].equals(null)){
                    True = true;
                    break;
                }
            }
        }if(True==true){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

        /*com.vti.entity.Question 14: Replace character
        Cho một chuỗi str, chuyển các ký tự được chỉ định sang một ký tự khác cho trước.
        Ví dụ:
        "VTI Academy" chuyển ký tự 'e' sang '*' kết quả " VTI Acad*my"*/

        System.out.println("Nhập vào chuỗi ký tự: ");
        String string6 = scanner.nextLine();
        System.out.println("Nhập vào từ cần chuyển:");
        Character char1 = scanner.next().charAt(0);
        System.out.println("Nhập vào từ thay thế: ");
        Character char2 = scanner.next().charAt(0);
        int counter2 = 0;
        String newString6 = "";
        String[] arr7 = string6.split("");
        for (int i = 0; i < arr7.length; i++) {
            if(arr7[i].equals(char1.toString())){
                arr7[i] = char2.toString();
            }else  {
                counter2++;
            }
            newString6 += arr7[i];
        }
        if(counter2==arr7.length){
            System.out.println("Không tìm thấy từ cần chuyển");
        }else {
        System.out.println("Chuỗi ký tự mới là: "+newString6);
    }

       /* com.vti.entity.Question 15: Revert string by word
        Đảo ngược các ký tự của chuỗi cách nhau bởi dấu cách mà không dùng thư viện.
        Ví dụ: " I am developer " => "developer am I".
        Các ký tự bên trong chỉ cách nhau đúng một dấu khoảng cách.
        Gợi ý: Các bạn cần loại bỏ dấu cách ở đầu và cuối câu, thao tác cắt chuỗi theo dấu cách*/

        System.out.println("Nhập vào chuỗi ký tự: ");
        String string8 = scanner.nextLine().trim();
        String[] arr8 = string8.split(" ");
        for (int i = 0; i < arr8.length/2; i++) {
            String temp = arr8[i];
            arr8[i] = arr8[arr8.length-1-i];
            arr8[arr8.length-1-i] = temp;
        }
        String result = String.join(" ",arr8);
        System.out.println("Chuỗi mới là: "+result);

      /*  com.vti.entity.Question 16:
        Cho một chuỗi str và số nguyên n >= 0. Chia chuỗi str ra làm các phần bằng nhau với n ký tự.
        Nếu chuỗi không chia được thì xuất ra màn hình “KO”.*/
        System.out.println("Nhập vào chuỗi:");
        String string9 = scanner.nextLine();
        System.out.println("Nhập vào số n: ");
        int n = scanner.nextInt();
        string9 = string9.replaceAll("\\s+", "");
        String[] arr9 = string9.split("");
        String chuoi = "";
        for (int i = 0; i < arr9.length; i += n) {
            int number4 = i + n;
            if (arr9.length % n == 0) {
                chuoi = string9.substring(i, number4);
                System.out.println(chuoi);
            } else {
                System.out.println("KO");
                break;
            }
        }

    }

}
