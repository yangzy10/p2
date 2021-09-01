package bubbleTest;

import java.lang.reflect.Array;
import java.util.Arrays;

public class demo {
    public static void main(String[] args) {
        int[] arr = {5,498,3,12,67,1,999};
        System.out.println("before: "+ Bubble.arraytoString.arraytoString(arr));
        System.out.println("after: "+ Bubble.arraytoString.arraytoString(Bubble.bubble.bubbleDesc(arr)));
        System.out.println("------------------------------------");
        ///////////////////////////////////////////////////////////////////////////////////////////////
        Arrays.sort(arr);

        System.out.println("after: "+ Bubble.arraytoString.arraytoString(arr));


    }


}
