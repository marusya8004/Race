package car;

import details.Engine;
import details.Wheels;
import tools.Point;

public class Ford extends Car{
    public Ford(String name, Engine engine, Wheels wheels, Point currentPosition) {
        super(name, engine, wheels, currentPosition);
    }
}
