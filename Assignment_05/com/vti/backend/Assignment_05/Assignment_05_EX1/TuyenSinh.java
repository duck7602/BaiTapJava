package com.vti.backend.Assignment_05.Assignment_05_EX1;

/*b) Xây dựng interface ITuyenSinh và class TuyenSinh có các chức năng:
a. Thêm mới thí sinh.
b. Hiện thị thông tin của thí sinh và khối thi của thí sinh.
c. Tìm kiếm theo số báo danh.
d. Thoát khỏi chương trình.*/

import java.util.ArrayList;

public class TuyenSinh implements ITuyenSinh{
    ArrayList<ThiSinh> danhSachTuyenSinh = new ArrayList<>();

    @Override
    public void themThiSinh(ThiSinh thiSinh) {
            danhSachTuyenSinh.add(thiSinh);
    }

    @Override
    public void display(ThiSinh thiSinh) {
        System.out.println(thiSinh);
    }

    @Override
    public void search(int sbd) {
        boolean found = false;
        for(ThiSinh thiSinh: danhSachTuyenSinh){
            if (sbd==thiSinh.getId()){
                System.out.println(thiSinh);
                found = true;
            }
        }if (found==false){
            System.out.println("Không tìm thấy thí sinh.");
        }
    }

    @Override
    public void exit() {
        System.out.println("Thoát chương trình.");
        System.exit(0);
    }
}
