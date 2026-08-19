package CollectionFrameworks.GarbageCollector;

import java.lang.ref.Cleaner;
import java.sql.SQLOutput;

public class Employee {

    private int ID;
    private String name;
    private int age;

    private static int nextId = 1;
    private static final Cleaner cleaner = Cleaner.create();

    private final Cleaner.Cleanable cleanable;

    // Cleanup task to run when employee becomes unreachable
    private static class State implements Runnable {
        @Override public void run() { Employee.nextId--; }
    }

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.ID = nextId++;

        // Register cleaner to decrement ID on GC
        cleanable = cleaner.register(this, new State());
    }

    public void show()
    {
        System.out.println("Id = " + ID + "\nName = " + name
                + "\nAge = " + age);
    }

    public void showNextId()
    {
        System.out.println("Next employee id will be = "
                + nextId);
    }
}

class UseEmployee {

    public static void main(String[] args)
    {

        Employee E = new Employee("GFG1", 56);
        Employee F = new Employee("GFG2", 45);
        Employee G = new Employee("GFG3", 25);

        E.showNextId(); // 4

        { // Interns block
            Employee X = new Employee("GFG4", 23);
            Employee Y = new Employee("GFG5", 21);

            E.showNextId();

            System.out.println("new Two employee objects are unreachable Garbage Collector called...");
            X = null;
            Y = null;
            System.gc(); // Request GC
        }

        // Let cleaner run
        try {
            Thread.sleep(10);
        }
        catch (Exception ignored) {
        }

        E.showNextId(); // Correct: 4
    }
}
