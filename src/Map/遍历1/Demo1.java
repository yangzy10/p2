package Map.遍历1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    //Map遍历方法1：
    //获取所有键的集合，用keySet方法实现；
    //遍历键的集合，获取到每一个键，用增强for实现；
    //根据键去找值，用get(Object ket)实现
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("001","tom");
        map.put("002","jerry");
        map.put("003","spike");

        Set<String> keySet = map.keySet();
        for(String k : keySet){
            String v = map.get(k);
            System.out.println(k+" , "+v);
        }
    }
}
