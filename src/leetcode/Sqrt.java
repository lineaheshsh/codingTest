package leetcode;

public class Sqrt {
    public static int mySqrt(int x) {
        int sqrt = (int) binarySearch(x);

        return sqrt;
    }

    private static long binarySearch(int n){

        long start = 0;
        long end = n;
        long ans = -1;

        while(start <= end){
            System.out.println("start : " + start + ", end : " + end);
            long mid = start + (end - start) / 2;
            System.out.println("mid : " + mid);

            long square = mid * mid;

            if(square == n)
                return mid;
            else if(square < n){
                ans = mid;
                start = mid + 1;
            }
            else
                end = mid - 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] x = {
                8,
//                4
        };

        for (int i = 0; i < x.length; i++) {
            System.out.println(mySqrt(x[i]));
        }
    }
}
