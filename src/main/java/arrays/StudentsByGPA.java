package arrays;

import java.util.Comparator;
import java.util.SimpleTimeZone;

public class StudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return 0; // gpa
    }
}
