package arrays;

import java.util.Comparator;

public class StudentByHeighWeightGPA implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getHeight() > o2.getHeight() && o1.getWeight() > o2.getWeight() && o1.getGpa() > o2.getGpa()) return 1;
        if(o1.getHeight() < o2.getHeight() && o1.getWeight() < o2.getWeight() && o1.getGpa() < o2.getGpa()) return -1;
        return 0;
    }
}
