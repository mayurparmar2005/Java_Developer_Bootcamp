package CollectionFrameworks.Comparator;

import java.util.Comparator;

public class StudentComparator implements Comparator<student> {
    @Override
    public int compare(student o1, student o2) {
        
        if(o1.id > o2.id){
            return 1;
        } else if(o1.id < o2.id){
            return -1;
        } else {
            return o1.name.compareTo(o2.name);
        }
    }
}
