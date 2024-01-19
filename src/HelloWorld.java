import oops.Dog;
import oops.Puppy;

public class HelloWorld {

    public static void main(String args[]){

        System.out.println("Hello World! - some other changes");

        Dog d = new Dog();
        d.move();

        d.move(3);
        d.move(3,true);

        Puppy p = new Puppy();
        p.move(3);

        Dog d2 = new Puppy();
        d2.move(3);

        Dog d3 = new Dog();
        d3.move(3);

        d3 = d2;

        d3.move(3);

        p.getWeight();






    }

}
