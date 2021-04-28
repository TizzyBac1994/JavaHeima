package Maopao;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("before-->" + Arrays.toString(arr));

        for (int j = 0; j < arr.length-1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {//-j better
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("after-->" + Arrays.toString(arr));

    }

//    public static String arrayToString(int[] arr) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("[");
//        for (int i = 0; i < stringBuilder.length(); i++) {
//            if (i == arr.length - 1) {
//                stringBuilder.append(arr[i]);
//            } else {
//                stringBuilder.append(arr[i] + ",");
//            }
//        }
//        stringBuilder.append("]");
//        String fs = stringBuilder.toString();
//        return fs;
//    }


}
