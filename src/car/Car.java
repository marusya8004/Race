package car;

import details.Engine;
import details.Wheels;
import tools.Point;

public class Car extends Transport {
    public Car(String name, Engine engine, Wheels wheels, Point currentPosition){
            super(name,engine,wheels,currentPosition);
        }

    public Car(String bmw, double v) {
        super();
    }
}

