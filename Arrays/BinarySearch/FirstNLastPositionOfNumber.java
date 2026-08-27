package Arrays.BinarySearch;

import java.util.Scanner;

public class FirstNLastPositionOfNumber {
    static int[] SearchRange(int[] nums, int target){

        if(nums.length == 0){
            return new int[]{-1,-1};
        }

        int[] ans = new int[2];

        // First Occurrence
        int low = 0;
        int high = nums.length -1;
        while(low <= high ){
            int mid = low + (high - low) / 2;
            if(target > nums[mid]){
                low = mid + 1;
            }else{
                high = mid -1;
            }
        }
        if(low < nums.length && nums[low] == target){
            ans[0] = low;
        }else {
            ans[0] =-1;
        }

        //Last Occurrence
        low=0;
        high = nums.length -1;
        while(low <= high ){
            int mid = low + (high - low) / 2;
            if(target < nums[mid]){
                high = mid - 1;
            }else if(target > nums[mid]){
                low = mid +1;
            }else{
                low = mid + 1;
            }
        }
        if(high >= 0 && nums[high] == target){
            ans[1]=high;
        }else{
            ans[1] = -1;
        }

        return ans;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = {1,3,5,5,5,6,7,7,7,7,8,8,10};
        for(int x:nums){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("Enter Number to find Its Range : ");
        int n = sc.nextInt();

        int[] answer = SearchRange(nums,n);
        System.out.println("["+answer[0]+","+answer[1]+"]");

    }
}
