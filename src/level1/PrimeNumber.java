package level1;

public class PrimeNumber {

    public static int solution(int[] nums) {
        int answer = 0;
        int leng = nums.length;
        for(int i=0; i<leng-2; i++){
            for(int j=i+1; j<leng-1; j++){
                for(int k=j+1; k<leng; k++){
                    int num1 = nums[i];
                    int num2 = nums[j];
                    int num3 = nums[k];

                    int sum = num1 + num2 + num3;

                    boolean isPrime = true;
                    for (int n = 2; n < sum; n++) {
                        if (sum % n == 0) {
                            isPrime = false;
                            break;
                        }
                    }

                    if (isPrime) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4};
        int[] nums = {1,2,7,6,4};
        solution(nums);
    }
}
