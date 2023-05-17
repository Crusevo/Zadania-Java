package org.example;

import java.util.Scanner;

public class Zadanie1 {

/**    Napisać program, który pobiera od użytkownika liczbę całkowitą dodatnią,
 * a następnie wyświetla na ekranie kolejno wszystkie liczby niepatrzyste nie większe od
  podanej liczby. Przykład, dla 15 program powinien wyświetlić 1, 3, 5, 7, 9, 11, 13,
*/


    public static void zad1() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe");

        int userNumber = scanner.nextInt();

        int absUserNumber = Math.abs(userNumber);

        for(
                int i = 0;
                i<=absUserNumber;i++)

        {

            if (i % 2 == 1) {


                System.out.println(i);
            }

        }




    }



}
