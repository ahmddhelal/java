package casting;

public class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Dog is making noise");
    }

    public void dogGrow() {
        System.out.println("Dog Grrrrrrrrr");
    }
}
