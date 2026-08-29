package Arrays.BinarySearch;

// Find First and Last Position of Element in Sorted Array

import java.util.Scanner;

public class FirstNLastPositionOfNumber {
    public static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};

        int start = searchOccurrence(nums,target, true);
        int end = searchOccurrence(nums, target, false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    public static int searchOccurrence(int[] nums, int target, boolean startIndex){
        int ind =-1;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                ind = mid;
                if(startIndex){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }

        return ind;
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

        int[] answer = searchRange(nums,n);
        System.out.println("["+answer[0]+","+answer[1]+"]");

    }
}