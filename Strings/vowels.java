package Strings;
import java.util.Scanner;
public class vowels {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String s = sc.nextLine();
		int l = s.length() - 1;
		char sub ;
		int count =0;
		String revS = new String();
		for(int i=0; i <= l ; i++){
			sub = s.charAt(i);
			if( sub == 'i' || sub == 'e' || sub == 'a' || sub == 'o' || sub == 'u' || sub == 'I' || sub == 'E' || sub == 'A' || sub == 'O' || sub == 'U'){
					count++;}
		}
			System.out.println("Vovels are: "+count);
	}

}
