package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

 class Counter {
     static void moneySorterCounter(int money) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200, 500));
        list.sort(Collections.reverseOrder());
         for (Integer num : list) {
             int n = money / num;
             if (n != 0) {
                 System.out.println(n + "*" + num + ";");
                 money %= num;
                 if (money == 0) break;
             }
         }


    }
}
