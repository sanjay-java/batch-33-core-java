package loopsandconditions;

public class Loops {

    public static void main(String[] args) {

        int x = 0;
        x = x +1;
        x = x +1;
        x = x +1;
        x = x +1;
        x = x +1;

        // 3 loops

        // for
        // while
        // do while

        // initialize, condition, change

        int y = 100;
        while( y < 100){

            System.out.println(y);
            y = y +1;
        }

//        for(int i = 0; i > 0; i++){
//            System.out.print(i);
//        }
//
//        int j =0;
//        for( ; ; j++){
//            System.out.print(j);
//            if(j < 100)
//                break;
//        }

//        for( ; ; ){
//            System.out.print(j);
//        }



        do {
            y = y +1;
            System.out.println(y);
        }while( y < 100);

        for(int i =0;i < 100;i++){
            if(i %2 ==0){
                //
            }
        }

        for(int i =0;i < 100;i++){

            for(int k =0;k < 100;k++){
                System.out.println(i+k);
            }
        }



    }
}
