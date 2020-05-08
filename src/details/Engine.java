package details;

public class Engine {

    private String engineName;
    private final double maxSpeed;

    public Engine(String name, double maxSpeed) {
        this.engineName = name;
        this.maxSpeed = maxSpeed;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }
}


