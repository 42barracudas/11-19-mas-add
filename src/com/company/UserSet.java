package com.company;

/**
 * Created by Vitaliy on 11/26/2015.
 */
public class UserSet implements CopyInterface {
    private User[] mas;
    private int size;
    private int lastAddedPosition;

    //no parameters constructor with default values
    public UserSet() {
        this.size = 10;
        this.mas = new User[size];
        this.lastAddedPosition = 0;

    }

    // constructor with size parameter
    public UserSet(int size) {
        this.size = size;
        this.lastAddedPosition = 0;
    }

    // constructor with array as a parameter
    public UserSet(User[] mas) {
        this.size = mas.length;
        this.mas = new User[size];
        this.lastAddedPosition = 0;


    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(mas[i]);
        }

    }

    //@Override
    //public void add(User[] array) {
    //  System.out.println("code for copying array here");
        /* read elements from target array 'array'
        for (int i = 0, i<array.length, i++){
            return array[i];
        for (int j = 1, j<array.length, j++){
                if (array[i].Username && array[i].password != array[j].username && array[j].password){
                    mas[lastAddedPosition+1] = array[i];
                }
            }
        }
*/


    @Override
    public boolean add(User[] array) {
        System.out.println("code for copying elements from simonArray to set should be here (add. method in UserSet)");
        for (int i = 0; i < array.length; i++) {

            for (int j = 1; j < array.length; j++) {
                if (array[i].getUsername().equals(array[j].getUsername())) {
                    return false;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            mas[lastAddedPosition++] = array[i];
        }
        return true;
    }


    public User[] getMas() {
        return mas;
    }

    public void setMas(User[] mas) {
        this.mas = mas;
    }

    @Override
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


}





