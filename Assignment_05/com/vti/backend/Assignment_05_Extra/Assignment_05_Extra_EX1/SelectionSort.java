package com.vti.backend.Assignment_05_Extra.Assignment_05_Extra_EX1;

public class SelectionSort extends SequenceNumber implements Sort {

    public SelectionSort(int n) {
        super(n);
    }

    @Override
    public void sort() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}


