package test;

import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        Person user1 = new Person(1, "Lee", 10);
        Person user2 = new Person(2, "Kim", 15);
        Person user3 = new Person(2, "You", 5);

        int compare = user1.compare(user2, user3);

        if (compare > 0) {
            System.out.println("user2이 나이가 더 많습니다.");
        } else if (compare == 0) {
            System.out.println("user2과 user3는 동갑입니다.");
        } else {
            System.out.println("user3이 나이가 더 많습니다.");
        }
    }
}

class Person implements Comparator<Person> {
    private int userId;
    private String userName;
    private int age;

    Person(int userId, String userName, int age) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.age > o2.age) {
            return 1;
        } else if (o1.age == o2.age) {
            return 0;
        } else {
            return -1;
        }
    }
}
