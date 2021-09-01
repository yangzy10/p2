package set集合.treeset.randomNumber;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<Integer>();//采用hashSet实现，是无序的

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
