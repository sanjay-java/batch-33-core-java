package oops;

abstract public class Animal {

    int age;
    float height;
    float weight;

    Animal(float height, float weight){
        this.height = height;
        this.weight = weight;
    }

    Animal(){}

    abstract void makeSound();

    public void move(){
        System.out.print("walk");
    }

}
