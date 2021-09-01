package 集合0825;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class demo1 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("hello");
        c.add("world");
        c.add("java");
        System.out.println(c);

        Iterator<String> it = c.iterator();//迭代器


        while(it.hasNext()) {//判断是否有元素
            System.out.println(it.next());
        }


    }
}
