package Arrays.BinarySearch;

import java.util.Scanner;

public class orderAgnosticBS {

    static int findElement(int[] arr,int n){

        int low = 0;
        int high = arr.length -1;

        while(low <= high){

            int mid = low + (high - low )  / 2;

            if( arr[low] < arr[high] ){
                // for ascending order
                if(n > arr[mid]){
                    low = mid +1;
                }else if(n < arr[mid]){
                    high = mid -1;
                }else{
                    return mid;
                }

            }else{
                // for descending order
                if(n > arr[mid]){
                    high = mid - 1;
                }else if(n < arr[mid]){
                    low = mid + 1;
                }else{
                    return mid;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {41,40,38,33,31,28,27,22,19,17,8,5,1,-19,-120};

        System.out.print("Array : " );
        for(int i = 0 ; i < arr.length ; i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the Target element :");
        int target = sc.nextInt();

        int index = findElement(arr,target);

        if(index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index : "+index);
        }
    }
}
