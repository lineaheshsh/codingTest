package level1;

import java.util.*;

public class MockExam {

    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] persons = {1, 2, 3};
        int[][] supoArr = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };
        int[] supoMod = {5,8,10};
        int supoCnt = 0;
        Map<Integer, Integer> answerCntMap = new HashMap<>();
        for (int person : persons) {
            int answerCnt = checkAnswer(answers, supoArr[supoCnt], supoMod[supoCnt]);
            answerCntMap.put(person, answerCnt);
            supoCnt++;
        }

        Integer max = Collections.max(answerCntMap.values());
        List<Integer> answerList = new ArrayList<>();
        for (int i = 0; i < answerCntMap.size(); i++) {
            if (max == answerCntMap.get(persons[i])) answerList.add(persons[i]);
        }
        answer = answerList.stream().mapToInt(i -> i).sorted().toArray();
        return answer;
    }

    private static int checkAnswer(int[] answers, int[] supo, int mod) {
        int answerCnt = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == supo[i%mod]) answerCnt++;
        }
        return answerCnt;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4, 5};
        int[] nums = {1, 3, 2, 4, 2};
        solution(nums);
    }
}
