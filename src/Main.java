import solutions.*;

import java.util.Arrays;

/**
 * 稳定排序：插入排序、冒泡排序、归并排序、基数排序
 * 非稳定排序：希尔排序、堆排序、选择排序、快速排序
 */
public class Main {
    public static void main(String[] args) {
        bubbleSort();
        heapSort();
        insertSort();
        mergeSort();
        radixSort();
        selectSort();
        shellSort();
        quickSort();
    }

    private static void bubbleSort() {
        int[] array = getArray();
        BubbleSort.sort(array);
        System.out.println("冒泡排序: " + Arrays.toString(array));
    }

    private static void heapSort() {
        int[] array = getArray();
        HeapSort.sort(array);
        System.out.println("小堆排序: " + Arrays.toString(array));
    }

    private static void insertSort() {
        int[] array = getArray();
        InsertSort.sort(array);
        System.out.println("插入排序: " + Arrays.toString(array));
    }

    private static void mergeSort() {
        int[] array = getArray();
        MergeSort.sort(array);
        System.out.println("归并排序: " + Arrays.toString(array));
    }

    private static void radixSort() {
        int[] array = getArray();
        RadixSort.sort(array);
        System.out.println("基数排序: " + Arrays.toString(array));
    }

    private static void selectSort() {
        int[] array = getArray();
        SelectSort.sort(array);
        System.out.println("选择排序: " + Arrays.toString(array));
    }

    private static void shellSort() {
        int[] array = getArray();
        ShellSort.sort(array);
        System.out.println("希尔排序: " + Arrays.toString(array));
    }

    private static void quickSort() {
        int[] array = getArray();
        QuickSort.sortA(array, 0, array.length - 1);
        System.out.println("快速排序: " + Arrays.toString(array));

        int[] arrayB = getArray();
        QuickSort.sortB(arrayB, 0, arrayB.length - 1);
        System.out.println("快速排序: " + Arrays.toString(arrayB));
    }

    private static int[] getArray() {
        return new int[]{4, 3, 7, 5, 10, 9, 1, 56, 15, 6, 8, 2, 11, 6, 5, 20, 0, 3, 44, 38, 5, 47, 16, 36, 17, 24, 19, 50, 48};
    }
}
