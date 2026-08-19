package loops;
import java.util.Scanner;

public class print1357 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,i;
    System.out.println("Enter n:");
    n = sc.nextInt();
    for( i = 1 ; i <= (n*2)-1 ; i++ ){
        if(i%2!=0){
            System.out.println(i);
        }
    }
}
}
