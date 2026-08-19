package CollectionFrameworks.Comparator;

import java.util.ArrayList;

import java.util.List;

public class integer {

    int id;
    String name;
    public integer(int id, String name){
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args){
        List<Integer> listint = new ArrayList<>();
        listint.add(5);
        listint.add(2);
        listint.add(3);
        listint.add(4);
        listint.add(1);

        System.out.println("Before Sorting: " + listint);

        listint.sort(new MyComparator());

        System.out.println("After Sorting: " + listint);
    }
}
