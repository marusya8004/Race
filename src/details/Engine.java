package details;

import exception.NoSuchMaxSpeed;

public class Engine {

    private String engineName;
    private double maxSpeed;

    public Engine(String name, double maxSpeed) {
        this.engineName = name;
        this.maxSpeed = maxSpeed;
    }

    public Engine() {
        
    }

    public Engine(double v) {
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

    public void setMaxSpeed(double maxSpeed) throws NoSuchMaxSpeed {
        if (maxSpeed < 0) {
            throw new NoSuchMaxSpeed("Choose correct speed");
        }
        this.maxSpeed = maxSpeed;
    }
}



