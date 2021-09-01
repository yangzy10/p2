package Map.遍历2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//遍历方法2：
//获取所有键值对的集合，用entrySet；
//遍历该集合，得到每一个键值对对象；
//根据键值对对象获得键和值：用getKey和getValue。
public class Demo2 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put("001","tom");
        map.put("002","jerry");
        map.put("003","spike");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> me : entrySet){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+" , "+value);
        }
    }
}
