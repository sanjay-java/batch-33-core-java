package stringsClass;

public class Strings {

    public static void main(String[] args) {

        // "hello world"
        //

        String name = new String("hello world");

        String name2 = "hello world";

        String name3 = "hello world";

        // String pool
        // string literal
        // why strings are immutable


       name.equals(name2); // true
         //name == name2; // false
       // name2 == name3; // true
       // name == name3; // false

        name.compareTo(name2); // 0

        System.out.print(name.toUpperCase());
        //
        name.charAt(1);
        name.equalsIgnoreCase("HELLO WORLD");
        name.split(" ");
        String name4 = "";
        name4.equals("");
        name4.equals(null);
        if(name4 == "")

        if(name4 == null);

        // null


    }

}
