package list0826.bingfayichang;

import java.util.*;

public class bingfayichng {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("hello");
        list.add("world");
        list.add("java");

        /*Iterator<String> it = list.iterator();迭代器方法会产生并发异常，不能用
        while (it.hasNext()){
            String s = it.next();
            if (s.equals("world")){
                list.add("javaee");
            }
        }*/
        /*for (int i = 0; i < list.size(); i++) {//使用for循环则不会出错
            String s = list.get(i);
            if (s.equals("java")) {
                list.add(list.indexOf("java"), "javaee");
                list.remove("java");
            }
            System.out.println(list);
        }*/

        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext())//正向遍历
        {
            String s = lit.next();
            System.out.println(s);
        }

        System.out.println("-------");

        while (lit.hasPrevious()){//逆向遍历（少用）
            String s = lit.previous();
            System.out.println(s);
        }

    }
}
