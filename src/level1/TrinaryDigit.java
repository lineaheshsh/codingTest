package level1;

public class TrinaryDigit {

    /**
     * 3진법 뒤집기
     * 정수를 3으로 나눠서 나머지 값
     * <p>
     * 문제내용 :
     * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
     *
     * @param n - 정수
     * @return 뒤집은 10진수
     */
    public static int solution(int n) {
        int answer = 0;
        int quotient = 0;   // 몫
        int remainder = 0;  // 나머지
        StringBuffer decimal = new StringBuffer(); // 3진법

        if (n > 3) {

            // 3진법 구하기
            while (true) {
                quotient = n / 3;
                remainder = n % 3;
                System.out.println(quotient);
                System.out.println(remainder);

                if (quotient < 3) {
                    decimal.append(remainder);
                    decimal.append(quotient);
                    break;
                } else {
                    n = quotient;
                    decimal.append(remainder);
                }
            }
        } else {
            decimal.append(n);
        }

        // 3진법을 10진수로 변경
        answer = Integer.parseInt(decimal.toString(), 3);

        return answer;
    }

    public static void main(String[] args) {
        int[] nArr = {
                45, 125, 1
        };

        for (int i = 0; i < nArr.length; i++) {
            System.out.println("#####################");
            System.out.println(solution(nArr[i]));
        }
    }
}
