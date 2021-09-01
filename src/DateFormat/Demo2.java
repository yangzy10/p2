package DateFormat;

import java.text.ParseException;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        String format1 = "yyyy年MM月dd日 HH:mm:ss";
        System.out.println(DateUtils.dateToString(date1, format1));

        String format2 = "yyyy年MM月dd日 HH:mm:ss";
        String myDate = "2021年08月23日 16:36:00";
        Date date2 = DateUtils.stringToDate(myDate,format2);
        System.out.println(date2);





    }


}
