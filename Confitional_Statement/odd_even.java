package Confitional_Statement;

import java.util.Scanner;
public class odd_even {
    static void main(String[] args){
        	Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter Number :");
		num = sc.nextInt();
		if(num%2==0){
			System.out.printf("Number %d is Even.",num);
				}
			else{	
				System.out.printf("Number %d is Odd.",num);
			}
    }
} 