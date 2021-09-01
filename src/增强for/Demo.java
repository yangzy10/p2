package 增强for;

import java.util.ArrayList;
import java.util.List;
//增强型for循环
//内部继承了迭代器，注意并发异常
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        String[] string = {"hello","world","java"};
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("java");

        for(int i : arr){
            System.out.println(i);
        }
        System.out.println("-------");
        for(String i : string){
            System.out.println(i);
        }
        System.out.println("-------");
        for(String i : list){
            System.out.println(i);
        }
        System.out.println("------");
        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);
            if(s.equals("world")){
                list.add("javaee");
            }
        }
        System.out.println(list);


    }
}
