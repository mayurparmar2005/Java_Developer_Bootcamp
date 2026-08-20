package Arrays.BinarySearch;

import java.util.Scanner;
public class binarySearch {
    public static int Search(int n,int[] arr){

        int low = 0;
        int high = arr.length;
        int mid;
        while(low < high){
            mid = ( low + high ) / 2;
            if(n == arr[mid]){
                return mid;
            }
            else if( n < arr[mid]){
                high = mid-1;
            } else if (n > arr[mid]) {
                low = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2,4,6,8,10,14,16,17,18,19,20,25,29,30,46,50};

        System.out.print("Array : " );
        for(int i = 0 ; i < arr.length ; i++){

            System.out.print(arr[i]+" ");
        }

        System.out.println();

        System.out.print("Enter  element to find its index : ");
        int n = sc.nextInt();

        int ind = Search(n,arr);

        if(ind == -1){
            System.out.println("Array does not contain Given Element.");
        }else {
            System.out.println("Index of given " + n + " is : " + ind);
        }
    }
}
