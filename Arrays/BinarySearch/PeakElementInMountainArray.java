package Arrays.BinarySearch;

// 852. Peak Index in a Mountain Array
// You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//Return the index of the peak element.
//Your task is to solve it in O(log(n)) time complexity.


public class PeakElementInMountainArray {

    public static int PeakElement(int[] arr){

        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) /2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return start;
    }

    static void main(String[] args) {
        int[] arr={2,4,6,8,9,16,17,10,8,4,2,1};
        int ans = PeakElement(arr);
        System.out.println(ans);
    }
}

// LEETCODE:
//class Solution {
//    public int peakIndexInMountainArray(int[] arr) {
//        int start = 0;
//        int end = arr.length -1;
//
//        while(start < end){
//            int mid = start + ( end - start ) /2;
//            if(arr[mid] > arr[mid +1]){
//                end = mid;
//            }else{
//                start = mid + 1;
//            }
//        }
//        return start;
//    }
//}