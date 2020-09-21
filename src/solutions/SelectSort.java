package solutions;

/**
 * 选择排序，非稳定排序
 * <p>
 * 最优时间复杂度：O(n * n)
 * 最坏时间复杂度：O(n * n)
 * 平均时间复杂度：O(n * n)
 * 空间复杂度：O(1)
 */
public class SelectSort {
    public static void sort(int[] array) {
        if (array == null || array.length <= 0) return;

        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(array, minIndex, i);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
