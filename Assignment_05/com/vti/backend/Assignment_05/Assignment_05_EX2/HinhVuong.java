package com.vti.backend.Assignment_05.Assignment_05_EX2;

public class HinhVuong extends HinhChuNhat {

    public HinhVuong(double canh) {
        super(canh, canh);
    }

    @Override
    public double tinhChuVi() {
        System.out.println("Tính chu vi theo Hình Vuông");
        return super.tinhChuVi();
    }

    @Override
    public double tinhDienTich() {
        System.out.println("Tính diện tích theo Hình Vuông");
        return super.tinhDienTich();
    }
}

