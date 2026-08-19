package Arrays.LinearSearch;

import java.util.Scanner;

import static Arrays.LinearSearch.linearSearch.PrintArray;
import static Arrays.LinearSearch.linearSearch.inputArray;

public class findMinMax {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array:");
        int l = sc.nextInt();

        int[] numbers = new int[l];

        numbers = inputArray(numbers);

        PrintArray(numbers);
        System.out.println();

        int maxV = numbers[0];
        int minV = numbers[0];

        for(int i = 1 ; i < l ; i++){
            if(numbers[i] > maxV ){
                maxV = numbers[i];
            }
            if(numbers[i] < minV){
                minV = numbers[i];
            }
        }

        System.out.println("Maximum value is :"+maxV);

        System.out.println("Minimun value is :"+minV);
    }
}
