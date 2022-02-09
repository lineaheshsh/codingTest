package level1;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GymSuit {

    /**
     * @param n       -> 전체 학생의 수
     * @param lost    -> 체육복을 도난당한 학생들의 번호가 담긴 배열
     * @param reserve -> 여벌의 체육복을 가져온 학생들의 번호가 담긴 배열
     * @return
     */
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        // 2개의 array의 차집합 구하기
        Set<Integer> lostSet = difference(lost, reserve);
        Set<Integer> reserveSet = difference(reserve, lost);

        for (int i=1; i<=n; i++) {
            int cur = i;
            if (!lostSet.contains(cur)) {
                answer++;
            } else {
                int beforeIdx = i-1;
                int afterIdx = i+1;

                if (reserveSet.contains(beforeIdx)) {
                    reserveSet.remove(beforeIdx);
                    answer++;
                } else if (reserveSet.contains(afterIdx)) {
                    reserveSet.remove(afterIdx);
                    answer++;
                }
            }
        }

        return answer;
    }

    // 차집합
    private static Set<Integer> difference(int[] list1, int[] list2)
    {
        Set<Integer> list1Set = Arrays.stream(list1).boxed().collect(Collectors.toSet());
        Set<Integer> list2Set = Arrays.stream(list2).boxed().collect(Collectors.toSet());
        list1Set.removeAll(list2Set);
        return list1Set;
    }

    public static void main(String[] args) {
        int n=5;
        int[] lost = {2, 3, 4};
        int[] reserve = {1, 2, 3};
        System.out.println(solution(n, lost, reserve));
    }
}
