package ru.cheb.lesson_7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] setInt1 = new int[5];
        setInt1[0] = 1;
        setInt1[1] = 123;
        setInt1[2] = 1213523;
        setInt1[3] = 765745;
        setInt1[4] = 235;

        String[] setString = new String[]{"Alice", "Ivan", "Anastasia", "Bogdan", "Maksim", "Varvara"};

//        for (int i = 0; i < setString.length; i++) {
//            System.out.println(setString[i]);
//        }

        for (String s : setString) {
            System.out.println(s);
        }

        int catAge = setInt1[0];
        int peopleAge = setInt1[1];


    }
}