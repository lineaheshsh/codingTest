package level1;

public class DigitSum {
    public static int solution(int n) {
        int answer = 0;
        long start;
        long end;
        start = System.nanoTime();
        while (true) {
            answer += n%10;
            if(n<10)
                break;

            n=n/10;
            System.out.println("n : " + n + ", answer : " + answer);
        }
        end = System.nanoTime();
        System.out.println("수행시간: " + (end - start) + " ns");

        return answer;
    }

    public static void main(String[] args) {
        int[] n = {
                123,
                987
        };

        for (int i = 0; i < n.length; i++) {
            System.out.println(solution(n[i]));
        }
    }
}
