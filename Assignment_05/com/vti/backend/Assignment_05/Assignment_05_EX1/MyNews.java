package com.vti.backend.Assignment_05.Assignment_05_EX1;

import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        News news = new News();
        int nb;
        do {
        System.out.println("1∙ Insert news\n" +
                            "2∙ View list news\n" +
                            "3∙ Average rate\n" +
                            "4∙ Exit");
        System.out.println("Hãy chọn chức năng:");
        nb = scanner.nextInt();
        switch (nb){
            case 1:
                System.out.println("Nhập id:");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nhập title:");
                String title = scanner.nextLine();
                System.out.println("Nhập publisDate:");
                String publisDate = scanner.nextLine();
                System.out.println("Nhập author:");
                String author = scanner.nextLine();
                System.out.println("Nhập content:");
                String content = scanner.nextLine();
                System.out.println("Nhập 3 số của rates:");
                int[] rates = new int[3];
                for (int i = 0; i < 3; i++) {
                    rates[i] = scanner.nextInt();
                }
                news = new News(id,title,publisDate,author,content,rates);
                break;
            case 2:
                news.display();
                break;
            case 3:
                news.calculate();
                news.display();
                break;
            case 4:
                System.out.println("Thoát chương trình.");
                break;
        }}while (nb!=4);
        scanner.close();
    }
}
