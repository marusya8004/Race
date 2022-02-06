package car;

import exception.NoSuchCof;
import exception.NoSuchMaxSpeed;
import details.Engine;
import details.Wheels;
import tools.Point;

public class Transport {

    private Point currentPosition;
    private String name;
    private Engine engine;
    private Wheels wheels;

    public Transport(String name, Engine engine, Wheels wheels, Point currentPosition){
        this.name = name;
        this.engine = engine;
        this.wheels = wheels;
        this.currentPosition = currentPosition;
    }


    public Point getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(Point currentPosition) {
        this.currentPosition = currentPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public int getCurrentSpeed()  {
        try {
            this.engine.setMaxSpeed(-1);

        } catch (NoSuchMaxSpeed noSuchMaxSpeed) {

            noSuchMaxSpeed.printStackTrace();

        }
        try {
            this.wheels.setCofWheels(-1);

        } catch ( NoSuchCof noSuchCof) {

            noSuchCof.printStackTrace();

        }


        return  (int)( this.engine.getMaxSpeed()*((this.wheels.getCofWheels()+this.currentPosition.getCof())/2));

    }
}
