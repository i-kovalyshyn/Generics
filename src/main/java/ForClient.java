package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ListIterator;

public class ForClient {
    public static void clientTime() {


        long startT = System.currentTimeMillis();
        for (int i = 24565; i <= 35789; i++) {
            moneyCount2(i);
        }
        long endT = System.currentTimeMillis();
        long totalT = endT - startT;

        System.out.print("Execution time for calculation money  in the range of 24565 to 35789 is :" + totalT + "ms");
    }

    public static void moneyCount2(int money) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200, 500));
        Collections.sort(list, Collections.reverseOrder());
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer num = listIterator.next();
            int n = money / num;
            if (n != 0) {
                money %= num;
                if (money == 0) break;
            }
        }


    }
}
