package DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class demo1 {
    public static void main(String[] args) throws ParseException {
        //格式化：从date到string（给定标准格式date，以特定的格式输出string）
        Date d = new Date();
        //SimpleDateFormat sdf = new SimpleDateFormat();//默认：2021/8/23 下午4:11
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s = sdf.format(d);
        System.out.println(s);

        //解析：从string到date（给定string和格式，解析出标准格式date）
        String ss = "2048-08-09 11:11:11";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = sdf2.parse(ss);
        System.out.println(d2);
    }


}
