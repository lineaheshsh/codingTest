package level1;

import java.util.*;

public class Reporter {

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        String[] distinct_report = Arrays.stream(report).distinct().toArray(String[]::new);

        Map<String, List<String>> result = new LinkedHashMap<>();
        for (int i=0; i<id_list.length; i++) {
            result.put(id_list[i], null);
        }

        Map<String, Integer> targetMap = new HashMap<>();
        for (int i=0; i<distinct_report.length; i++) {
            String declar = distinct_report[i].split(" ")[0];
            String target = distinct_report[i].split(" ")[1];

            targetMap.put(target, targetMap.getOrDefault(target, 0) + 1);
            List<String> temp = result.getOrDefault(declar, null);
            if (temp != null) {
                result.get(declar).add(target);
            } else {
                List<String> tempArr = new ArrayList<>();
                tempArr.add(target);
                result.put(declar, tempArr);
            }
        }

        for (int i=0; i<id_list.length; i++) {
            for (String key : targetMap.keySet()) {
                Integer value = targetMap.get(key);
                if (value >= k) {
                    List<String> tempArr = result.get(id_list[i]);
                    if (tempArr != null) {
                        for (int j=0; j<tempArr.size(); j++) {
                            if (key.equals(tempArr.get(j))) answer[i]++;
                        }
                    }
                }
            }
            System.out.println(answer[i]);
        }
//        System.out.println(result.toString());
//        System.out.println(targetMap.toString());

        return answer;
    }

    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] reporter = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k = 2;
//        String[] id_list = {"con", "ryan", "test"};
//        String[] reporter = {"ryan con", "ryan con", "ryan test", "ryan con"};
//        int k = 3;

        Arrays.toString(solution(id_list, reporter, k));
    }
}