package polymorphism;


public class Main {
    public static void main(String[] args) {

        Animal animalDog = new Dog();
        Animal animalCat = new Cat();

        animalCat.eat();
        animalDog.eat();


    }


}