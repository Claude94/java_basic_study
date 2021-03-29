package day11.poly.basic.car;

import day10.protec.pac1.B;

public class Main {
    public static void main(String[] args) {
//        다향성 특징
      /*  Car myCar = new Car();

        myCar.frontLeft = new NexenTire();
        myCar.frontRight = new KumhoTire();*/

        Car t1 = new Tucsan();
        Car t2 = new Tucsan();
        Car t3 = new Tucsan();
        Car s1 = new Sonata();
        Car s2 = new Sonata();
        Car s3 = new Sonata();
        Car b1 = new Boxster();
        Car b2 = new Boxster();
        Car b3 = new Boxster();
        Car b4 = new Boxster();

        Car[] cars = {t1, t2, t3, s1, s2, s3, b1, b2, b3, b4};
        /*for (Car car : cars) {
            car.run();
        }*/

        Driver driver = new Driver();
        driver.drive(b1);
        System.out.println("===============");

        Sonata myCar = (Sonata) driver.buyCar("소나타");
        driver.drive(myCar);

        (myCar).joinMenberShip();

        Car[] cars2 = {myCar};

        System.out.println("====================");
        CarShop carShop = new CarShop();
        carShop.sellCar(new Tucsan());

        "".equals("");
    }
}
