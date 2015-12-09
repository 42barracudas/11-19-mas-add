package com.company;

public class Main {

    public static void main(String[] args) {
        UserSet simonArray = new UserSet(); //declares an array simonArray of type NarrayList
        UserSet felixArray = new UserSet(); //declares an array felixArray of type NarrayList
        User simon = new User(); // new User
        simon.setPassword("hhhh");
        simon.setUsername("simon_username");
        User felix = new User();
        felix.setPassword("2231");
        felix.setUsername("felix_username");
        simonArray.add(0, simon);
        simonArray.add(1, felix);
        simonArray.add(2, simon);
        simonArray.add(3, felix);
        //simonArray.add(5,simon);

        simonArray.print();
        System.out.println("end of simonArray");
        UserSet set = new UserSet();
        //set.add(11, simon);
        set.add(simonArray.getMas());
        set.print();

        }


    }

