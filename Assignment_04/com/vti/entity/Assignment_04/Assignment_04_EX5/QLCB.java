package com.vti.entity.Assignment_04.Assignment_04_EX5;

import java.util.ArrayList;

/*Question 2: Tiếp tục Question 1
Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực hiện các chức năng sau:
a) Thêm mới cán bộ.
b) Tìm kiếm theo họ tên.
c) Hiện thị thông tin về danh sách các cán bộ.
d) Nhập vào tên của cán bộ và delete cán bộ đó
e) Thoát khỏi chương trình.*/

public class QLCB {

    private ArrayList<CanBo> danhSachCanBo = new ArrayList<>();

    // create constructor
    public QLCB(ArrayList<CanBo> danhSachCanBo) {
        this.danhSachCanBo = danhSachCanBo;
    }

    // getter && setter
    public void setDanhSachCanBo(ArrayList<CanBo> danhSachCanBo) {
        this.danhSachCanBo = danhSachCanBo;
    }

    public ArrayList<CanBo> getDanhSachCanBo() {
        return danhSachCanBo;
    }

    // a)
    public void addCanBo(CanBo canBo) {
        danhSachCanBo.add(canBo);
    }

    // b)
    public void searchCanBo(String name) {
        boolean found = false;
        for (CanBo cb : danhSachCanBo) {
            if (cb.getName().equals(name)) {
                System.out.println(cb);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy cán bộ.");
        }


    }

    // c)
    public void displayCanbo(){
        if(danhSachCanBo.isEmpty()){
            System.out.println("Danh sách cán bộ rỗng.");
        }
        for (CanBo cb: danhSachCanBo){
            System.out.println(cb);
        }
    }

    // d)
    public void deleteCanBo(String name){
        boolean found = false;
        for(CanBo cb : danhSachCanBo){
            if(cb.getName().equals(name)){
                danhSachCanBo.remove(cb);
            }
        }
        if (!found){
            System.out.println("Không tìm thấy cán bộ.");
        }else {
            System.out.println("Đã xóa cán bộ.");
        }
    }

    // e)
    public void thoatChuongTrinh(){
        System.exit(0);
    }

}
