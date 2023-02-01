package casting;


public class Main {
    public static void main(String[] args) {



        //Primitive Type >> Up Casting
        int x = 5 ;
        double y = x ;

        //Primitive Type >> Down Casting
        double a = 5.5 ;
        int b = (int) a;



        //Reference Type >> Up Casting
        Animal myAnimal = new Dog() ;
        myAnimal.makeNoise();
//        myAnimal.dogGrow() ; //error01


        //Reference Type >> Down Casting
        Dog myDog = (Dog) new Animal(); //casting on instantiation level
        myDog.makeNoise();
        myDog.dogGrow() ;
        ((Dog) myAnimal).dogGrow() ; //error01 fix .. casting on calling level



    }


}