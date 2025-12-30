package com.vti.backend.Assignment_05_Extra.Assignment_05_Extra_EX1;

/*2) Tạo 1 Class con của Class Car và có tên là Truck, bao gồm các thuộc tính và phương thức như sau:
∙ int weight;
∙ double getSalePrice(); // nếu weight > 2000 thì discount 10%. Nếu
không thì discount 20%.*/

public class Truck extends Car {

    private int weight;

    public Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice(){
        if (weight>2000){
            return getRegularPrice()*0.1;
        }else {
            return getRegularPrice()*0.2;
        }
    }
}
