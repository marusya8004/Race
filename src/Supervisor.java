import car.Car;
import car.Transport;
import factory.CarFactory;
import tools.Point;
import tools.RoutePoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Supervisor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Start choose (y/n) ");

        if (in.next().equals("y")) {

            System.out.println("Сhoose your car: BMW, Ferrari, Truck, Ford, Porsche");
            String userCarName = in.next();
            Car userCar = CarFactory.getCarByName(userCarName);
            userCar.setName(userCar.getName() + " (Your car)");
        }
    }

    static RoutePoint generateRout() {
        List<Point> pointList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < random.nextInt(100); i++) {
            pointList.add(new Point(Math.random(), Math.random(),Math.random()));
        }
        return new RoutePoint(pointList);
    }

    static void startRace (RoutePoint rout, Transport player, Transport enemy){
        String input = null;
        int iPlayer = 0;
        int iEnemy = 0;

        do {
            System.out.println("Start race? Press any key to continue, 'r' to exit");
            input = new Scanner(System.in).next();
            if (iPlayer + rout.getPointList().size() > rout.getPointList().size())
                break;
            if (iEnemy + rout.getPointList().size() >  rout.getPointList().size())
                break;
            player.setCurrentPosition(rout.getPointList().get(iPlayer));
            enemy.setCurrentPosition(rout.getPointList().get(iEnemy));
            iPlayer= iPlayer + player.getCurrentSpeed();
            iEnemy= iEnemy + enemy.getCurrentSpeed();
        }
        while (!input.equals("r"));
        if (iPlayer >  iEnemy) System.out.println(" Player wins! ");
        else System.out.println( "Enemy wins!");
    }

    public void endRace() {
        System.out.println("End race!");
    }



}