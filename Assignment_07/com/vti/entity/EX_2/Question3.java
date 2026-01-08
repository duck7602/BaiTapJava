package com.vti.entity.EX_2;

public class Question3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Lỗi: Chỉ số vượt quá độ lớn của mảng.");
            System.out.println("Thông tin lỗi: " + e.getMessage());
        }
    }
}

