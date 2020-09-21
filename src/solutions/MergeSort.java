package solutions;

import java.util.Arrays;

/**
 * 归并排序，稳定排序
 * <p>
 * 最优时间复杂度：O(n * Log n)
 * 最坏时间复杂度：O(n * Log n)
 * 平均时间复杂度：O(n * Log n)
 * 空间复杂度：O(n)
 */
public class MergeSort {
    public static void sort(int[] array) {
        if (array == null || array.length < 1) return;
        int[] result = sortInner(array);
        System.arraycopy(result, 0, array, 0, array.length);
    }

    private static int[] sortInner(int[] array) {
        if (array.length <= 1) return array;

        int num = array.length >> 1;
        int[] left = Arrays.copyOfRange(array, 0, num);
        int[] right = Arrays.copyOfRange(array, num, array.length);
        return mergeTwoArray(sortInner(left), sortInner(right));
    }

    private static int[] mergeTwoArray(int[] a, int[] b) {
        int aIndex = 0;
        int aLength = a.length;

        int bIndex = 0;
        int bLength = b.length;

        int index = 0;
        int[] result = new int[aLength + bLength];

        while (aIndex < aLength && bIndex < bLength) {
            result[index++] = (a[aIndex] <= b[bIndex]) ? a[aIndex++] : b[bIndex++];
        }

        while (aIndex < aLength) result[index++] = a[aIndex++];
        while (bIndex < bLength) result[index++] = b[bIndex++];

        return result;
    }
}
