package Arrays.BinarySearch;

import java.util.Scanner;

import static Arrays.LinearSearch.linearSearch.PrintArray;

public class CeilingFloorNumbers {

    static int floorNumber(int[] arr, int target){

        int mid = 0;
        int low = 0 , high = arr.length -1;

        while(low <= high){
            mid = low + (high - low) / 2;

            if( target < arr[mid]){
                high = mid-1;
            } else if (target > arr[mid]) {
                low = mid+1;
            }else{
                return arr[mid];
            }
        }
        if (high == -1) {
            return -1; // no floor exists
        }
        return arr[high];
    }

    static int ceilingNumber(int[] arr, int target){

        int mid = 0;
        int low = 0 , high = arr.length -1;

        while(low <= high){
            mid = low + (high - low) / 2;

            if( target < arr[mid]){
                high = mid-1;
            } else if (target > arr[mid]) {
                low = mid+1;
            }else{
                return arr[mid];
            }
        }
        if (low == arr.length) {
            return -1; // no ceiling exists
        }
        return arr[low];
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {3,5,9,12,15,19,25,28};
        PrintArray(array);
        System.out.println();
        System.out.print("Enter Number to find it's selling number: ");
        int n = sc.nextInt();

        System.out.println("Ceiling number is :"+ ceilingNumber(array, n));
        System.out.println("Floor number is :"+ floorNumber(array, n));

    }
}
