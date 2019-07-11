package main.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many money you have: ");
        if (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (number >= 0) {
                Counter.moneySorterCounter(number);
                System.out.println("you have : " + number + "$");
            } else {
                System.out.println("You have entered a negative number!");
            }
        } else {
            System.out.println("You put incorrect data!");
        }
        sc.close();
        System.out.print("============================\n");
        ForClient.clientTime();
    }


}

