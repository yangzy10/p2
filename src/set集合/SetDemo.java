package set集合;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();//hashSet对迭代顺序不做任何保证

        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");

        for(String s : set){
            System.out.println(s);//只输出一个world。这说明hashSet是不包含重复元素的集合
        }
        System.out.println("hello".hashCode());

    }
}
