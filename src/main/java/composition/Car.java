package composition;

public class Car {

    private String color;
    private String model;
    private int doors;
    private Engine engine; //car has engine

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car() {
    }

    public Car(String color, String model, int doors, Engine engine) {
        this.color = color;
        this.model = model;
        this.doors = doors;
        this.engine = engine;
    }
}
