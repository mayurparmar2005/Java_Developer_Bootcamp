package Arrays.LinearSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static Arrays.LinearSearch.linearSearch.PrintArray;

public class numberOccurrence {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = {13, 21, 13, 67, 34, 76, 98, 25, 21, 53, 13};

        PrintArray(num);
        System.out.println();

        System.out.print("Enter number :");
        int n = sc.nextInt();

        count(num,n);
        firstOccurrence(num,n);
        lastOccurrence(num,n);
        allOccurrence(num,n);
    }

    static void firstOccurrence(int[] arr, int n){
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == n){
                System.out.println("First Occurrence at index "+i);
                break;
            }
        }
    }

    static void lastOccurrence(int[] arr , int n){
        int ind = -1;

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == n){
                ind = i;
            }
        }

        if(ind == -1){
            System.out.println("Not found.");
        }else {
            System.out.println("Last Occurrence index is " + ind);
        }
    }

    static void allOccurrence(int[] arr , int n){

        List<Integer> index = new ArrayList<Integer>();

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] == n){
                index.add(i);
            }
        }
        System.out.print("All Occurrence indexes are : "+index);
    }

    static void count(int[] arr,int n){
        int count = 0;

        for(int i=0 ; i< arr.length ; i++){
            if(arr[i] == n){
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Number not found in Array.");
        } else {
            System.out.println("Number Occurred times :" + count);
        }
    }
}
