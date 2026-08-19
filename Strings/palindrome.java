package Strings;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.nextLine();
		int l = s.length() - 1;
		char sub ;
		String revS = new String();
        s = s.toLowerCase();
		for(int i=l; i >= 0 ; i--){
			sub = s.charAt(i);
			revS = revS + sub;
		}
		if( revS.equals(s) ){
			System.out.println("String is palindrome ");
		}else { System.out.println("String is not palindrome ");}
	}
}

