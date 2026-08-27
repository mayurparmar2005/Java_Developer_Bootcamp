package Arrays.BinarySearch;
// Given a sorted char[],
// find the smallest character that is strictly greater than the target.
// If no greater character exists, wrap around to the first character.

import java.util.Scanner;

public class CeilingChar {

    public static char CeilingCharacter(char[] arr,char target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (target < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return arr[low % arr.length];
    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] characters = {'e','f','h','k','n','o','v','y'};
        for(char x : characters ){
            System.out.print(x+" ");
        }

        System.out.println();
        System.out.print("Enter Character to find It's Sealing : ");
        char target = sc.next().charAt(0);
        char ans = CeilingCharacter(characters , target);

        System.out.println(ans);
    }

}
