package Date0823;

import java.util.Date;

public class demo2 {
    public static void main(String[] args) {
        Date d1 = new Date();//当前时间

        //获取时间
        System.out.println(d1.getTime());//当前时间距离标准时间经过的毫秒值
        System.out.println(d1.getTime() * 1.0 / 1000 / 3600 / 24 / 365 + "年");//当前时间距离标准时间经过的年

        //设置时间
        //long time = 1000*60*60;
        long time = System.currentTimeMillis();//规定要设置的时间
        d1.setTime(time);//setTime设置时间
        System.out.println(d1);
    }
}
