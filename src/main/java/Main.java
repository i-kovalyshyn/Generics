package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Enter how many money you have: ");
        if (sc.hasNextInt() && sc.nextInt() >= 0) {
            int number = sc.nextInt();
            if (number >= 24565 && number <= 35789) {
                long startT = System.currentTimeMillis();
                Counter.moneyCount(number);
                long endT = System.currentTimeMillis();
                long totalT = endT - startT;
                System.out.println("Execution time is:" + totalT + "ms");
            } else Counter.moneyCount(number);
            System.out.println("you have : " + number + "$");
        } else {
            System.out.println("You put incorrect data!");
        }

        sc.close();

        /**Даний метод що нижче при вводі значення string вибиває "Exception in thread "main" java.util.InputMismatchException"
         * я його залишив для наглядності
         *
         * int number;
         do{
         System.out.print("Enter how many money you have: ");
         while (!sc.hasNextInt()) {
         System.out.println("You put incorrect data! Enter onsmore");
         sc.nextInt();
         }
         number=sc.nextInt();
         } while (number <=0);
         if (number >= 24565 && number <= 35789) {
         long startT = System.currentTimeMillis();
         Counter.moneyCount(number);
         long endT = System.currentTimeMillis();
         long totalT = endT - startT;
         System.out.println("Execution time is:" + totalT + "ms");
         } else Counter.moneyCount(number);
         System.out.println("you have : " + number + "$");
         */

    }

}

