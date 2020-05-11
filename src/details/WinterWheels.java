package details;

public class WinterWheels extends Wheels {

    private double cofWinter;
    private double cof;

    public WinterWheels(String name, double cof) {
        super(name, cof);
    }
    @Override
    public double getCof(){
        return cof * cofWinter;
    }

}

