package Arrays.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class findElement2DArray {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] [] arr = {
                {13,15,12},
                {14,11,19,10},
                {18,16}
        };

        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter target :");
        int target = sc.nextInt();

        int[] ans = SearchElement(arr, target);

        System.out.println("Find AT :"+Arrays.toString(ans));

    }

    static int[] SearchElement(int[] [] arr, int target){

        for(int row = 0 ; row < arr.length ; row++){
            for(int col = 0 ; col < arr[row].length ; col++){
                if(arr[row][col] == target  ){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1};
    }
}
