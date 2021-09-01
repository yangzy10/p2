package set集合.linkedhashSet;

import java.util.LinkedHashSet;

//特点：set接口迭代次序可预测；【链表保证元素有序】；哈希表保证无重复元素
public class Demo1 {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("hello");
        set.add("world");
        set.add("java");
        set.add("world");

        for (String s : set){
            System.out.println(s);
        }
    }
}
