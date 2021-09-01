package exception0825;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//编译时异常必须处理，使用try...catch...或者throw，如果采用throw，将来谁调用谁处理。
//运行时异常可以不处理，出现问题后需要回来修改代码。
public class demo1 {
    public static void main(String[] args) {
        System.out.println("start");
        try {
            //method();
            method2();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }

    private static void method() {

        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);//new ArrayIndexOutOfBoundsException();


    }

    private static void method2() throws ParseException {
        String s = "2012-12-21";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(s);//编译时异常，必须处理，否则无法完成编译。
        System.out.println(d);
    }
}

