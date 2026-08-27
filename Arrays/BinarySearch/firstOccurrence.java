package Arrays.BinarySearch;

import java.util.Scanner;

public class firstOccurrence {
    static int FirstOccurrence(int[] arr,int target){

        int start = 0;
        int end = arr.length -1;

        while(start <= end ){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        if(start < arr.length && arr[start] == target){
            return start;
        }
        return -1;

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2,5,5,5,6,7,7,7,8,9,10};
        System.out.print("Array : ");
        for(int x : nums){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("Enter Element to Find its First Occurrence in Array :");
        int n = sc.nextInt();

        int ans = FirstOccurrence(nums,n);
        System.out.println(ans);
       // System.out.println("["+ans[0]+","+ans[1]+"]");

    }
}
