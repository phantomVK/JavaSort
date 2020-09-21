package solutions;

/**
 * 希尔排序，非稳定排序
 * <p>
 * 最优时间复杂度：O(n)
 * 最坏时间复杂度：O(n的s次幂，1 < s < 2)
 * 平均时间复杂度：O(n * Log n)
 * 空间复杂度：O(1)
 */
public class ShellSort {
    public static void sort(int[] array) {
        if (array == null || array.length <= 0) return;

        int length = array.length;
        for (int gap = length >> 1; gap > 0; gap >>= 1) {
            for (int i = gap; i < length; i++) {
                for (int j = i; j - gap >= 0 && array[j - gap] > array[j]; j -= gap) {
                    swap(array, j - gap, j);
                }
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}