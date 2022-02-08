package org.javayyds.algorithm.a_00_basic;

import java.util.Arrays;

public class T002_InsertSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, -17, -5, 38, 44, 1004};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr) {
        // todo
        int position, value;
        for (int i = 1; i < arr.length; i++) {
            position = i;
            value = arr[i];
            while (position > 0 && arr[position - 1] > value) {
                arr[position] = arr[position - 1];
                position--;
            }
            arr[position] = value;
        }
    }
}
