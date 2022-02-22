package test;

public class ComparableTest {
    public static void main(String[] args) {
        User user1 = new User(1, "Lee", 10);
        User user2 = new User(2, "Kim", 15);

        int compare = user1.compareTo(user2);

        if (compare > 0) {
            System.out.println("user1이 나이가 더 많습니다.");
        } else if (compare == 0) {
            System.out.println("user1과 user2는 동갑입니다.");
        } else {
            System.out.println("user2이 나이가 더 많습니다.");
        }
    }
}

class User implements Comparable<User> {
    private int userId;
    private String userName;
    private int age;

    User(int userId, String userName, int age) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
    }


    @Override
    public int compareTo(User o) {
        if (this.age > o.age) {
            return 1;
        } else if (this.age == o.age) {
            return 0;
        } else {
            return -1;
        }
    }
}
