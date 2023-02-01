package composition;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine("250 hp", "16V") ;
        Car c1 = new Car("black", "2009", 5, e1);

        System.out.println(c1.getColor()+c1.getDoors()+c1.getModel()+c1.getEngine().getPower()+c1.getEngine().getType());
    }
}
