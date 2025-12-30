package com.vti.backend.Assignment_05.Assignment_05_EX1;

/*
Question 1: Interface
Tạo một interface có tên INews bao gồm method void Display(), float Calculate().
Tạo một class News bao gồm thuộc tính:
ID (int), Title (String), PublishDate (String), Author (String),
Content (String) và AverageRate (float).
Tạo các setter và getter cho từng thuộc tính, riêng AverageRate thì chỉ có getter.

Implement các method trong interface INews như sau:
a) Method Display() sẽ in ra Title, PublishDate, Author,Content và AverageRate của tin tức ra console.
b) Method có tên Calculate() để thiết đặt thuộc tính
Khai báo một array có tên Rates kiểu int gồm 3 phần tử AverageRate là trung bình cộng của 3 phần tử của array Rates.
c) Tạo chương trình demo có tên là MyNews và tạo một menu lựa chọn gồm các mục sau:
                 ∙ Insert news
                 ∙ View list news
                 ∙ Average rate
                 ∙ Exit
Nếu người dùng chọn 1 từ bàn phím thì tạo một object của class News và nhập giá trị cho các thuộc tính Title, PublishDate, Author, Content sau đó yêu cầu người dùng nhập vào 3 đánh giá để lưu vào Rates.
Nếu người dùng chọn 2 từ bàn phím thì thực thi method Display().
Nếu người dùng chọn 3 từ bàn phím thì thực hiện method Calculate() để tính đánh giá trung bình, sau đó thực thi method Display().
Trường hợp người dùng chọn 4 thì sẽ thoát khỏi chương trình.
*/

public class News implements INews {
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averangeRate;

    private int[] rates = new int[3];

    // create constructor
    public News(int id, String title, String publishDate, String author, String content, int[] rates) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.rates = rates;
    }

    public News() {

    }

    // getter && setter
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverangeRate() {
        return averangeRate;
    }

    public int[] getRates() {
        return rates;
    }

    public void setRates() {
        this.rates = rates;
    }


    @Override
    public void display() {
        System.out.printf("Title: %s, Publish Date: %s, Content: %s, Averange Rate: %f %n", title, publishDate, content, averangeRate);
    }

    @Override
    public float calculate() {
        int sum = 0;
        for (int rate : rates) {
            sum += rate;
        }
        averangeRate = sum / 3;
        return averangeRate;
    }

    @Override
    public String toString() {
        return "New :"+ "\nID: " + id +
                ", Title: " + title +
                ", Publish Date: " + publishDate +
                ", Author: " + author +
                ", Content: " + content +
                ", Average Rate: " + String.format("%.2f", averangeRate);
    }
}
