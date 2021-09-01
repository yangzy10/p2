package set集合;

import java.util.HashSet;

public class SetDemo2 {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        String ss = "通话";
        hs.add("重地");
        hs.add("通话");
        hs.add(ss);
        //即便二者哈希码相同，也会都输出。因为除了比较哈希值，还要比较内容。

        for (String s :hs){
            System.out.println(s);
        }
    }
}
