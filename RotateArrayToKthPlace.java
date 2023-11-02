package arrays;

import java.util.*;

public class RotateArrayToKthPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,9,8,7};
        int k = 2;
        int[] temp = new int[k];
        for (int i = 0; i <= k-1 ; i++) {
            temp[i] = arr[arr.length - k + i];
        }
        for (int i = arr.length-1; i > k-1; i--) {
            arr[i] = arr[i-k];
        }
        for (int i = 0; i < k; i++){
            arr[i] = temp[i];
        }
        System.out.println("Array after rotating by " + k + " places to the right: " + Arrays.toString(arr));
    }
}