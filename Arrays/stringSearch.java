package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class stringSearch {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String str = "Ahmedabad";
         System.out.println("Here the Word is "+str);
         System.out.print("Enter the character to check in string 'Ahmedabad' : ");
         char ch = sc.next().charAt(0);

         System.out.println(Arrays.toString(str.toCharArray()));

         boolean res = SearchString(str, ch);

         System.out.println("Given Character contains :"+res);
    }

    static boolean SearchString(String str,char a){
         if(str.length() == 0){
             return false;
         }
         for(int i : str.toCharArray()){
             if( i == a ){
                 return true;
             }
         }
         return false;
    }
}
