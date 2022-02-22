package level1;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
    public static String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){
                if(s1.charAt(n) > s2.charAt(n)) return 1;
                else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
                else if(s1.charAt(n) < s2.charAt(n)) return -1;
                else return 0;
            }
        });

        return strings;
    }

    public static void main(String[] args) {
        String[][] strings = {
                {"sun", "bed", "car"},
                {"abce", "abcd", "cdx"}
        };

        int[] n = {
                1,
                2
        };

        for (int i = 0; i < strings.length; i++) {
            System.out.println("###################");
            solution(strings[i], n[i]);
        }
    }
}
