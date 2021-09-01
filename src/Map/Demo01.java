package Map;

import java.util.*;

public class Demo01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("001","tom");
        map.put("002","jerry");
        map.put("003","spike");

        System.out.println(map);
        Set<String> keySet = map.keySet();
        System.out.println(keySet);

        Collection<String> values = map.values();
        System.out.println(values);

    }
}
