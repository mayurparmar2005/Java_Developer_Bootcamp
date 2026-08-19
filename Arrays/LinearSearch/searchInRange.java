package Arrays.LinearSearch;

import java.util.Scanner;



public class searchInRange {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = {12,54,23,-2,34,-45,23,35,56,90,37};

            for(int j=0 ; j<arr.length ; j++){
                System.out.print(arr[j]+" ");
            }

        System.out.println();

        System.out.print("Enter A number to Find : ");
        int n = sc.nextInt();

        System.out.print("Enter range of index to find the number from:");
        int low = sc.nextInt();

        System.out.print("To (this will be excluded):");
        int high = sc.nextInt();

        boolean flag = false;

            for(int i = low ; i<= high ; i++){
                if(arr[i] == n ) {
                    System.out.println("Number Found At index :" + i);
                    flag = true;
                }
            }

            if(flag == false){
                System.out.println("Number is not found in this range or array.");
            }
    }
}
