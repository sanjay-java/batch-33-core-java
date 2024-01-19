package oops;

 public class Dog extends Animal{

    int age;

    Dog(int age){
        this.age = age;
    }

    public Dog(){
        // super(1.0f, 20f);
    }

    @Override
    void makeSound() {
        System.out.println("barks");
    }

   public void move(){
        System.out.println("Dog walks");
    }

    public void move(int speed){
        System.out.println("Dog walks with speed" + speed);
    }

    public void move( int speed, boolean makesound){
        System.out.println("moving with speed"+speed+" with sound"+ makesound);
    }

    // method overloading -> compile time polymorphism
    // method overriding -> runtime polymorphism

    protected void run(){

    }

     public String getName() {
        return "";
     }
 }
