package com.company;

public class Main {

    public static void main(String[] args) {
        UserSet simonArray = new UserSet();
        UserSet felixArray = new UserSet();
        User simon = new User();
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
        System.out.println("");
        UserSet set = new UserSet();
        set.add(simonArray.getMas());
        set.print();        // code for copying elements from simonArray to set should be here (add. method in UserSet)
        System.out.println("");
        System.out.println("end of set array");

        }


    }

