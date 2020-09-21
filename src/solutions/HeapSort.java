package solutions;

/**
 * 堆排序，非稳定排序
 * <p>
 * 最优时间复杂度：O(n * Log n)
 * 最坏时间复杂度：O(n * Log n)
 * 平均时间复杂度：O(n * Log n)
 * 空间复杂度：O(1)
 */
public class HeapSort {
    public static void sort(int[] array) {
        int length = array.length;

        // 从最后一个非叶子结点开始递减处理
        for (int i = length / 2 - 1; i >= 0; i--) {
            adjustHeap(array, i, length);
        }

        for (int i = length - 1; i > 0; i--) {
            swap(array, i);
            adjustHeap(array, 0, i);
        }
    }

    // 小顶堆
    private static void adjustHeap(int[] array, int parent, int length) {
        // 堆节点parent的值value
        int value = array[parent];

        // 处理节点parent的左子节点
        for (int i = parent * 2 + 1; i < length; i = i * 2 + 1) {
            // 如果 左子结点 < 右子结点，k指向 右子结点
            if (i + 1 < length && array[i] < array[i + 1]) {
                i++;
            }

            // 如果子节点大于父节点，将子节点值赋给父节点，不用进行交换
            if (value < array[i]) {
                array[parent] = array[i];
                parent = i;
                continue;
            }

            break;
        }

        array[parent] = value;
    }

    // 索引0 和 索引i 的数值交换
    private static void swap(int[] array, int i) {
        int temp = array[0];
        array[0] = array[i];
        array[i] = temp;
    }
}
