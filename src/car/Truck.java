package car;

import details.Engine;
import details.Wheels;
import tools.Point;

public class  Truck extends Car{

    public  Truck(String name, Engine engine, Wheels wheels, Point currentPosition) {
        super(name, engine, wheels, currentPosition);
    }

}

