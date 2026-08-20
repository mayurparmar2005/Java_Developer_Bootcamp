package Arrays.LinearSearch;

import java.sql.SQLOutput;

public class Wealth {

    static void main(String[] args) {
        int[][] accounts = {
                {12,4,1},
                {15,1,2},
                {8,9,1} };
        System.out.println("Highest Wealth from accounts is : "+maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts ){
        int maximumWealth = 0;

        for(int person = 0 ; person < accounts.length ; person++){
            int rowSum = 0;
            for(int account = 0 ; account < accounts[person].length ; account++){

                rowSum = accounts[person][account] + rowSum;
            }
            if(rowSum > maximumWealth){
                maximumWealth = rowSum;
                rowSum=0;
            }
        }

        return maximumWealth;

//        int ans = Integer.MIN_VALUE;
//        for(int[] ints : accounts){
//            int sum = 0;
//            for(int anInt :ints){
//                sum += anInt;
//            }
//            System.out.println(sum);
//            if(sum > ans){
//                ans = sum;
//            }
//        }
//        return ans;
    }
}
