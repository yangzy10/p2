package Bubble;

public class bubble {

    public static int[] bubbleAsc(int[] arr) {


        for (int m = 1; m <= arr.length - 1; m++) {


            for (int i = 0; i < arr.length - m; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
        return arr;
    }

    public static int[] bubbleDesc(int[] arr) {


        for (int m = 1; m <= arr.length - 1; m++) {


            for (int i = 0; i < arr.length - m; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
        return arr;
    }
}
