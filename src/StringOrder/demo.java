package StringOrder;

import java.util.Arrays;
import java.util.Collections;

public class demo {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";


        //使用sort降序排列
        String[] strArray1 = s.split(" ");
        Integer[] arr1 = new Integer[strArray1.length];
        for (int i = 0; i < strArray1.length; i++) {
            arr1[i] = Integer.valueOf(strArray1[i]);
        }

        //System.out.print(Bubble.arraytoString.arraytoString(Bubble.bubble.bubbleAsc(arr1)));
        Arrays.sort(arr1, Collections.reverseOrder());//不能直接使用int，要是用对应的类integer。
        System.out.print("Sort_Desc: “");

        for (int i = 0; i < arr1.length; i++) {
            if (i != arr1.length - 1) {
                System.out.print(arr1[i] + ",");
            } else {
                System.out.print(arr1[i]);
            }
        }
        System.out.println("“\n____________________________");
        //StringBuilder
        String[] strArray2 = s.split(" ");
        int[] arr2 = new int[strArray2.length];
        for (int i = 0; i < strArray2.length; i++) {
            arr2[i] = Integer.parseInt(strArray2[i]);
        }
        Arrays.sort(arr2);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                sb.append(arr2[i]);
            } else {
                sb.append(arr2[i] + ",");
            }
        }
        System.out.println("Stringbuilder_Asc: “"+sb+"”\n----------------------------");


    }
}
