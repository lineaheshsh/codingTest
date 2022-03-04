package level1;

public class LeastCommonMultipleGreatestCommonMultiple {
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int greateCommon = gcd(n, m);
        int leastCommon = lcm(n, m);

        answer[0] = greateCommon;
        answer[1] = leastCommon;
        return answer;
    }

    private static int gcd(int a, int b){ // 최대공약수
        if (a%b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }

    private static int lcm(int a, int b){ // 최소 공배수
        // 0이 아닌 두 수의 곱 / 두 수의 최대공약수
        return a * b / gcd(a,b);
    }

    public static void main(String[] args) {
        int[] n = {
                3,
                2
        };

        int[] m = {
                12,
                5
        };

        for (int i = 0; i < n.length; i++) {
            System.out.println(solution(n[i], m[i]));
        }
    }
}
