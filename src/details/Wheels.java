package details;

import Exceptions.NoSuchCof;

public class Wheels  {

    private String wheelsName;
    private double cofWheels;

    public Wheels(String name,double cofWheels) {
        this.wheelsName = name;
        this.cofWheels = cofWheels;
    }

    public double getCofWheels() {
        return cofWheels;
    }

    public void setCofWheels (double cofWheels) throws NoSuchCof {
        if (cofWheels  < 0) {
            throw new NoSuchCof ("Choose correct coefficient");
        }
        this.cofWheels = cofWheels;
    }

    public String getWheelsName() {
        return wheelsName;
    }

    public void setWheelsName(String wheelsName) {
        this.wheelsName = wheelsName;
    }
}