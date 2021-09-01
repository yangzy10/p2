import java.util.Calendar;

public class calender {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        c.set(2048,11,11);
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年"+(month+1)+"月"+date+"日");
    }
}
