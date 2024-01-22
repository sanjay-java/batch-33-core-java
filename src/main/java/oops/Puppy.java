package oops;

public class Puppy extends  Dog {
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void move(int speed){
        System.out.println("Puppy walks with speed" + speed);
    }


}
