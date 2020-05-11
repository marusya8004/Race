package car;

import details.Engine;
import details.Wheels;
import tools.Point;

public class Porsche extends Car{
    public Porsche(String name, Engine engine, Wheels wheels, Point currentPosition) {
        super(name, engine, wheels, currentPosition);
    }
}