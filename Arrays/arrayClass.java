package Arrays;

import java.util.Scanner;
public class arrayClass{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array :");
		int ln = sc.nextInt();
		int[] arr1 = new int[ln];
			for(int i =0 ; i < ln ; i++){
				System.out.print("Enter Interger ["+i+"] : ");
				arr1[i] = sc.nextInt();
			}
			System.out.print("Original Array : ");
			for(int i =0 ; i < ln ; i++){
				System.out.print(arr1[i]+" ");
			}
			int odd = 0;
			int even = 0;
			int ZeroOnes = 0;
			for(int i = 0 ; i < ln ; i++){
				if(arr1[i] == 0 || arr1[i] == 1){
					ZeroOnes++;}else
				if( arr1[i] % 2 != 0){	odd++; }
				else { even++; }
			}
			System.out.printf("Total Odd numbers Are %d and Total Even Numbers are %d and ZeroOnes are %d. ",odd,even,ZeroOnes);
	}
}