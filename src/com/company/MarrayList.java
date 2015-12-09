package com.company;

/**
 * Created by Vitaliy on 11/19/2015.
 */
public class MarrayList {
    private int[] mas;
    private int size;

    public MarrayList() {
        this.size = 50;
        this.mas = new int[size];
    }

    public MarrayList(int size) {

        if (size < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.size = size;
        this.mas = new int[size];
    }

    public void add(int index, int number) {
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (index > size-1){
            int newSize = (int)(1.2*index)+index;
            int[] temp = new int[newSize];
                    //index + (index *100/20)];
            for (int i = 0; i < size; i++) {
                temp[i] = mas[i];
            }
            size = newSize;
            this.mas = temp;
        }
        this.mas[index] = number;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(mas[i]);
        }

    }
}
