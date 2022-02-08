public class StringZipTest {

    public static int solution(String s) {
        int answer = 0;
        if (s.length() > 1 && s.length() <= 1000) {
            for (int i=1; i<=(s.length()/2); i++) {
//                System.out.println("i : " + i);
                for (int j=0; j<s.length(); j++) {
                    String temp = s.substring(j, j+i);
                    System.out.println(temp);
//                    System.out.println("j : " + j);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        String s = "aabbaccc";
        System.out.println(solution(s));
    }
}
