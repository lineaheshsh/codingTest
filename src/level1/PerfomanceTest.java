package level1;

import java.util.Arrays;
import java.util.Random;

public class PerfomanceTest {
    public static void main(String[] args) {
        int[] arr = new int[100];
        long start;
        long end;
        Random rd = new Random();

        // init
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100) + 1;
        }

        // 1단계 for-loop
        int max_value = 0;
        start = System.nanoTime();
        for (int i=0; i<arr.length; i++) {
            if (max_value < arr[i]) max_value = arr[i];
        }
        end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
        System.out.println("1단계 max : " + max_value);

        start = System.nanoTime();
        max_value = Arrays.stream(arr).max().getAsInt();
        end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");
        System.out.println("2단계 max : " + max_value);
    }
}
