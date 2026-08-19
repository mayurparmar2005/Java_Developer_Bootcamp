package interfaces;
import java.util.Scanner;
public class age {
    
    public void checkAge(int age) throws Exception{
            if(age < 18 ){
                throw new Exception("You are not eligible.");
            }else{
                System.out.println("You are Eligible.");
            }
    }
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Age:");
        int ag = sc.nextInt();

        age a = new age(); 
        try{
        a.checkAge(ag);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
     
        sc.close();
    }
}
