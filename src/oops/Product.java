package oops;

public class Product {
    double price;

    final double length = 5d;

    // manufacture name
    static String logo;

    Dog dog;

     Product(int price){
         // no-arg constructor of parent
         super();
        this.price = price;
    }

    Product(){
        super();
    }


    static void printLogo(){
         System.out.print(logo);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Product p = new Product(20);
        System.out.print(p.getPrice());

        Product p2 = new Product();
        System.out.print(p2.getPrice()); // ?

        String s = Product.logo;

        Product.printLogo();


    }

}
