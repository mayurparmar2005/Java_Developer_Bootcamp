package Strings;
import java.util.Scanner;
public class reverse{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.nextLine();
		int l = s.length() - 1;
		char sub ;
		String revS = new String();
		for(int i=l; i >=0 ; i--){
			sub = s.charAt(i);
			revS = revS + sub;
		}
		System.out.println("Reverse String is "+revS);
	}
}