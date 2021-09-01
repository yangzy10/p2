package Bubble;

public class demo {
    public static void main(String[] args) {

        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("before: " + arraytoString.arraytoString(arr));

        //bubbleAsc

       /* //first time

        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("first time: "+arraytoString.arraytoString(arr));
        the largest(smallest, when desc) number will appear at the last place

        //second time
        for(int i = 0 ; i < arr.length - 2 ; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("second time: "+arraytoString.arraytoString(arr));
        the 2nd largest number will appear at the 2nd last place

        //third time
        for(int i = 0 ; i < arr.length - 3 ; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("third time: "+arraytoString.arraytoString(arr));

        //4th time
        for(int i = 0 ; i < arr.length - 4 ; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("4th time: "+arraytoString.arraytoString(arr));

        //.......

        //n_th time
        for(int i = 0 ; i < arr.length - n ; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        System.out.println("nth time: "+arraytoString.arraytoString(arr));*/

        System.out.println("bubble Asc: " + arraytoString.arraytoString(bubble.bubbleAsc(arr)));
        System.out.println("bubble Desc: " + arraytoString.arraytoString(bubble.bubbleDesc(arr)));


    }


}
