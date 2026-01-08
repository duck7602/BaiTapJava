package com.vti.entity.EX_2;

public class Question4 {

    static String[] departments = {"Sale", "Marketing", "IT"};

    public static void main(String[] args) {
        getIndex(1);
        getIndex(5);
    }

    public static void getIndex(int index) {
        try {
            System.out.println("Department: " + departments[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find department.");
        }
    }
}

