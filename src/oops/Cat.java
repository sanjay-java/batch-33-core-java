package oops;

public class Cat extends Animal implements Species, Species2 {

 @Override
    void makeSound() {
        System.out.print("meow");
    }

    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
