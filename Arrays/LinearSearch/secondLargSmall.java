package Arrays.LinearSearch;

import java.util.Scanner;

import static Arrays.LinearSearch.linearSearch.PrintArray;

public class secondLargSmall {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length of Array :");
        int len = sc.nextInt();

        int[] nums = new int[len];
        for(int i = 0 ; i<len ; i++){
            System.out.print("Enter nums["+i+"] :");
            nums[i] = sc.nextInt();
        }

        PrintArray(nums);
        System.out.println();

        secondLargest(nums);
        secondSmallest(nums);

    }

    static void secondLargest(int[] arr){
        int maxV = arr[0];
        int seclarge = arr[0];

        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] > maxV){
                seclarge = maxV;
                maxV = arr[j];
            }else if(arr[j] > seclarge && arr[j] != maxV){
                seclarge = arr[j];
            }
        }
        System.out.println("Second Largest number is :"+seclarge);
    }

    static void secondSmallest(int[] arr){
        int minV = arr[0];
        int secSmall = arr[0];

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] < minV){
                secSmall = minV;
                minV = arr[i];
            }else if(arr[i] < secSmall && arr[i] != minV){
                secSmall = arr[i];
            }
        }
        System.out.println("Second Smallest number is :"+secSmall);
    }
}
