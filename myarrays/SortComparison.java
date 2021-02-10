package myarrays;
import java.util.Arrays;
import java.util.Random;
public class SortComparison {
    public static void runSerialSort(int[] a) {
        Arrays.sort(a);
    }
    public static void runParallelSort(int[] a) {
        Arrays.parallelSort(a);
    }
    public static void main(String[] args) {
        Random r = new Random();
        int n = 10000000;
        int[] a = new int[n];
        int[] b = new int[n];
        long start = 0, end = 0;
        for (int i = 0; i < n; i++)
            a[i] = r.nextInt(1000);
        System.arraycopy(a, 0, b, 0, a.length);
        start = System.currentTimeMillis();
        runSerialSort(a);
        end = System.currentTimeMillis();
        System.out.println("Time elapsed for sort(): "+(end-start)+"ms");
        start = System.currentTimeMillis();
        runParallelSort(b);
        end = System.currentTimeMillis();
        System.out.println("Time elapsed parallelSort(): "+(end-start)+"ms");
    }
}