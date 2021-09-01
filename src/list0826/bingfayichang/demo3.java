package list0826.bingfayichang;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class demo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        ListIterator<String> lit = list.listIterator();//列表迭代器不会出现并发异常，这和源代码有关。
        while (lit.hasNext()){
            String s = lit.next();
            if(s.equals("world")){
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}

