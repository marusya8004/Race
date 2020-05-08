package tools;

public class Point {

    private double x;
    private double y;
    private double cof;

    public Point(double x, double y, double cof){
        this.x = x;
        this.y = y;
        this.cof =cof;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getCof() {
        return cof;
    }

    public void setCof(double cof) {
        this.cof = cof;
    }
}
