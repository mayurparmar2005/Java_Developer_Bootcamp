package CollectionFrameworks.Comparator;

import java.util.ArrayList;
import java.util.List;

public class student {
    int id;
    String name;


    public student(int id, String name){
        this.id = id;
        this.name = name;

    }

    public static void main(String[] args){
        List<student> students = new ArrayList<>();
        students.add(new student(512,"Aman"));
        students.add(new student(512,"Alice"));
        students.add(new student(510,"Ruhsil"));
        students.add(new student(511,"Bob"));

        students.sort(new StudentComparator());

        for(student s: students){
            System.out.println(s.id + " " + s.name);
        }
        
    }
}
