package solutions;

/**
 * 冒泡排序，稳定排序
 * <p>
 * 最优时间复杂度：O(n)，    数值递增排列，每个元素遍历一次，无需交换位置
 * 最坏时间复杂度：O(n * n)，数值递减排列，每次遍历元素，都要交换位置
 * 平均时间复杂度：O(n * n)
 * 空间复杂度：O(1)
 */
public class BubbleSort {
    public static void sort(int[] array) {
        if (array == null || array.length == 0) return;
        int length = array.length;

        // 外层：需要 length - 1次对比
        for (int i = 0; i < length - 1; i++) {
            // 内层：元素两两对比，并进行位置交换
            for (int j = 0; j < length - 1 - i; j++) {
                // 此元素比下一个元素更大，交换位置
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
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
