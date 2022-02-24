package level1;

public class FindDecimal {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            answer += decimal(i);
        }
        return answer;
    }

    private static int decimal(int n) {
        int cnt = 0;
        System.out.println("n : " + n + ", sqrt : " + Math.sqrt(n));
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (cnt > 0) break;

            if (n%i == 0) cnt++;
        }

        if (cnt > 0) return 0;
        else return 1;
    }

    public static void main(String[] args) {
        int[] n = {
                10, 5
        };
        for (int i = 0; i < n.length; i++) {
            System.out.println(solution(n[i]));
        }
    }
}
