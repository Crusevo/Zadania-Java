package org.example;

import java.util.Scanner;

public class Zadanie4 {

    /** Napisać program, który wczytuje liczby podawane przez użytkownika dotąd,
     * dopóki nie podana zostanie liczba 0.
     * Następnie wyświetlić sumę wszystkich podanych liczb. */



    public static void zad4(){

        Scanner scanner = new Scanner(System.in);

        int total = 0;

        boolean end =true;


        do{

            System.out.println("Podaj liczbę, liczby będą sumowane do chwili wpisania 0");

            int userNumber = scanner.nextInt();

            total += userNumber;

            if (userNumber == 0){

                end = false;

            }


        } while(end);


        System.out.println(total);


    }


}
