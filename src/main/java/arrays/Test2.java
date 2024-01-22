package arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test2 {
    public static void main(String[] args) {

        Student[] students = new Student[10];

        Arrays.sort(students); // based on gpa

        Comparator sByHw = new StudentByHeighWeightGPA();
        Arrays.sort(students,sByHw);

       Arrays.sort(students, new StudentsByGPA());

    }
}
