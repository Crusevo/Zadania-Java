package org.example;

import java.util.Scanner;

public class Zadanie2 {

    /** Napisać program pobierający od użytkownika dwie liczby całkowite A oraz B,
    A < B, a następnie wyznaczający sumę ciągu liczb od A do B, czyli sumę ciągu
            (A, A + 1, . . . , B). Obliczenia należy wykonać trzykrotnie stosując kolejno pętle:
            while, do-while, for.

    */


    public static void zad2For(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");

        int firstUserNumber = scanner.nextInt();

        System.out.println("Podaj drugą liczbę, druga liczba musi być większa od poprzedniej");

        int secondUserNumber = scanner.nextInt();

        int total = 0;

        for (int i=firstUserNumber; i<=secondUserNumber;i++){

            total += i;



        }

        System.out.println(total);


    }

    public static void zad2While(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");

        int firstUserNumber = scanner.nextInt();

        System.out.println("Podaj drugą liczbę, druga liczba musi być większa od poprzedniej");

        int secondUserNumber = scanner.nextInt();

        int total = 0;

        int i =0;


        while(firstUserNumber<=secondUserNumber){


            total += firstUserNumber;

            firstUserNumber++;

        }


        System.out.println(total);


    }



    public static void zad2DoWhile(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę");

        int firstUserNumber = scanner.nextInt();

        System.out.println("Podaj drugą liczbę, druga liczba musi być większa od poprzedniej");

        int secondUserNumber = scanner.nextInt();

        int total = 0;

        do{

            total += firstUserNumber;

            firstUserNumber++;




        } while (firstUserNumber<=secondUserNumber);


        System.out.println(total);







    }








}
