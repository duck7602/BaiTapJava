package com.vti.backend.Assignment_05_Extra.Assignment_05_Extra_EX1;

/*1) Tạo 1 Class cha có tên là Car, bao gồm các thuộc tính và phương thức như sau:
∙ int speed;
∙ double regularPrice;
∙ String color;
∙ double getSalePrice();*/

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color) {
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public double getSalePrice(){
        return regularPrice*0.30;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}
