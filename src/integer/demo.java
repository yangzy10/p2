package integer;

public class demo {
    public static void main(String[] args) {

        //int to string
        //1.
        int num = 100;
        String s1 = "" + num;
        System.out.println(s1);
        //2.
        int num2 = 111;
        String s2 = String.valueOf(num2);
        System.out.println(s2);


        //String to Int
        //1. String ---- integer ------ int
        String sss = "123";
        Integer i1 = Integer.valueOf(sss);//string to integer
        int y = i1.intValue();//integer to int
        System.out.println(y);
        //2.
        String s = "100";
        int x = Integer.parseInt(s);
        System.out.println(x);


    }


}
