package level1;

import java.util.HashMap;
import java.util.Map;

public class PY {
    public static boolean solution(String s) {
        boolean answer = true;
        String lowercaseToS = s.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < lowercaseToS.length(); i++) {
            map.put(lowercaseToS.charAt(i), map.getOrDefault(lowercaseToS.charAt(i), 0) + 1);
        }

        if (map.containsKey('p') && map.containsKey('y')) {
            if (map.get('p') != map.get('y')) answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] s = {
                "pPoooyY",
                "Pyy"
        };

        for (int i = 0; i < s.length; i++) {
            System.out.println(solution(s[i]));   
        }
    }
}
