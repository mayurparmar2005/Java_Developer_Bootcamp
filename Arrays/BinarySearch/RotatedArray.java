package Arrays.BinarySearch;

import java.util.Scanner;

public class RotatedArray {
    public static int RotatedArray(int[] arr,int target){
        int pivot = PivotInRotatedArray(arr);
        if(pivot == -1){
            return BinarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot] == target){
            return pivot;
        }
        if(target >= arr[0]){
            return BinarySearch(arr,target,0,pivot-1);
        }
        return BinarySearch(arr,target,pivot+1,arr.length-1);
    }
    public static int BinarySearch(int[] arr, int target, int start , int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid +1]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static int PivotInRotatedArray(int[] arr){
        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start) /2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nums = {3,5,1};

        int pivot = PivotInRotatedArray(nums);

        System.out.println(pivot);

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        System.out.println(RotatedArray(nums,target));


    }
}
