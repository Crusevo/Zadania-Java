package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Zadanie5 {

   /** Napisać program, który pobiera od użytkownika ciąg liczb całkowitych. Pobieranie
    danych kończone jest podaniem wartości 0 (nie wliczana do danych). W następnej kolejności program powinien wyświetlić sumę największej oraz najmniejszej z
    podanych liczb oraz ich średnią arytmetyczną. */


   public static void zad5(){

       Scanner scanner = new Scanner(System.in);

       List<Integer> numberList = new ArrayList<>();

       double aritmeticSum = 0;

       boolean end = true;



       do {

           System.out.println("Podaj liczbę, liczby będą sumowane do chwili wpisania 0");

           int userNumber = scanner.nextInt();

           if (userNumber == 0){

               end = false;

           } else {

               numberList.add(userNumber);

               aritmeticSum += userNumber;

           }


       }while (end);


       Collections.sort(numberList);

       Integer minNumber = numberList.get(0);

       Integer maxNumber = numberList.get(numberList.size() - 1);

       int sumMaxAndMin = minNumber+maxNumber;

       double aritmeticTotal = aritmeticSum / numberList.size();



       System.out.println(sumMaxAndMin);

       System.out.println(aritmeticTotal);


   }
















}
