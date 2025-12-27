package com.vti.backend.Assignement_03;

public class Assignment_03_EX3 {
    public static void main(String[] args) {
        /* com.vti.entity.Question 1:
        Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
        Sau đó convert lương ra float và hiển thị lương lên màn hình (với số float có 2 số sau dấu thập phân).*/

        Integer salary = 5000;
        float fSalary = salary;
        System.out.printf("Lương: %.2f %n",fSalary);

        /*com.vti.entity.Question 2:
        Khai báo 1 String có value = "1234567"
        Hãy convert String đó ra số int*/

        String str = "123456";
        int i = Integer.parseInt(str);
        Integer i1 = Integer.valueOf(str);
        System.out.println(i1);
        System.out.println(i);

        /*com.vti.entity.Question 3:
        Khởi tạo 1 số Integer có value là chữ "1234567"
        Sau đó convert số trên thành datatype int*/

        Integer i2 = Integer.valueOf("1234567");
        int i3 = i2;
        int i4 = i2.intValue();
        System.out.println(i3);
        System.out.println(i4);
    }
}
