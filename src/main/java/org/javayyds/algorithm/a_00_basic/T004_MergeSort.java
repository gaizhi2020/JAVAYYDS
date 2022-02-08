package org.javayyds.algorithm.a_00_basic;

import java.util.Arrays;

public class T004_MergeSort {

    public static void main(String[] args) {
        int[] arr = new int[]{1, -17, -5, 38, 44, 1004};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr) {
        int[] temp = new int[arr.length];
        innerMergeSort(0, arr.length - 1, arr, temp);
    }

    private static void innerMergeSort(int low, int high, int[] arr, int[] temp) {
        if (low < high) {
            int mid = (low + high) / 2;
            innerMergeSort(low, mid, arr, temp);
            innerMergeSort(mid + 1, high, arr, temp);
            mergeSortArray(low, mid, high, arr, temp);
        }
    }

    private static void mergeSortArray(int low, int mid, int high, int[] arr, int[] temp) {
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            temp[k++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        for (i = 0; i < k; i++) {
            arr[low + i] = temp[i];
        }
    }
}
