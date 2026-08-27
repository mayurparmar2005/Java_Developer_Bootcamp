package Arrays.LinearSearch;

import java.util.Scanner;

public class linearSearch {

    public static void PrintArray(int[] arr){
        for(int x : arr){
            System.out.print(x+" ");
        }
    }

    static int[] inputArray(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<arr.length ; i++){
            System.out.print("Enter arr["+i+"] : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int linearSearch(int[] arr, int x){
        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    public static void main(String... args){

        Scanner sc = new Scanner(System.in);

        int[] arr = {2,4,5,8,10,18,21,25,28,30};
        System.out.print("Array is :");

        PrintArray(arr) ;
        System.out.println();

        System.out.print("Enter Element to find index : ");
        int x = sc.nextInt();

        int ans = linearSearch(arr,x);
        if(ans == -1){
            System.out.println("Given Elements index is not found.");
        }else{
            System.out.println("Element found at index :"+ans);
        }
    }

}
