package 泛型;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


//泛型的本质是【参数化类型】。
public class Demo01 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();//添加泛型string

        c.add("hello");
        c.add("world");
        c.add("java");
        c.add("100");

        Iterator<String> it = c.iterator();
        while (it.hasNext()){
            String s = it.next();//添加泛型后，程序就不需要强制转型了
            System.out.println(s);
        }
    }
}
