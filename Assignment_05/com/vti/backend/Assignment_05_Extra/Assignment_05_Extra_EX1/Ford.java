package com.vti.backend.Assignment_05_Extra.Assignment_05_Extra_EX1;

/*3) Tạo 1 Class con của Class Car và có tên là Ford, bao gồm các thuộc tính và
phương thức như sau:
∙ int year;
∙ int manufacturerDiscount;
∙ double getSalePrice(); // Lấy giá sale từ Class Car, sau đó trừ đi manufacturerDiscount.*/

public class Ford extends Car{

    private int year;
    private int manufacturerDiscount;
    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getRegularPrice() {
        if(getManufacturerDiscount()<super.getRegularPrice()){
        return super.getRegularPrice()- getManufacturerDiscount();}
        else {
            return 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getManufacturerDiscount() {
        return manufacturerDiscount;
    }

    public void setManufacturerDiscount(int manufacturerDiscount) {
        this.manufacturerDiscount = manufacturerDiscount;
    }
}
