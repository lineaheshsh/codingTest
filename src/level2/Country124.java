package level2;

public class Country124 {
//    public static String solution(int n) {
//        String answer = "";
//        int quotient = n;
//        int remainder = -1;
//
//        while (true) {
//            remainder = quotient % 3;  // 나머지
//            quotient = quotient / 3;   // 몫
//
//            if (remainder == 0) {
//                answer = "4" + answer;
//                quotient--;
//            } else if (remainder == 1) {
//                answer = "1" + answer;
//            } else if (remainder == 2) {
//                answer = "2" + answer;
//            }
//
//            if (quotient == 0) break;
//        }
//        return answer;
//    }

    public static String solution(int n) {
        String[] num = {"4","1","2"};
        String answer = "";

        while(n > 0){
            System.out.println(n);
            answer = num[n % 3] + answer;
            n = (n - 1) / 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}
