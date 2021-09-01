package 泛型.通配符;


import java.util.ArrayList;
import java.util.List;

public class Demo01 {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        //<? extends T> 表示类型是T或其子类
        List<? extends Object> list5 = new ArrayList<Number>();
        //<? super T> 表示类型是T或其父类
        List<? super Integer> list6 = new ArrayList<Object>();


    }
}
