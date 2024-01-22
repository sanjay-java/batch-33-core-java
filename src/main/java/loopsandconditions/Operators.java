package loopsandconditions;

public class Operators {

    public static void main(String[] args) {

        int x = 10;
        int y = 3;

        System.out.print(x%y);  // 1
        System.out.print(x/y); // 3

        x++;
        ++x;
        x--;
        --x;

        boolean a = true;
        boolean b = false;

        boolean c = a || b;
        boolean d = !a;
        boolean e = !a && b;

        boolean f = !a && c || !d;

        if(x < 10){
            x = x + 10;
            x += 10;
        }


        if(x%2 == 0){
            System.out.println("even");
            //
            //
        }else{
            //
            //
            System.out.println("odd");
        }

        if(x == 0){
            System.out.print("zero");
        }else if(x%2 == 0){
            System.out.println("even");

        }else{

            System.out.println("odd");
        }

        switch(x){
            case 2:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
            default:
                System.out.println("osmething else");
        }


        int z = 100;

        if(z >=100)
            z /= 8;


        // ternary operator
        // (condition) ? <true> : <false>;

        if( x > 10){
            z = 20;
        }else{
            z = 0;
        }

        z = x > 10 ? 20 : 0;

         x = 10;
        z = x > 10 ? 20 : x < 10 ? 4 : 0;


        z %= 4;


    }

}
