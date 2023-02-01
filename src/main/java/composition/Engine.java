package composition;

public class Engine {

    private String power;
    private String type;

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Engine() {

    }

    public Engine(String power, String type) {
        this.power = power;
        this.type = type;
    }
}
