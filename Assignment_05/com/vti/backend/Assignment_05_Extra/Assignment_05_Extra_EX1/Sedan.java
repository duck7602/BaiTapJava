package com.vti.backend.Assignment_05_Extra.Assignment_05_Extra_EX1;

/*4) Tạo 1 Class con của Class Car và có tên là Sedan, bao gồm các thuộc tính và
phương thức như sau:
∙ int length;
∙ double getSalePrice(); //Nếu length > 20 feet thì discount 5%, nếu không discount 10%*/

public class Sedan extends Car{
    private int length;

    public Sedan(int speed, double regularPrice, String color, int length) {
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if(length>20){
            return getRegularPrice()*0.05;
        }else {
            return getRegularPrice()*0.1;
        }
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
