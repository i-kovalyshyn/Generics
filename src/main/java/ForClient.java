package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class ForClient {
    static void clientTime() {

        long startT = System.currentTimeMillis();
        for (int i = 24565; i <= 35789; i++) {
            moneyCounter(i);
        }
        long endT = System.currentTimeMillis();
        long totalT = endT - startT;

        System.out.print("Execution time for calculating the money according to customer's request in the range of 24565 to 35789 is: " + totalT + "ms");
    }

    private static void moneyCounter(int money) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200, 500));
        list.sort(Collections.reverseOrder());
        for (Integer num : list) {
            int n = money / num;
            if (n != 0) {
                money %= num;
                if (money == 0) break;
            }
        }


    }
}
