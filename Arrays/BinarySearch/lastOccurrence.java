package Arrays.BinarySearch;

import java.util.Scanner;

public class lastOccurrence {

    static int LastOccurrence(int[] arr,int target){

        int start = 0;
        int end = arr.length -1;

        while(start <= end ){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                start = mid + 1;
            }
        }
        if(end < arr.length && arr[end] == target){
            return end;
        }
        return -1;

    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,3,5,5,5,6,7,7,7,7,7,8,11,12};
        System.out.print("Array : ");
        for(int x : nums){
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.print("Enter Element to Find its First Occurrence in Array :");
        int n = sc.nextInt();

        int ans = LastOccurrence(nums,n);
        System.out.println(ans);

    }
}
