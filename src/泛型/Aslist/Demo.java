package 泛型.Aslist;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("hello", "world", "java");//大小固定的列表，可改，不可增删
        //list1.add("javaee");
        //list1.remove("java");
        list1.set(1,"javaee");
        System.out.println(list1);

        List<String> list2 = List.of("hello", "world", "java");//不可变集合，不可增删改
        //list2.add("javaee");
        //list2.remove("java");
        //list2.set(1,"javaee")
        System.out.println(list2);

        Set<String> list3 = Set.of("hello", "world", "java");//set不可增删改，不可重复
        //list3.add("javaee");
        //list3.remove("java");
        //list3.set(1,"javaee")
        System.out.println(list3);
    }
}
