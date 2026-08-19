package CollectionFrameworks;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWrite {

    public static void withOutCopyOnWriteArrayList() {

        List<String> ShoppingList = new ArrayList<>();
        ShoppingList.add("Milk");
        ShoppingList.add("Bread");
        ShoppingList.add("Eggs");

        System.out.println("Initial Shopping List: " + ShoppingList);
    
        try{  
                for(String item: ShoppingList){
                    System.out.println(item);

                        if(item.equals("Bread")){
                            ShoppingList.add("Butter");
                            System.out.println("Added Butter to list While Reading.\n");
                        }
                }
        }catch(Exception e){
                System.out.println("Exception occurred: " + e);

            }

    }
    public static void main(String[] args) {
        
        withOutCopyOnWriteArrayList();
        System.out.println("\n With CopyOnWriteArrayList:\n");

        List<String> ShoppingList = new CopyOnWriteArrayList<>();
        ShoppingList.add("Milk");
        ShoppingList.add("Bread");
        ShoppingList.add("Eggs");
        System.out.println("\n Initial Shopping List: " +  ShoppingList);
            for(String item: ShoppingList){
                    System.out.println(item);

                        if(item.equals("Bread")){
                            ShoppingList.add("Butter");
                            System.out.println("Added Butter to list While Reading.\n");
                        }
                }
            System.out.println("Final Shopping List: " + ShoppingList);
    }
}
