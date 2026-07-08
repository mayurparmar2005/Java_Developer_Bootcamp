package Arrays;
import java.util.Scanner;
public class Array {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array :");
		int ln = sc.nextInt();
		int[] intgr = new int[ln];
			for(int i =0 ; i < ln ; i++){
				System.out.print("Enter Interger ["+i+"] : ");
				intgr[i] = sc.nextInt();
			}
			System.out.println("Here is the array of interger:");
			for(int x=0 ; x < ln ; x++){
				System.out.print(intgr[x]+" ");
			}
	}
}

