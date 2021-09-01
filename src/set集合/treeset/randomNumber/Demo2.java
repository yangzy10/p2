package set集合.treeset.randomNumber;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class Demo2 {
    public static void main(String[] args) {

        TreeSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int num = o2-o1;
                return num;
            }
        });
        Random r = new Random();
        while (set.size()<10){
            int number = r.nextInt(20)+1;
            set.add(number);
        }
        for (Integer i : set){
            System.out.println(i);
        }
    }
}
