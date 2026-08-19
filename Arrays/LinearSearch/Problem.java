package Arrays.LinearSearch;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = {13,18,11,41,12,4,13,17,9,13,18,74,62,13,19};
        for(int x: numbers){
            System.out.print(x+" ");
        }

        System.out.println();

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        int last = -1 , first = -1 , count =0;

        for(int i = 0 ; i < numbers.length ; i++){
            if(numbers[i] == n ){
                if(first == -1 ) first = i;
                last = i;
                count++;
            }
        }

        if(first == -1) {
            System.out.println("Element not found.");
        }else{
            System.out.println("First Occurrence :"+first);
            System.out.println("Last Occurrence :"+last);
            System.out.println("Total Occurrence :"+count);
        }
    }
}
