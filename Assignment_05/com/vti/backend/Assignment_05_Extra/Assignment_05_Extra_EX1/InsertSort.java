package com.vti.backend.Assignment_05_Extra.Assignment_05_Extra_EX1;

public class InsertSort extends SequenceNumber implements Sort {

    public InsertSort(int n) {
        super(n);
    }

    @Override
    public void sort() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }
}

