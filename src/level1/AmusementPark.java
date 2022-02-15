package level1;

public class AmusementPark {
    /**
     * 놀이공원 퀴즈~
     * @param price 놀이공원 이용료
     * @param money 현재 가지고 있는 금액
     * @param count 몇번 탔는지 회수
     * @return 얼마 모자라는지?
     */
    public static long solution(int price, int money, int count) {
        long answer = -1;
        int sum = 0;

        for (int i=0; i<count; i++) {
            sum = sum + (price*(i+1));
        }
        answer = sum - money < 0 ? 0 : sum - money;
        return answer;
    }

    public static void main(String[] args) {
        int price = 2;
        int money = 100;
        int count = 100;
        System.out.println(solution(price,money,count));
    }
}
