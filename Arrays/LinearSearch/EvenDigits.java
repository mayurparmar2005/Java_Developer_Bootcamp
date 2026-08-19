package Arrays.LinearSearch;

import java.util.Scanner;

import static Arrays.LinearSearch.linearSearch.PrintArray;
import static Arrays.LinearSearch.linearSearch.inputArray;

public class EvenDigits {

    static void main(String[] args) {
        int[] nums = {13,0,144,652,-785724,278154,-76,2673,317,238,2,1,542};
        findEvenDigitNumbers(nums);
    }

    static boolean EvenDigit(int n){
        n = Math.abs(n);
        int count = 0;
        do{
            count++;
            n= n / 10;
        } while(n > 0);

        return count%2 == 0;
    }

    static void findEvenDigitNumbers(int[] arr){
        int count=0;
        for(int i = 0 ; i < arr.length ; i++){
            if(EvenDigit(arr[i])){
                count++;
            }
        }
        System.out.println("Total "+count+" numbers are even.");
    }
}
