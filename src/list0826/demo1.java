package list0826;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");


        System.out.println(list.get(0));
        System.out.println(list.get(1));

    }
}
