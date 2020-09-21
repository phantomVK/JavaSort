package solutions;

/**
 * 插入排序，稳定排序
 * <p>
 * 最优时间复杂度：O(n)
 * 最坏时间复杂度：O(n * n)
 * 平均时间复杂度：O(n * n)
 * 空间复杂度：O(1)
 */
public class InsertSort {
    // 位移法
    public static void sort(int[] array) {
        if (array == null || array.length == 0) return;

        int length = array.length;
        for (int i = 1; i < length; i++) {
            int j = i - 1;
            int temp = array[i];
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    // 交换法
    public static void sortExchange(int[] array) {
        if (array == null || array.length == 0) return;

        int length = array.length;
        for (int i = 1; i < length; i++) {
            while (i != 0 && array[i - 1] > array[i]) {
                swap(array, i - 1, i);
                i--;
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
