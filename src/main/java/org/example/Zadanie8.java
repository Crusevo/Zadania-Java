package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie8 {


    /**  Napisać program, dla podanej liczby całkowitej wyświetla jej dzielniki.
     *  Przykładowo, dla liczby 21 dzielniki to: 1, 3, 7, 21.
     */


    public static void zad8(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe całkowitą");

        int userNumber = scanner.nextInt();

        for (int i = 1; i <= userNumber; i++){

            if (userNumber % i == 0) {

                System.out.println(i);


            }


        }











    }


}
