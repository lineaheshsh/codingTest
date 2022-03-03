package level1;

public class Colatz {
    public static int solution(int num) {
        int answer = 0;
        long numToLong = (long) num;
        int cnt = 1;

        if (numToLong == 1) {
            return 1;
        } else {
            while (cnt <= 500) {

                if (numToLong % 2 == 0) {
                    numToLong = numToLong / 2;
                } else {
                    numToLong = (numToLong * 3) + 1;
                }

                if (numToLong == 1) break;
                cnt++;
            }
        }

        if (cnt >= 500) return -1;
        else answer = cnt;

        return answer;
    }

    public static void main(String[] args) {
        int[] n = {
                6,
                16,
                626331
        };

        for (int i = 0; i < n.length; i++) {
            System.out.println(solution(n[i]));
        }
    }
}
