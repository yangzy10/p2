package DaysInFeb;

import java.util.Calendar;
import java.util.Scanner;
       //键入年份，输出这一年2月的天数
public class Demo {
    public static void main(String[] args) {
        System.out.print("请输入年份： ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);//设置日期为3月1日，年份由键盘输入，月数从0开始计算
        c.add(Calendar.DATE, -1);//日期向前推一天，date即为2月的天数。
        System.out.println(year+"年的2月共有"+c.get(Calendar.DATE)+"天。");
    }
}
