package loops;
import java.util.Scanner;
public class highestFactor {
    public static void main(String[] args){
        	Scanner sc = new Scanner(System.in);
		int num;
		System.out.print("Enter Number :");
		num = sc.nextInt();
		for(int i=(num-1); i>=1 ; i--){
			if(num %i == 0){
				System.out.print("Highest Factor is "+i);
                break;
			}
        }
}
}