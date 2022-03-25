package leetcode;

import java.util.Arrays;

public class TwoCityScheduling {
    public static int twoCitySchedCost(int[][] costs) {

        int sum = 0;
        Arrays.sort(costs, (a,b) -> (a[0] - a[1]) - (b[0] - b[1]));

        for(int i=0; i<costs.length; i++){
            System.out.println(Arrays.toString(costs[i]));
            if(i < costs.length/2)  sum += costs[i][0];
            else    sum += costs[i][1];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][][] costs = {
                {{10,20},{30,200},{400,50},{30,20}}, // 110
                {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}}, // 1859
                {{515,563},{451,713},{537,709},{343,819},{855,779},{457,60},{650,359},{631,42}} // 3086
        };

        for (int i = 0; i < costs.length; i++) {
            System.out.println(twoCitySchedCost(costs[i]));
        }
    }
}
