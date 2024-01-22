package arrays;

import java.util.Comparator;

public class StudentsByHeightAndWeight implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getHeight() > o2.getHeight() && o1.getWeight() > o2.getWeight()) return 1;
        if(o1.getHeight() < o2.getHeight() && o1.getWeight() < o2.getWeight()) return -1;
        return 0;
    }
}
