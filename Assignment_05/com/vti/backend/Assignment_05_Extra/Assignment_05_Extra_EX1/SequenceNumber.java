package com.vti.backend.Assignment_05_Extra.Assignment_05_Extra_EX1;

/*a) Xây dựng class "SequenceNumber" để mô tả 1 dãy số, class bao gồm những điều sau:
∙ Phương thức "input" được sử dụng để nhập số từ bàn phím.
∙ Phương thức "print" được sử dụng để in dãy số lên màn hình
∙ Hàm khởi tạo SequenceNumber(int n) sử dụng để khởi tạo 1 array có n phần tử.*/

import java.util.Scanner;

public class SequenceNumber {
    private int n;

    public SequenceNumber(int n) {
        this.n = n;
    }
    int[] array = new int[n];
    Scanner scanner = new Scanner(System.in);

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void input(){
        System.out.println("Nhập vào dãy số:");
        for (int i = 0; i < n; i++) {
            array[i]=scanner.nextInt();
        }
    }

    public void print(){
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}
