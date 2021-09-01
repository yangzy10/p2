package DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {


    public static String dateToString(Date date,String format){
        SimpleDateFormat sdf1 = new SimpleDateFormat(format);
        String s1 = sdf1.format(date);
        return s1;
    }
    public static Date stringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf2 = new SimpleDateFormat(format);
        Date date = sdf2.parse(s);
        return date;
    }
}
