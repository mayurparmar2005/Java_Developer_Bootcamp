package Arrays.BinarySearch;

import java.util.Scanner;

public class ElementInMountainArray {

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start ) / 2;
            if(arr[mid] < arr[mid+1]){
                start = mid +1;
            }else{
                end = mid;
            }
        }

        return start;
    }
    static int findElement(int[] arr, int target,int peak){
        int start=0;
        int end = peak;

        while(start <= end){
            int mid = start + (end - start )/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int findElementDescending(int[] arr, int target,int peak){
        int start = peak + 1;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end - start )/2;

            if(target > arr[mid]){
                end = mid -1;
            }else if(target < arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {2,4,6,8,9,11,14,19,15,13,11,9,6,3,1};
        System.out.println("Enter Target element : ");
        int target = sc.nextInt();

        int peak = findPeak(nums);
        int ans = findElement(nums,target,peak);
        if(ans == -1){
            ans = findElementDescending(nums,target,peak);
        }
        System.out.println(ans);
    }
}


// LEETCODE problem: 1095. Find in Mountain Array
// solution:
//        /**
//         * // This is MountainArray's API interface.
//         * // You should not implement it, or speculate about its implementation
//         * interface MountainArray {
//         *     public int get(int index) {}
//         *     public int length() {}
//         * }
//         */
//
//class Solution {
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peak = findPeak(mountainArr);
//        int ans = findElementIncreasing(target,mountainArr,peak);
//        if(ans == -1){
//            ans = findElementDecreasing(target,mountainArr,peak);
//        }
//        return ans;
//    }
//
//    public int findPeak(MountainArray arr){
//        int start = 0;
//        int end = arr.length() - 1;
//
//        while(start < end){
//            int mid = start + (end - start) / 2;
//            if(arr.get(mid) < arr.get(mid+1)){
//                start = mid +1;
//            }else{
//                end = mid;
//            }
//        }
//        return start;
//    }
//
//    public int findElementIncreasing(int target, MountainArray arr, int peak){
//        int start = 0;
//        int end = peak;
//
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//            if(target < arr.get(mid)){
//                end = mid -1;
//            }else if(target > arr.get(mid)){
//                start = mid + 1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//
//    public int findElementDecreasing(int target , MountainArray arr,int peak){
//        int start = peak;
//        int end = arr.length() - 1 ;
//
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//            if(target > arr.get(mid)){
//                end = mid -1;
//            }else if(target < arr.get(mid)){
//                start = mid + 1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//}
