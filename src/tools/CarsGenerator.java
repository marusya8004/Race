package tools;

import car.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarsGenerator {


    public List<Car> generateCars() {
        Random random = new Random();
        List<Car> cars = new ArrayList<>();

        for (int i = 0 ; i < random.nextInt(10) ; i++){
            Car car = null;
            switch ( random.nextInt(5) ){
                case 0: car =  new Car ("BMW",0.95); break;
                case 1: car =  new Car("Ferrari", 1); break;
                case 2: car =  new Car("Ford", 0.75); break;
                case 3: car =  new Car("Truck",0.65); break;
                case 4: car =  new Car("Porsche",0.85); break;
                default: System.out.println("No Car");
            }

            car.setName( car.getName() + " " + (i + 1) );
            if (car != null) cars.add( car );
        }

        return cars;
    }
}

