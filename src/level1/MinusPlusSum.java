package level1;

import java.util.Arrays;

public class MinusPlusSum {
    public static int solution(int[] absolutes, boolean[] signs) {

        for (int i=0; i<absolutes.length; i++) {
            if (!signs[i]) absolutes[i] = absolutes[i] * -1;
        }
        return Arrays.stream(absolutes).sum();
    }

    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true,false,true};
        System.out.println(solution(absolutes, signs));
    }
}
