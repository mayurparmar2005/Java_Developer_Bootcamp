package CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyClass implements Comparable<MyClass>{

    private int id;
    private String name;

    public MyClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(MyClass o) {
        return this.id - o.id;
    }


    public static void main(String... args){
        List<MyClass> students = new ArrayList<>();
        students.add(new MyClass(3,"Rakhi"));
        students.add(new MyClass(4,"Jigo"));
        students.add(new MyClass(1,"Chintan"));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);

    }

}


