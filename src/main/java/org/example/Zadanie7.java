package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zadanie7 {

    /**Napisać program, który pobiera od użytkownika liczbę całkowitą, a następnie:
     • oblicza sumę cyfr tej liczby,
     • stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej
     cyfr nieparzystych.*/


     public static void zad7() {


         Scanner scanner = new Scanner(System.in);

         System.out.println("Podaj liczbę całkowitą");

         String userNumber = scanner.nextLine();

         String[] split = userNumber.split("");

         List<String> strings = Arrays.stream(split).toList();

         double total = 0;

         double arithmeticEven = 0;
         List<Double> arithmeticEvenDenominator = new ArrayList<>();

         double arithmeticOdd = 0;
         List<Double> arithmeticOddDenominator = new ArrayList<>();

         for( int i = 0; i< strings.size(); i++){

             double number = Double.parseDouble(strings.get(i));


             total += number;

             if (number % 2 == 0){

                 arithmeticEven += number;
                 arithmeticEvenDenominator.add(number);

             } else {

                 arithmeticOdd +=number;
                 arithmeticOddDenominator.add(number);

             }


         }



         System.out.println("Średnia arytmetyczna liczb nie parzystych: " + (arithmeticOdd / arithmeticOddDenominator.size()));

         System.out.println("Średnia arytmetyczna liczb parzystych: " + (arithmeticEven / arithmeticEvenDenominator.size()));

         System.out.println("Suma cyfr: "+total);












     }

}
