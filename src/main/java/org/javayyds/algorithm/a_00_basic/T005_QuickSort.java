package org.javayyds.algorithm.a_00_basic;

import java.util.Arrays;

public class T005_QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, -17, -5, 38, 44, 1004};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {
        qSort(0, arr.length - 1, arr);
    }

    private static void qSort(int low, int high, int[] arr) {
        if (low < high) {
            int index = partition(low, high, arr);
            qSort(low, index -1, arr);
            qSort(index + 1, high, arr);
        }
    }

    private static int partition(int low, int high, int[] arr) {
        int pivot = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivot) high--;
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot) low++;
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }
}
