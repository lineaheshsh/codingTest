package level1;

import java.util.HashMap;
import java.util.Map;

public class Keypad {
    public static String solution(int[] numbers, String hand) {
        String answer = "";

        int[] leftPosition = new int[]{0,3};
        int[] rightPosition = new int[]{2,3};

        Map<Integer, Point> numberPointMap = new HashMap<>();
        numberPointMap.put(1, new Point(0, 0));
        numberPointMap.put(2, new Point(1, 0));
        numberPointMap.put(3, new Point(2, 0));
        numberPointMap.put(4, new Point(0, 1));
        numberPointMap.put(5, new Point(1, 1));
        numberPointMap.put(6, new Point(2, 1));
        numberPointMap.put(7, new Point(0, 2));
        numberPointMap.put(8, new Point(1, 2));
        numberPointMap.put(9, new Point(2, 2));
        numberPointMap.put(0, new Point(1, 3));

        for (int num : numbers) {
            switch (num) {
                case 1: case 4: case 7:
                    answer += "L";
                    leftPosition[0] = numberPointMap.get(num).getX();
                    leftPosition[1] = numberPointMap.get(num).getY();
                    break;
                case 3: case 6: case 9:
                    answer += "R";
                    rightPosition[0] = numberPointMap.get(num).getX();
                    rightPosition[1] = numberPointMap.get(num).getY();
                    break;
                default:
                    int targetX = numberPointMap.get(num).getX();
                    int targetY = numberPointMap.get(num).getY();

                    int leftDistance = manhatenFunc(targetX, targetY, leftPosition[0], leftPosition[1]);
                    int rightDistance = manhatenFunc(targetX, targetY, rightPosition[0], rightPosition[1]);

                    if (leftDistance == rightDistance) {
                        if ("right".equals(hand)) {
                            answer += "R";
                            rightPosition[0] = numberPointMap.get(num).getX();
                            rightPosition[1] = numberPointMap.get(num).getY();
                        } else {
                            answer += "L";
                            leftPosition[0] = numberPointMap.get(num).getX();
                            leftPosition[1] = numberPointMap.get(num).getY();
                        }
                    } else {
                        if (leftDistance < rightDistance) {
                            answer += "L";
                            leftPosition[0] = numberPointMap.get(num).getX();
                            leftPosition[1] = numberPointMap.get(num).getY();
                        } else {
                            answer += "R";
                            rightPosition[0] = numberPointMap.get(num).getX();
                            rightPosition[1] = numberPointMap.get(num).getY();
                        }
                    }
                    break;
            }
        }

        return answer;
    }

    private static int manhatenFunc(int target_x, int target_y, int current_x, int current_y) {
        return Math.abs(target_x - current_x) + Math.abs(target_y - current_y);
    }

    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) {
        int[] numbers = {
                7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2
        };
        String hand = "left";
        System.out.println(solution(numbers,hand));
        System.out.println("LRLLRRLLLRR");
    }
}
