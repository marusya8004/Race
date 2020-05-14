package details;

public class SummerWheels extends Wheels {

    private double cofSummer;
    private double cof;

    public SummerWheels(String name, double cof) {
        super(name, cof);
    }

    @Override
    public double getCof() {
        return cof * cofSummer;
    }

}