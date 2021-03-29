package day11.poly.basic.car;

public class Driver {

    void drive(Car c) { //xx.drive(new Sonata)
        System.out.println("운전을 시작합니다");
        c.run();
    }

    Car buyCar(String carName) {
        if (carName.equals("투산")) {
            System.out.println("투산을 구매 합니다");
            return new Tucsan();
        } else if (carName.equals("소나타")) {
            System.out.println("소나타를 구매 합니다");
            return new Sonata();
        } else if (carName.equals("박스터")) {
            System.out.println("박스터를 구매합니다");
            return new Boxster();
        } else {
            System.out.println("해당 타입의 차량이 없습니다");
            return new Boxster();
        }
//    void drive(Tucsan t) {
//        System.out.println("운전을 시작합니다");
//        t.run();
//    }
//    void drive(Boxster b) {
//        System.out.println("운전을 시작합니다");
//        b.run();
//    }
    }
}
