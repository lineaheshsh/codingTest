package leetcode;

public class ReverseInteger {
    public static int reverse(int x) {
        long reverse = 0;
        int number = x;
        while(number != 0)
        {
            try {
                int remainder = number % 10;
                reverse = reverse * 10 + remainder;
                number = number / 10;
            } catch(Exception ex){
                return 0;
            }
        }

        if(reverse>Integer.MAX_VALUE || reverse<Integer.MIN_VALUE) {
            return 0;
        }
        return (int)reverse;
    }

    public static void main(String[] args) {
        int[] xArr = {
                123,
                -123,
                120
        };

        for (int x : xArr) {
            System.out.println(reverse(x));
        }
    }
}
