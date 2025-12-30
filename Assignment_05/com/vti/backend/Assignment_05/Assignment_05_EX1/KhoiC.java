package com.vti.backend.Assignment_05.Assignment_05_EX1;

public class KhoiC extends ThiSinh{
    private float literature;
    private float history;
    private float geography;

    public KhoiC(int id, String name, String address, int level, float literature, float history, float geography) {
        super(id, name, address, level);
        this.geography=geography;
        this.history=history;
        this.literature=literature;
    }

    public KhoiC(){
        super();
    }

    // Getter & Setter
    public float getliterature() {
        return literature;
    }

    public void setliterature(float literature) {
        this.literature = literature;
    }

    public float gethistory() {
        return history;
    }

    public void sethistory(float history) {
        this.history = history;
    }

    public float getgeography() {
        return geography;
    }

    public void setgeography(float geography) {
        this.geography = geography;
    }

    @Override
    public String toString() {
        return "KhoiC{" +
                "literature=" + literature +
                ", history=" + history +
                ", geography=" + geography +
                "} " + super.toString();
    }
}
