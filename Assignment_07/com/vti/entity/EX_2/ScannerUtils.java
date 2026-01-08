package com.vti.entity.EX_2;

import java.util.Scanner;

public class ScannerUtils {

    static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String errorMessage) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static float inputFloat(String errorMessage) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static double inputDouble(String errorMessage) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println(errorMessage);
            }
        }
    }

    public static String inputString() {
        return scanner.nextLine();
    }
}

