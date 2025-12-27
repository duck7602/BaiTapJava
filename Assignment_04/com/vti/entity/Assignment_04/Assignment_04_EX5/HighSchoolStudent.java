package com.vti.entity.Assignment_04.Assignment_04_EX5;

public class HighSchoolStudent extends Student {
    private String clazz;
    private String desiredUniversity;

    // create constructor

    public HighSchoolStudent(String name, int id, String clazz, String desiredUniversity) {
        super(name, id);
        this.clazz = clazz;
        this.desiredUniversity = desiredUniversity;
    }

    // getter && setter
    public void setClazz(String clazz) {
        this.clazz = clazz;
    }


    public String getClazz() {
        return clazz;
    }

    public void setDesiredUniversity(String desiredUniversity) {
        this.desiredUniversity = desiredUniversity;
    }

    public String getDesiredUniversity() {
        return desiredUniversity;
    }
}
