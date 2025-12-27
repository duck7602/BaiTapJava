package com.vti.entity.Assignment_04.Assignment_04_EX5;

public class TaiLieu {
    private int id;
    private String namePublisher;
    private int numberPublish;

    // create constructor
    public TaiLieu(int id, String namePublisher, int numberPublish){
        this.id = id;
        this.namePublisher = namePublisher;
        this.numberPublish = numberPublish;
    }

    // setter && getter
    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setNamePublisher(String namePublisher){
        this.namePublisher = namePublisher;
    }

    public String getNamePublisher(){
        return namePublisher;
    }

    public void setNumberPublish(int numberPublish){
        this.numberPublish = numberPublish;
    }

    public int getNumberPublish(){
        return numberPublish;
    }
}
