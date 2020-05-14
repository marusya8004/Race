import car.Transport;
import reader.impl.Configuration;
import exception.NoSuchTransport;
import exception.UnableToReadException;
import factory.TransportFactory;
import reader.impl.StreamTextFileReader;
import tools.Point;
import tools.RoutePoint;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Supervisor {

    public static void main(String[] args) throws NoSuchTransport {

        RoutePoint rout = generateRout();

        Scanner in = new Scanner(System.in);
        System.out.println("Start choose (y/n) ");

        if (in.next().equals("y")) {

            // making comments this part of the program!!!


//            System.out.println("Сhoose your car: BMW, Ferrari, Truck, Ford, Porsche");
//            String playerCarName = in.next();
//            Transport playerCar;
//            try {
//                playerCar = TransportFactory.getTransportbyName(playerCarName);
//
//            } catch (NoSuchTransport e) {
//                throw new NoSuchTransport("Write correct transport");
//            }
//            System.out.println("Сhoose your car: BMW, Ferrari, Truck, Ford, Porsche");
//            String enemyCarName = in.next();
//            Transport enemyCar;
//            try {
//                enemyCar = TransportFactory.getTransportbyName(enemyCarName);
//            } catch (NoSuchTransport e) {
//                throw new NoSuchTransport("Write correct transport");
//            }

            String playerCarName = Configuration.getPlayer();
            Transport playerCar =  TransportFactory.getTransportbyName(playerCarName);

            String enemyCarName = Configuration.getEnemy();
            Transport enemyCar =  TransportFactory.getTransportbyName(enemyCarName);


            enemyCar.setCurrentPosition(rout.getPointList().get(0));
            playerCar.setCurrentPosition(rout.getPointList().get(0));

            System.out.println("PlayerCar"+ playerCar);
            System.out.println("EnemyCar" + enemyCar);


            startRace(rout,playerCar,enemyCar);

        }
    }

            // making comments this part of the program!!!

//    static RoutePoint generateRout() {
//        List<Point> pointList = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < random.nextInt(100); i++) {
//            pointList.add(new Point(Math.random(), Math.random(),Math.random()));
//        }
//        return new RoutePoint(pointList);
//    }


    public static RoutePoint generateRout() {
        StreamTextFileReader streamTextFileReader = new StreamTextFileReader("src/resources/1.txt");
        List<Point> pointList = new ArrayList<>();
        String[] points = new String[]{};
        try {
            points = streamTextFileReader.read().split("\n");
        } catch (UnableToReadException e) {
            e.printStackTrace();
        }
        for (String point : points){
            String[] xy = point.split(",");
            pointList.add(new Point(Double.parseDouble(xy[0]), Double.parseDouble(xy[1]),Math.random()));
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

}
