package level1;

public class Colatz {
    public static int solution(int num) {
        int answer = 0;
        int cnt = 1;

        if (num == 1) {
            return 1;
        } else {
            answer = colatz(num, cnt);
        }

        return answer;
    }

    private static int colatz(int num, int cnt) {
        if (cnt == 500) return -1;
        else if (num == 1) return cnt;

        if (num % 2 == 0) {
            num = num / 2;
        } else {
            num = (num * 3) + 1;
        }


        System.out.println("1 : " + num + ", " + cnt);
        if (num > 1) {
            cnt++;
            colatz(num, cnt);
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] n = {
                6,
//                16,
//                626331
        };

        for (int i = 0; i < n.length; i++) {
            System.out.println(solution(n[i]));
        }
    }
}
