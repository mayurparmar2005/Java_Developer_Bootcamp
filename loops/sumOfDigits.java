package loops;
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int n = sc.nextInt();
        int sum = 0, a;
        while(n>0){
            a = n%10;
            sum = sum +a;
            n = n/10;
        }
        /*  FOR PRINTING PRODUCT OF ALL DIGITS
        int pd = 1;
         while(n>0){
         if(n!=0){
            a = n%10;
            pd = pd * a;
            n = n/10;
            }else{
                continue;
            }
        }
        */
        System.out.println("Sum of digits: " + sum);
    }
}
