package com.vti.entity.Assignment_04.Assignment_04_EX5;

public class CongNhan extends CanBo {
    private int rank;

    // create constructor
    public CongNhan(String name, int age, Gender gender, String address, int rank) {
        super(name, age, gender, address);
        setRank(rank);
    }

    // getter && setter
    public void setRank(int rank) {
        if (rank > 1 && rank < 10) {
            this.rank = rank;
        } else {
            System.out.println("Rank phải lớn 1 và nhỏ hơn 10.");
        }
    }

    public int getRank() {
        return rank;
    }


}
