package CollectionFrameworks;

import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args){
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        Numbers.add(6);
        Numbers.add(2);
        Numbers.add(10);
        Numbers.add(4);
        Numbers.add(5);
        Numbers.add(1);
        Numbers.add(7);
        Numbers.add(8);
        Numbers.add(9);
        Numbers.add(3);
        System.out.println("Initial ArrayList: " + Numbers);
        int max= Integer.MIN_VALUE , min= Integer.MAX_VALUE, sum =0;
            for(int i=0; i < Numbers.size() ; i++){
                if(Numbers.get(i) > max){
                    max = Numbers.get(i);
                }
                if (Numbers.get(i) < min) {
                    min = Numbers.get(i);
                }
            }
        System.out.println("Maximum number is :"+max);
        System.out.println("Minimum number is :"+min);

        for(int i=0; i < Numbers.size() ; i++){
            sum = sum + Numbers.get(i);
        }
        System.out.println("Sum of all numbers is  :"+sum);

        Numbers.remove(5);
        System.out.println("Initial ArrayList: " + Numbers);
    }
}

