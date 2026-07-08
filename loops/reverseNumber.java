package loops;

public class reverseNumber {
    public static void main(String[] args){
        int n = 12345;
        int t,nw=0;
        while(n>0){
            t = n%10;
            nw = nw*10 +t;
            n = n/10;
        }
        System.out.println("Reverse Number is: " + nw);
    }
}
