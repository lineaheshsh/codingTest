package level1;

import java.util.*;
import java.util.stream.Collectors;

public class FailureRate {
    public final class Constants {

        public static final double ZERO_VALUE = 0.0;
    }

    /**
     * @param N      -> 스테이지 수
     * @param stages -> 현재 사용자들의 스테이지 정보
     * @return
     */
    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int maxValue = stages.length; // 최대 인원 수

        Map<Integer, Integer> stagesMap = Arrays.stream(stages).boxed().collect(Collectors.groupingBy(e -> e,
                Collectors.reducing(0, e -> 1, Integer::sum)));

        // 실패율 구하기
        Map<Integer, Double> resultMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            if (stagesMap.containsKey(i)) {
                resultMap.put(i, ((double) stagesMap.get(i) / (double) maxValue) * 100.0);
                maxValue = maxValue - stagesMap.get(i);
            } else {
                resultMap.put(i, Constants.ZERO_VALUE);
            }
        }

        // Map.Entry 리스트 작성
        List<Map.Entry<Integer, Double>> list_entries = new ArrayList<>(resultMap.entrySet());
        // 비교함수 Comparator를 사용하여 내림차순으로 정렬
        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Double>>() {
            public int compare(Map.Entry<Integer, Double> obj1, Map.Entry<Integer, Double> obj2) {
                // 내림차순 정렬
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        int i=0;
        for(Map.Entry<Integer, Double> entry : list_entries) {
            answer[i++] = entry.getKey();
        }
        return answer;
    }

    // 3,4,2,1,5

    /**
     * 1 번 스테이지 실패율 : 1/8
     * 2번 스테이지에는 총 7명의 사용자가 도전했으며, 이 중 3명의 사용자가 아직 클리어하지 못했다. 따라서 2번 스테이지의 실패율은 다음과 같다.
     * <p>
     * 2 번 스테이지 실패율 : 3/7
     * 마찬가지로 나머지 스테이지의 실패율은 다음과 같다.
     * <p>
     * 3 번 스테이지 실패율 : 2/4
     * 4번 스테이지 실패율 : 1/2
     * 5번 스테이지 실패율 : 0/1
     * 각 스테이지의 번호를 실패율의 내림차순으로 정렬하면 다음과 같다.
     * <p>
     * [3,4,2,1,5]
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] n = {5, 4};
        int[][] stages = {
                {2, 1, 2, 6, 2, 4, 3, 3},
                {4, 4, 4, 4, 4}
        };

        for (int i = 0; i < stages.length; i++) {
            solution(n[i], stages[i]);
        }
    }
}
