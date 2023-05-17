package org.example;

import java.util.Random;
import java.util.Scanner;

public class Zadanie6 {

    /** Gra w ”Za dużo, za mało”. Komputer losuje liczbę z zakresu 1 . . . 100, a gracz
     (użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych wartości. */

    public static void zad6(){

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        boolean end = true;

        int computerNumber = random.nextInt(100);

        int sumOfAttempts = 0;



        System.out.println("Komputer losuje liczbę z zakresu 1 . . . 100, a gracz (użytkownik) ma za zadanie odgadnąć, co to za liczba poprzez podawanie kolejnych wartości");

        System.out.println("Podaj liczbe z zakresu 1 . . . 100");

        do {


            int userNumber = scanner.nextInt();

            if (computerNumber > userNumber){

                System.out.println("Podaj większą liczbę");

                sumOfAttempts += 1;

            } else if (computerNumber < userNumber) {

                System.out.println("Podaj mniejszą liczbę");

                sumOfAttempts += 1;

            } else if (computerNumber == userNumber){

                System.out.println("Wygrałeś");

                sumOfAttempts += 1;

                end=false;


            }


        } while (end);

        System.out.println("Ilość prób " + sumOfAttempts);





    }



}
