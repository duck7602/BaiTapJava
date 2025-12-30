package com.vti.backend.Assignment_05.Assignment_05_EX1;

public class Main {
    public static void main(String[] args) {
        ThiSinh duc = new KhoiA(2,"Đức","HN",1,2.2f,3.4f,2.5f);
        ThiSinh dat = new KhoiA(2,"Đạt","HN",1,2.2f,3.4f,2.5f);
        TuyenSinh tuyenSinh = new TuyenSinh();
//        tuyenSinh.display(duc);
        tuyenSinh.themThiSinh(duc);
        tuyenSinh.themThiSinh(dat);
        tuyenSinh.search(3);
        tuyenSinh.exit();
    }
}
