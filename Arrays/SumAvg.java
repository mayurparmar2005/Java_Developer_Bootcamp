package Arrays;

import java.util.Scanner;
public class SumAvg{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array :");
		int ln = sc.nextInt();
		int sum=0;
		int[] arr1 = new int[ln];
			for(int i =0 ; i < ln ; i++){
				System.out.print("Enter Interger ["+i+"] : ");
				arr1[i] = sc.nextInt();
			}
			System.out.print("Original Array : ");
			for(int i = 0 ; i < ln ; i++){
				System.out.print(arr1[i]+" ");
			}
			for(int i = 0 ; i < ln ; i++){
				sum += arr1[i];
                }
			System.out.println("Sum of All elements is  : "+sum);
			double Avg = sum / (double)arr1.length ;
			System.out.println("Average of All elements is  : "+Avg);
			
	}
}
