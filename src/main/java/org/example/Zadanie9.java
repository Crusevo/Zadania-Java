package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie9 {

    /**
     * Napisać program, który sprawdza, czy podana liczba całkowita n, n > 1, jest
     * liczbą pierwszą.
     */




    public static void zad9(){


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe całkowitą");

        int userNumber = scanner.nextInt();

        List<Integer> integerList = new ArrayList<>();

        for (int i = 1; i <=userNumber; i++){

            if (userNumber % i == 0){

                integerList.add(i);



            }

        }

        if (integerList.size() == 2){

            System.out.println("Podana przez Ciebie liczba jest liczbą pierwszą - " + userNumber);

        } else {

            System.out.println("To nie jest liczba pierwsza");

        }




    }




}
