package interfaces;

import java.util.Scanner;

public class divide2number {
 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number N1:");
        int n1 = sc.nextInt();
        System.out.println("Enter Number N2:");
        int n2 = sc.nextInt();
        try{
            int d = n1 / n2;
            System.out.println("N1 / N2 : "+d);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }
    }
}
