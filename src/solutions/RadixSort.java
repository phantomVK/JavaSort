package solutions;

/**
 * 基数排序，稳定排序
 * <p>
 * 最优时间复杂度：O(d * (n + r))
 * 最坏时间复杂度：O(d * (n + r))
 * 平均时间复杂度：O(d * (n + r))
 * 空间复杂度：O(n + r)
 */
public class RadixSort {
    public static void sort(int[] array) {
        if (array == null) return;

        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }

        int maxDigit = 0;
        while (max != 0) {
            max = max / 10;
            maxDigit++;
        }

        int[][] buckets = new int[10][array.length];
        int base = 10;

        for (int i = 0; i < maxDigit; i++) {
            int[] bucketLen = new int[10];

            for (int value : array) {
                int bucket = (value % base) / (base / 10);
                buckets[bucket][bucketLen[bucket]] = value;
                bucketLen[bucket]++;
            }

            int k = 0;
            for (int l = 0; l < 10; l++) {
                for (int m = 0; m < bucketLen[l]; m++) {
                    array[k++] = buckets[l][m];
                }
            }

            base *= 10;
        }
    }
}
