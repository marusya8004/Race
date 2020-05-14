package factory;

import exception.NoSuchTransport;
import car.*;
import details.Engine;
import details.Wheels;
import tools.Point;

import java.lang.reflect.InvocationTargetException;

public class TransportFactory {

    public static Transport getTransportbyName(String name) throws NoSuchTransport {
        String carPath =  name;
        switch (name){
            case "BMW": return getBMW(carPath);
            case "Ferrari": return getFerrari(carPath);
            case "Ford": return getFord(carPath);
            case "Truck": return getTruck(carPath);
            case "Porsche": return getPorsche(carPath);
            default: return getDefaultCar(carPath);

        }
    }

    public static Transport getDefaultCar (String carInput) throws NoSuchTransport {
        Class<?> curClass;
        try {
            curClass = Class.forName("car."+ carInput);
            Class[] ClassParams = {String.class, Engine.class, Wheels.class, Point.class};
            return (Transport) curClass.getConstructor(ClassParams)
                    .newInstance("Defoltclass", new Engine("DE", 20), new Wheels("Dw", Math.random()), null);
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw new NoSuchTransport("Write correct transport");
        }
    }


    public static Ferrari getFerrari(String carInput) {
        Class<?> curClass;
        try {
            curClass = Class.forName("car."+ carInput);
            Class[] ClassParams = {String.class,Engine.class,Wheels.class, Point.class};
            return  (Ferrari) curClass.getConstructor(ClassParams).newInstance("Ferrari",
                    new Engine("FerrariEngine",1.0), new Wheels("FW",Math.random()),
                    new Point(Math.random(),Math.random(),Math.random()));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static BMW getBMW(String carInput){
        Class<?> curClass;
        try {
            curClass = Class.forName("car."+ carInput);
            Class[] ClassParams = {String.class,Engine.class,Wheels.class, Point.class};
            return  (BMW) curClass.getConstructor(ClassParams).newInstance("BMW", new Engine
                    ("BMWEngine",0.95),new Wheels("BW", Math.random()),
                    new Point(Math.random(),Math.random(),Math.random()));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Ford getFord(String carInput){
        Class<?> curClass;
        try {
            curClass = Class.forName("car."+ carInput);
            Class[] ClassParams = {String.class,Engine.class,Wheels.class, Point.class};
            return  (Ford) curClass.getConstructor(ClassParams).newInstance("Ford", new Engine
                    ("FordEngine",0.75), new Wheels("FORW",Math.random()),
                    new Point(Math.random(),Math.random(),Math.random()));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Truck getTruck(String carInput){
        Class<?> curClass;
        try {
            curClass = Class.forName("car."+ carInput);
            Class[] ClassParams = {String.class,Engine.class,Wheels.class, Point.class};
            return  (Truck) curClass.getConstructor(ClassParams).newInstance("Truck", new Engine
                    ("TruckEngine",0.65), new Wheels("TW", Math.random()),
                    new Point(Math.random(),Math.random(),Math.random()));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Porsche getPorsche(String carInput){
        Class<?> curClass;
        try {
            curClass = Class.forName("car."+ carInput);
            Class[] ClassParams = {String.class,Engine.class,Wheels.class, Point.class};
            return  (Porsche) curClass.getConstructor(ClassParams).newInstance("Porsche", new Engine
                    ("PorscheEngine",0.85), new Wheels("PW",Math.random()),
                    new Point (Math.random(),Math.random(),Math.random()));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

}
