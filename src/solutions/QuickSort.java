package solutions;

/**
 * 快速排序，非稳定排序
 * <p>
 * 最优时间复杂度：O(n * Log n)
 * 最坏时间复杂度：O(n * n)
 * 平均时间复杂度：O(n * Log n)
 * 空间复杂度：O(1)
 */
public class QuickSort {
    public static void sortA(int[] array, int low, int high) {
        if (array == null || array.length <= 0 || low >= high) return;

        int left = low;
        int right = high;
        int pivot = array[left];

        while (left < right) {
            while (left < right && pivot <= array[right]) right--;
            array[left] = array[right];

            while (left < right && array[left] <= pivot) left++;
            array[right] = array[left];
        }

        array[left] = pivot;
        sortA(array, low, left - 1);
        sortA(array, left + 1, high);
    }

    public static void sortB(int[] array, int low, int high) {
        if (array == null || array.length <= 0 || low >= high) return;

        int left = low;
        int right = high;
        int pivot = array[left];

        while (left < right) {
            while (left < right && pivot <= array[right]) right--;
            while (left < right && array[left] <= pivot) left++;
            if (left < right) swap(array, left, right);
        }

        swap(array, low, left);
        sortB(array, low, left - 1);
        sortB(array, left + 1, high);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
