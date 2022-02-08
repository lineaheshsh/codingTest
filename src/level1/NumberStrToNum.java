package level1;

public class NumberStrToNum {
    public int solution(String s) {
        int answer = strToNumber(s);
        return answer;
    }

    private int strToNumber(String str) {

        return Integer.parseInt(str.replaceAll("one", "1")
                .replaceAll("two", "2")
                .replaceAll("three", "3")
                .replaceAll("four", "4")
                .replaceAll("five", "5")
                .replaceAll("six", "6")
                .replaceAll("seven", "7")
                .replaceAll("eight", "8")
                .replaceAll("nine", "9")
                .replaceAll("zero", "0"));
    }

    public static void main(String[] args) {

    }
}
