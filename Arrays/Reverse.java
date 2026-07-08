package Arrays;
import java.util.Scanner;
public class Reverse {
    
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
			System.out.print("Reverse Array : ");
			for(int i = ln-1 ; i>=0 ; i--){
				System.out.print(arr1[i]+" ");
			}
	}
}