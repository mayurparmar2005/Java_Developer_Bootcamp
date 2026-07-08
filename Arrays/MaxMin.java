package Arrays;

 import java.util.Scanner;
public class MaxMin{
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
			for(int i = 0 ; i < ln ; i++){
				System.out.print(arr1[i]+" ");
			}
			int minV = Integer.MAX_VALUE;
			int maxV = Integer.MIN_VALUE;
			for(int i = 0 ; i < ln ; i++){
				if( arr1[i] > maxV){	
                    maxV = arr1[i]; 
                }
                if(arr1[i] < minV){ 
                    minV = arr1[i];
                }
			}
			System.out.println("Maximum Value from array is  : "+maxV);
			System.out.println("Minimum Value from array is   : "+minV);
	}
}