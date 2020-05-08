package car;

import details.Engine;
import details.Wheels;
import tools.Point;

public class Car extends Transport {

    Engine engine;
    Wheels wheels;
    Point position;

    public Car(String name, Engine engine, Wheels wheels) {
        super(name);
        this.engine = engine;
        this.wheels = wheels;
        this.position = new Point(0.0,0.0);
    }

    public Engine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Point getPosition() {
        return position;
    }

    public void setPosition(Point position) {
        this.position = position;
    }
}
