package Array;

import java.util.ArrayList;
import java.util.Random;

public class Aarraylist {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++) {
            int e = random.nextInt(1, 100);
            list.add(e);
        }
        // list.add(55);
        System.out.println(list);
        int x = 55;
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == x) {
                System.out.println(i);
                flag = true;
            }
        }
        if (flag == false) {
            System.out.println("Element not found !!");
        }
    }
}
