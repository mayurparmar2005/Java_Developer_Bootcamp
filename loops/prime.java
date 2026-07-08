package loops;
import java.util.Scanner;
public class prime {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter Number :");
        num = sc.nextInt();
        int count=0;
        for(int i=2; i<num ; i++){
            if(num %i == 0){
                count++;
            }
        }
        if(count!=0){
            System.out.print(num+" is not a Prime Number");
        }else{
            System.out.print(num+" is a Prime Number");
        }
    }    
}
