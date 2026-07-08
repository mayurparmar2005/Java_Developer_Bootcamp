package Confitional_Statement;
import java.util.Scanner;
public class greatest {
    Scanner sc = new Scanner(System.in);
    int a,b,c;
    public void input(){
        System.out.print("Enter First Number :");
        a = sc.nextInt();
        System.out.print("Enter Second Number :");
        b = sc.nextInt();
        System.out.print("Enter Third Number :");
        c = sc.nextInt();
    }
    public void findGreatest(){
        if(a>b && a>c){
            System.out.printf("Number %d is Greatest.",a);
        }
        else if(b>a && b>c){
            System.out.printf("Number %d is Greatest.",b);
        }
        else{
            System.out.printf("Number %d is Greatest.",c);
        }
    }
    
}
