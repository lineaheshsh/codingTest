package level1;

public class SecretMap {

    public static final class Constants {
        public static final String EMPTY = " ";
        public static final String WALL = "#";
    }

    /**
     *
     * @param n 지도 길이
     * @param arr1 지도 1
     * @param arr2 지도 2
     * @return 지도 1 + 지도 2의 겹친 그림
     */
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String arr1TwoDigit = twoDigit(arr1[i], n);
            String arr2TwoDigit = twoDigit(arr2[i], n);

            String temp = "";
            for (int j = 0; j < n; j++) {
                if (String.valueOf(arr1TwoDigit.charAt(j)).indexOf(Constants.WALL) > -1
                        || String.valueOf(arr2TwoDigit.charAt(j)).indexOf(Constants.WALL) > -1) {
                    temp += "#";
                } else {
                    temp += " ";
                }
            }

            answer[i] = temp;
        }

        return answer;
    }

    /**
     * 10진수 -> 2진수 변경
     * 모자르는 길이 만큼 0 추가
     * 2진수로 변경한 숫자 0 -> " ", 1 -> "#"으로 변경
     * @param n 정수
     * @param len 2진수 길이
     * @return
     */
    private static String twoDigit(int n, int len) {
        String tDigit = Integer.toBinaryString(n);
        if (tDigit.length() < len) {
            for (int i = tDigit.length(); i < len; i++) {
                tDigit = "0" + tDigit;
            }
        }
        return tDigit.replaceAll("0", Constants.EMPTY).replaceAll("1", Constants.WALL);
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(solution(n, arr1, arr2));
    }
}
