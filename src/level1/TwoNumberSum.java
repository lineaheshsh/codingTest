package level1;

public class TwoNumberSum {
    public static long solution(int a, int b) {
        long answer = 0;
        if (a==b) return a;

        int start = a < b ? a : b;
        int end = a > b ? a : b;

        for (int i=start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {
                3,
                3,
                5
        };

        int[] b = {
                5,
                3,
                3
        };

        for (int i = 0; i < a.length; i++) {
            System.out.println(solution(a[i], b[i]));
        }
    }
}
