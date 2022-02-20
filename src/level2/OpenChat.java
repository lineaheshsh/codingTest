package level2;

import java.util.*;

public class OpenChat {
    public final class Constants {
        public final static String ENTER = "Enter";
        public final static String Leave = "Leave";
        public final static String Change = "Change";
    }

    public enum Status {
        Enter("님이 들어왔습니다."),
        Leave("님이 나갔습니다.");

        private final String value;
        Status(String value) { this.value = value; }
        public String getValue() { return value; }
    }

    public static String[] solution(String[] record) {
        String[] answer = {};

        ChatRoom chatRoom = new ChatRoom();
        for (int i = 0; i < record.length; i++) {
            String[] t = record[i].split(" ");

            if (record[i].indexOf(Constants.Leave) > -1) {
                chatRoom.status(t[1], t[0]);
            } else if (record[i].indexOf(Constants.Change) > -1) {
                chatRoom.changeName(t[1], t[2]);
            } else {
                chatRoom.add(t[1], t[2], t[0]);
            }
        }

        answer = new String[chatRoom.getHistory().size()];
        Map<String, User> userList = chatRoom.getUser();
        for (int i = 0; i < chatRoom.getHistory().size(); i++) {
            String newName = userList.get(chatRoom.getHistory().get(i).getUserId()).getUserName();
            String userId = chatRoom.getHistory().get(i).getUserId();
            String message = chatRoom.getHistory().get(i).getMessage();

            if (userList.containsKey(userId)) {
                answer[i] = message.replaceAll(userId, newName);
            }

            System.out.println(answer[i]);
        }

        return answer;
    }

    public static class ChatRoom {
        private Map<String, User> userMap;
        private List<History> historyList;

        public ChatRoom() {
            this.userMap = new HashMap<>();
            this.historyList = new ArrayList<>();
        }

        /**
         * 채팅방에 사람이 들어온 케이스
         * @param userId
         * @param userName
         * @param status
         */
        public void add(String userId, String userName, String status) {
            User user = new User(userId, userName, status);
            userMap.put(userId, user);

            History history = new History();
            history.addHistory(userId, status);
            historyList.add(history);

            if (userMap.containsKey(userId)) {
                this.changeName(userId, userName);
            }
        }

        /**
         * 채팅방에서 나간 케이스
         * @param userId
         * @param status
         */
        public void status(String userId, String status) {
            if (userMap.size() > 0) {
                if (userMap.containsKey(userId)) {
                    userMap.get(userId).changeStatus(status);
                }
            }
            History history = new History();
            history.addHistory(userId, status);
            historyList.add(history);
        }

        /**
         * 이름 변경시
         * @param userId
         * @param userName
         */
        public void changeName(String userId, String userName) {
            if (userMap.size() > 0) {
                if (userMap.containsKey(userId)) {
                    userMap.get(userId).changeUserName(userName);
                }
            }
        }

        public Map<String, User> getUser() {
            return userMap;
        }

        public List<History> getHistory() {
            return historyList;
        }
    }

    /**
     * 들어온 기록을 저장하는 클래스
     */
    public static class History {
        private String userId;
        private String message;

        public void addHistory(String userId, String status) {
            this.userId = userId;
            this.message = userId + Status.valueOf(status).getValue();
        }

        public String getMessage() {
            return message;
        }

        public String getUserId() {
            return userId;
        }
    }

    /**
     * User 클래스
     */
    public static class User {
        private String userId;
        private String userName;
        private String status;  // Enter, Leave, Change

        public User(String userId, String userName, String status) {
            this.userId = userId;
            this.userName = userName;
            this.status = status;
        }

        public void changeStatus(String status) {
            this.status = status;
        }

        public void changeUserName(String userName) {
            this.userName = userName;
        }

        public String getUserName() {
            return userName;
        }

        public String getUserId() {
            return userId;
        }

        public String getStatus() {
            return status;
        }
    }

    public static void main(String[] args) {
        String[] record = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };
//        ["Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."]

        System.out.println(solution(record));
    }
}
