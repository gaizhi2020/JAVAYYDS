package org.javayyds.algorithm.a_00_basic;

import java.util.Arrays;

public class T001_SelectSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, -17, -5, 38, 44, 1004};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectSort(int[] arr) {
        int min;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            if (i != min) {
                arr[min] += arr[i];
                arr[i] = arr[min] - arr[i];
                arr[min] -= arr[i];
            }
        }
    }
}
