import oops.Dog;
import Student;

public class arrayclass {
    private  static Student[] students = new Student[100];
    public static void main(String[] args) {

        int emp1 = 1000;
        int emp2 = 10001;

        ///
        int emp1000 = 1000000;

        //creating

        //<datatype> [] = new <datatype>[size];
        int[] employees = new int[1000];

        //int[] students = new int[]{1000,10001,10002};

        int[] studentsOther = {1000,10001,10002};

        // store the data
        employees[0] = 1000;
        employees[1] = 10001;

        //
        employees[999] = 100000;
    // accessing the data
        System.out.println(employees[0]);
        System.out.println(employees[1]);

        System.out.println(employees[999]);

        for(int i =0;i<1000;i++){
            employees[i] = 1000+i;
        }

        for(int i =0;i<1000;i++){
            System.out.println(employees[i]);
        }

        // []
        // length
        int l = employees.length;

        int str[] = new int[100];
        str[0] = 10000;
        str[1] = 10002;


        System.out.print(str.length);

        Dog d = new Dog();

        Dog [] dogs = new Dog[1000];
        dogs[0] = d;
        dogs[1] = new Dog();

        for(int i =0; i < dogs.length;i ++ ){
            Dog dd = dogs[i];
            System.out.print(dd.getName());
        }

        // enhanced for loop
        for(Dog di : dogs){
            System.out.print(di.getName());
        }

        // sorting
        // searching
        // rotation


        for(int i=0;i<students.length;i++)
            students[i] = new Student(i);
        int expected = 50;

    }

    public static Student findByRollNum(int rollNum){
        for(Student s : students){
            if(s.getRollNum() == rollNum){
                return s;
            }
        }
        return null;
    }

    public static Student findByRollNum(int rollNum,float gpa){
        for(Student s : students){
            if(s.getRollNum() == rollNum && s.getGpa() == gpa){
                return s;
            }
        }
        return null;
    }

    public static Student findByStudent(Student student){
        for(Student s : students){
            if(s.equals(student)){
                return s;
            }
        }

        Student s1 = new Student(1);
        Student s2 = new Student(1);

        if(s1.equals(s2)) // true

            if( s1 == s2) // false

                s1 = s2;
        if( s1 == s2) // true


        s1.compareTo(s2); // compare by height -

        s1.compareTo(s2); // compare by height and weight


            // natural order
            // Comparable interface
        // Comparator interface

        return null;
    }

    // equals
    // ==



}



// data structures
// arrays
// lists
// sets
// tree
// map
// stack
// queue

