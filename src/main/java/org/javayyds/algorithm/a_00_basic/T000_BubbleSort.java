package org.javayyds.algorithm.a_00_basic;

import java.util.Arrays;

public class T000_BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, -17, -5, 38, 44, 1004};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void bubbleSort(int[] arr) {
        boolean swap;
        for (int i = arr.length -1; i > 0; i--) {
            swap = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] += arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] -= arr[j + 1];
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }
    }
}
