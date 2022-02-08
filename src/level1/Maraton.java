package level1;

import java.util.HashMap;
import java.util.Map;

public class Maraton {
    public static String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap<>();

        for (int i=0; i<participant.length; i++) {
            if(participantMap.containsKey(participant[i])) {
                participantMap.put(participant[i], participantMap.getOrDefault(participant[i], 0) + 1);
            } else {
                participantMap.put(participant[i], 1);
            }
        }

        for (int i=0; i<completion.length; i++) {
            int cnt = participantMap.get(completion[i]);
            if ((cnt-1) == 0) {
                participantMap.remove(completion[i]);
            } else {
                participantMap.put(completion[i], cnt-1);
            }
        }

        for(String key : participantMap.keySet()) {
            answer = key;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }
}
