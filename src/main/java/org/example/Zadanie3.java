package org.example;

import java.util.Scanner;

public class Zadanie3 {

    /** Napisać program, który wczytuje od użytkownika liczbę całkowitą dodatnią n, a
    następnie wyświetla na ekranie wszystkie potęgi liczby 2 nie większe, niż podana
    liczba. */


    public static void zad3(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę");

        int userNumber = scanner.nextInt();

        int i =1;

        while (i<userNumber){


            System.out.println(i);


            i= i*2;


        }


    }



}
