package com.vti.backend.Assignment_05.Assignment_05_EX2;

public class HinhChuNhat {
    protected double chieuDai;
    protected double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhChuVi() {
        System.out.println("Tính chu vi theo Hình Chữ Nhật");
        return 2 * (chieuDai + chieuRong);
    }

    public double tinhDienTich() {
        System.out.println("Tính diện tích theo Hình Chữ Nhật");
        return chieuDai * chieuRong;
    }
}

