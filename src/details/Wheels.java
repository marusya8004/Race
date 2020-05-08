package details;

public class Wheels  {

    private String wheelsName;
    private double cof;

    public Wheels(String name,double cof) {
        this.wheelsName = name;
        this.cof = cof;
    }

    public double getCof() {
        return cof;
    }

    public void setCof(double cof) {
        this.cof = cof;
    }

    public String getWheelsName() {
        return wheelsName;
    }

    public void setWheelsName(String wheelsName) {
        this.wheelsName = wheelsName;
    }
}