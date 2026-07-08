package Patterns;
import java.util.Scanner;
public class square {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int n = sc.nextInt();
        /* 
            *  *  *  *  * 
            *  *  *  *  * 
            *  *  *  *  * 
            *  *  *  *  * 
            *  *  *  *  * 
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
			System.out.print(" * ");
			}
		System.out.println();
        }

        for n 

        int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=n;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }

        1  2  3  4  5
        1  2  3  4  5
        1  2  3  4  5
        1  2  3  4  5
        1  2  3  4  5    
        
        int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=n;j++){
                    System.out.printf(" %d ",j);
                }
                System.out.println();
            }

            Enter n:5
            A  B  C  D  E 
            A  B  C  D  E 
            A  B  C  D  E 
            A  B  C  D  E 
            A  B  C  D  E 
            int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=n;j++){
                    System.out.printf(" %c ",j+64);
                }
                System.out.println();
            }
            
            * 
            *  * 
            *  *  * 
            *  *  *  * 
            int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=i;j++){
                    System.out.printf(" * ");
                }
                System.out.println();
            }

            1 
            1  2
            1  2  3
            1  2  3  4 
             int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=i;j++){
                    System.out.printf(" %d ",j);
                }
                System.out.println();
            }

                A 
                A  B 
                A  B  C 
                A  B  C  D 
            int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=i;j++){
                    System.out.printf(" %c ",j+64);
                }
                System.out.println();
            }

            A 
            1 2
            A  B  C 
            1 2 3 4
            A  B  C  D  E 
            int i,j;
            for(i=1;i<=n;i++){
                if(i%2==0){
                    for(j=1;j<=i;j++){
                    System.out.printf(" %d",j);
                }
                }else{ 
                for(j=1;j<=i;j++){
                    System.out.printf(" %c ",j+64);
                }
                }
                System.out.println();
            }

            *  *  *  *  * 
            *  *  *  * 
            *  *  * 
            *  * 
            * 
             int i,j;
            for(i=1;i<=n;i++){
                for(j=n;j>=i;j--){
                    System.out.printf(" * ");
                }
                System.out.println();
            }

            1  2  3  4  5
            1  2  3  4
            1  2  3
            1  2
            1 
            int i,j;
            for(i=n;i>=1;i--){
                for(j=1;j<=i;j++){
                    System.out.printf(" %d ",j);
                }
                System.out.println();
            }

            A  B  C  D 
            A  B  C 
            A  B 
            A 
            int i,j;
            for(i=n;i>=1;i--){
                for(j=1;j<=i;j++){
                    System.out.printf(" %c ",j+64);
                }
                System.out.println();
            }

            1 
            1  3 
            1  3  5 
            1  3  5  7
            int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=i;j++){
                    System.out.printf(" %d ",(2*j)-1);
                }
                System.out.println();
            }


            1
            23
            345
            4567
            int i,j;
            for(i=1;i<=n;i++){
                for(j=0;j<i;j++){
                    System.out.print(j+i);
                }
                System.out.println();
            }

            1 
            0  1 
            1  0  1 
            0  1  0  1 
            int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print(" 1 ");
                    }
                    else{
                        System.out.print(" 0 ");    
                    }
                } 
                System.out.println();
            }   

                    *       
                    *       
              *  *  *  *  * 
                    *       
                    *       
            int i,j;
            for(i=1;i<=5;i++){
                for(j=1;j<=5;j++){
                    if(i==3 || j==3){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                } 
                System.out.println();
            }


            *  *  *  *  * 
            *           * 
            *           * 
            *           * 
            *  *  *  *  * 
            int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=n;j++){
                    if(i==1 || j==n || i==n || j==1){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                } 
                System.out.println();
            }

*           * 
    *     *    
       *       
    *     *    
 *           * 
int i,j;
            for(i=1;i<=n;i++){
                for(j=1;j<=n;j++){
                    if(i==j || i+j==n+1 ){
                        System.out.print(" * ");
                    }else{
                        System.out.print("   ");
                    }
                } 
                System.out.println();
        }


                        * 
                     *  * 
                  *  *  * 
               *  *  *  * 
            *  *  *  *  * 
        int i,j;
            for(i=1;i<=n;i++){
                for(j=n-1;j>=i;j--){
                System.out.print("   ");
                }
                for(j=1;j<=i;j++){
                    System.out.print(" * ");
                }
                System.out.println();
            }

                        
                         1 
                      1  2 
                   1  2  3 
                1  2  3  4 
             1  2  3  4  5 
            int i,j;
            for(i=1;i<=n;i++){
                for(j=n-1;j>=i;j--){
                System.out.print("   ");
                }
                for(j=1;j<=i;j++){
                    System.out.printf(" %d ",j);
                }
                System.out.println();
            }

             1 
          1  2  3 
       1  2  3  4  5 
    1  2  3  4  5  6  7 
 1  2  3  4  5  6  7  8  9 
            int i,j,k;
            for(i=1;i<=n;i++){
                for(j=n-1;j>=i;j--){
                System.out.print("   ");
                }
                for(k=1;k<=(2*i-1);k++){
                    System.out.printf(" %d ",k);
                }
                System.out.println();
            }


             * 
          *  *  * 
       *  *  *  *  * 
    *  *  *  *  *  *  * 
 *  *  *  *  *  *  *  *  * 
    *  *  *  *  *  *  * 
       *  *  *  *  * 
          *  *  * 
             * 
             
            int i,j,k,l,m,o;
            for(i=1;i<=n;i++){
                for(j=n-1;j>=i;j--){
                System.out.print("   ");
                }
                for(k=1;k<=(2*i-1);k++){
                    System.out.print(" * ");
                }
                System.out.println();
            }
            for(l=1;l<n;l++){
                for(m=1;m<=l;m++){
                    System.out.print("   ");
                }
                for(o=(2*n-3);o>=(2*l-1);o--){
                    System.out.print(" * ");
                }
                System.out.println();
            }
        */
    }
}
