package level2;

public class StringZip {
    public static int solution(String s) {
        int answer = 0;
        String result = "";
        if (s.length() % 2 == 0) {
            int len = s.length();
            int mod = len / 2;

            String prev = s.substring(0, mod);
            String last = s.substring(mod, len);

            if (prev.equals(last)) result = "2" + prev;
            else {
                int sameCnt = 0;
                for (int i = 1; i < s.length() / 2; i++) {
                    System.out.println("###########################################################");
                    System.out.println("");
                    for (int j = 0; j < s.length(); j+=i) {
                        System.out.println("######### j = [" + j + "], i = [" + (j+i) + "]");
                        if (j+i < s.length()) {
                            String temp = s.substring(j,j+i);
                            System.out.println("temp = [" + temp + "]");
                        } else {
                            String temp = s.substring(j, s.length());
                            System.out.println("temp = [" + temp + "]");
                        }
                    }
                }
            }
        } else {

        }

        answer = result.length();
        return answer;
    }

    public static void main(String[] args) {
        String[] s = {
                "aabbaccc"
//                "aabbaabb"
        };

        for (int i = 0; i < s.length; i++) {
            System.out.println(solution(s[i]));
        }
    }
}
