package com.vti.backend.Assignment_05_Extra.Assignment_05_Extra_EX1;


/*5) Tạo class MyOwnAutoShop có chứa phương thức main(), làm những điều sau:
a) Tạo 1 instance của class Sedan và khởi tạo tất cả các thuộc tính với giá trị thích hợp.
Sử dụng phương thức super(...) trong hàm khởi tạo để khởi tạo các thuộc tính của class cha.
b) Tạo 2 instance của class Ford và khởi tạo tất cả các thuộc tính với giá trị thích hợp.
Sử dụng phương thức super(...) trong hàm khởi tạo để khởi tạo các thuộc tính của class cha.
c) Tạo 1 instance của class Car và khởi tạo tất cả các thuộc tính với giá trị thích hợp.
d) Hiển thị giá sale của tất cả các instance.*/

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(20,20.5,"Blue",20);
        Ford ford = new Ford(30,30.5,"Red",2020,10);
        Ford ford2 = new Ford(30,30.5,"Red",2020,10);
        Car car = new Car(10,10.5,"red");
        System.out.println(sedan.getRegularPrice());;
        System.out.println(ford.getRegularPrice());;
        System.out.println(ford2.getRegularPrice());;
        System.out.println(car.getRegularPrice());;
    }
}
