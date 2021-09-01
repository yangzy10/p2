package xingcan;

import java.util.Scanner;

public class demo {

    public static void main(String[] args) {

    cat c = new cat("tom");
    cat d = new cat("jerry");

    catOperator co = new catOperator();

       while(true) {
           Scanner sc = new Scanner(System.in);
           int select = sc.nextInt();
           switch (select) {
               case 1:
                   co.useJump(c);
                   break;
               case 2:
                   co.useJump(d);
                   break;
               default:
                   System.out.println("no cats found!");
                   System.exit(0);
           }

       }





}
}
