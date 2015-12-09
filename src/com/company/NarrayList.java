package com.company;

/**
 * Created by Vitaliy on 11/19/2015.
 * <p>
 * This array contains elements of class User
 */


public class NarrayList {
    public User[] mas; //array of type User
    private int size;

    //constructor without parameters
    public NarrayList() {
        this.size = 50;
        this.mas = new User[size];
    }

    //constructor with parameter
    public NarrayList(int size) {
//checks if size is legit
        if (size < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.size = size;
        this.mas = new User[size];
    }

    //method to add elements to array
    public void add(int index, User myUser) {
        //check if index is legit
        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        //increase array size when index is more than size
        if (index > size - 1) {
            int newSize = (int) (1.2 * index) + index;
            User[] temp = new User[newSize];
            for (int i = 0; i < size; i++) {
                temp[i] = mas[i];
            }
            size = newSize;
            this.mas = temp;

        }
        this.mas[index] = myUser;
    }

    public void copy() {
        for (int i = 0; i < 3; i++) {
            return;
        }
    }

    //method to print elements
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(mas[i]);
        }

    }

    public User[] getMas() {
        return mas;
    }

    public void setMas(User[] mas) {
        this.mas = mas;
    }
}
