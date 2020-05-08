package factory;

import car.*;
import details.Engine;
import details.Wheels;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public static Car getCarByName(String name){
        String carPath =  null;
        switch (name){
            case "BMW": return getBMW(carPath);
            case "Ferrari": return getFerrari(carPath);
            case "Ford": return getFord(carPath);
            case "Truck": return getTruck(carPath);
            case "Porsche": return getPorsche(carPath);
            default: throw new IllegalArgumentException("Wrong model:" + name);
        }
    }

    private static Ferrari getFerrari(String carInput){
        Class<?> curClass;
        try {
            curClass = Class.forName(carInput);
            Class[] FerrariClassParams = {String.class, Engine.class, List.class};
            List<Wheels> wheels = createWheels();
            return  (Ferrari) curClass.getConstructor(FerrariClassParams).newInstance("Ferrari", new Engine(1.0), wheels);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static BMW getBMW(String carInput){

        Class<?> curClass;
        try {
            curClass = Class.forName(carInput);
            Class[] FerrariClassParams = {String.class, Engine.class, List.class};
            List<Wheels> wheels = createWheels();
            return  (BMW) curClass.getConstructor(FerrariClassParams).newInstance("BMW", new Engine(0.95), wheels);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static Ford getFord(String carInput){
        Class<?> curClass;
        try {
            curClass = Class.forName(carInput);
            Class[] FerrariClassParams = {String.class, Engine.class, List.class};
            List<Wheels> wheels = createWheels();
            return  (Ford) curClass.getConstructor(FerrariClassParams).newInstance("Ford", new Engine(0.75), wheels);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Truck getTruck(String carInput){
        Class<?> curClass;
        try {
            curClass = Class.forName(carInput);
            Class[] FerrariClassParams = {String.class, Engine.class, List.class};
            List<Wheels> wheels = createWheels();
            return  (Truck) curClass.getConstructor(FerrariClassParams).newInstance("Truck", new Engine(0.65), wheels);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Porsche getPorsche(String carInput){
        Class<?> curClass;
        try {
            curClass = Class.forName(carInput);
            Class[] FerrariClassParams = {String.class, Engine.class, List.class};
            List<Wheels> wheels = createWheels();
            return  (Porsche) curClass.getConstructor(FerrariClassParams).newInstance("Porsche", new Engine(0.85), wheels);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static List<Wheels> createWheels(){
        List<Wheels> wheels = new ArrayList<>();
        for (int j = 0 ; j < 4 ; j++){
            wheels.add( new Wheels("summer",0.8) );
        }
        return wheels;
    }

}
