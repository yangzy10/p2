package unbox;

public class demo {
    public static void main(String[] args) {
        //装箱：把基本数据类型转为对应的包装类类型。
        Integer i = Integer.valueOf(100);//通过调方法实现装箱

        Integer ii = 100;//JDK5以上，自动装箱

        //拆箱：把包装类类型转换为对应的基本类型。
        ii = ii.intValue() + 200;//手动拆箱
        ii += 200;//自动拆箱，再装箱。
        System.out.println(ii);

        //在使用包装类的时候，最好先进行null的判断。
        Integer iii = null;//如果直接进行操作会报错。
        if (iii != null) {
            iii += 300;
        }else{
            iii = Integer.valueOf(0);
            iii += 300;
        }
        System.out.println(iii);

    }
}
