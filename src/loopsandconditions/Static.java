package loopsandconditions;
public class Static {
    // Static variable
    private static int staticVariable = 0;

    // Static method
    public static int getStaticVariable() {
        return staticVariable;
    }

    public static void main(String[] args) {

        Static s=new Static();
        System.out.println("Static Variable: " + Static.getStaticVariable());
        Static.staticVariable = 42;
        System.out.println("Static Variable (after modification): " + s.getStaticVariable());
    }
}