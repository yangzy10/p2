package set集合.treeset;

import java.util.TreeSet;

public class Demo01 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(10);
        ts.add(40);
        ts.add(30);
        ts.add(50);
        ts.add(20);
        ts.add(30);

        for (Integer i : ts){
            System.out.println(i);//结果按照从小到大的顺序排序。这被称作自然排序。结果也不包含重复的信息。
        }
    }
}