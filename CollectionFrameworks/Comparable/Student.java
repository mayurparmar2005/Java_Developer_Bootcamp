package CollectionFrameworks.Comparable;

import CollectionFrameworks.Comparator.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    int age;
    String name;
    int marks;

    public Student(int age, String name, int marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }



    @Override
    public String toString() {
        return "{" +
                "age=" + age +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(18, "Aman",78));
        students.add(new Student(19, "Alice", 82));
        students.add(new Student(17, "Ruhsil", 93));
        students.add(new Student(18, "Bob", 92));

        System.out.println(students);

        Collections.sort(students);

        System.out.println(students);


    }

    @Override
    public int compareTo(Student o) {
        if(this.age > o.age) {
            return 1;
        }
        if(this.age < o.age){
            return -1;
        }else{
            return 0;
        }
    }
}
