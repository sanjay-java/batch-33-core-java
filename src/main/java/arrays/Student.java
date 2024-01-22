package arrays;

public class Student implements Comparable<Student>{
   private int rollNum;
    private float height;
    private float weight;
    private float gpa;
    private int departmentId;

    public Student(int rollNum, float height, float weight, float gpa, int departmentId) {
        this.rollNum = rollNum;
        this.height = height;
        this.weight = weight;
        this.gpa = gpa;
        this.departmentId = departmentId;
    }

    public Student()
    {

    }

    @Override
    public boolean equals(Object other){

        if( other instanceof Student){
            Student otherStudent = (Student) other;
            return this.rollNum == otherStudent.rollNum;
        }


        return false;
    }


    public Student(int rollNum){
        this.rollNum = rollNum;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public int compareTo(Student o) {
        if(this.height > o.height ) return 1;
        else if(this.height < o.height) return -1;
        return 0;
    }
}

// positive number +1 greater
// negative number -1 lesser
// 0 means equal
