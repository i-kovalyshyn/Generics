package main.java;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Collections;
import java.util.ListIterator;

public class Counter {
    public static void moneyCount(int money) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200, 500));
        Collections.sort(list, Collections.reverseOrder());
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Integer num = listIterator.next();
            int n = money / num;
            if (n != 0) {
                System.out.println(n + "*" + num + ";");
                money %= num;
                if (money == 0) break;
            }
        }


    }
}
