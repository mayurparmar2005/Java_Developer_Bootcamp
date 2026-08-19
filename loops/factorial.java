package loops;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,fact=1;
        System.out.print("ENter n to find Factorial:");
        n = sc.nextInt();
        while(n>0){
            fact = fact*n;
            n--;
        }
        System.out.println("Factorial is: " + fact);
        sc.close();
    }

}
