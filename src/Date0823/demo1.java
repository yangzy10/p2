package Date0823;

import java.util.Date;

public class demo1 {
    public static void main(String[] args) {
        //当前时间
        Date d1 = new Date();
        System.out.println(d1);

        //从标准时间起经过的毫秒数
        long date = 1000*60*60;
        Date d2 = new Date(date);
        System.out.println(d2);
    }
}
