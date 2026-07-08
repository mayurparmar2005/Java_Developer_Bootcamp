package Confitional_Statement;
import java.util.Scanner;

public class leap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);    
        int year;
        System.out.print("Enter Year :");
        year = sc.nextInt();
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.printf("Year %d is Leap Year.",year);
        }
        else{
            System.out.printf("Year %d is Not Leap Year.",year);
        }
    }
    
}
