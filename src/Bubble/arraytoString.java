package Bubble;

public class arraytoString {

    public static String arraytoString(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for(int i = 0 ; i < arr.length ; i++){
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
