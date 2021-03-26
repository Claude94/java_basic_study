package day10.static_;

public class Main {
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.x = 5;
        Count.y = 10; // this의미 없음

        Count c2 = new Count();
        c2.x += 10;
        Count.y += 10;

        System.out.println("c1 = " + c1.x);
        System.out.println("c2 = " + c2.x);
        System.out.println("==============");
        System.out.println("c1 = " + Count.y);
        System.out.println("c2 = " + Count.y);

        System.out.println("==============");
        c1.method1();
        c2.method1();

        Count.method2(c1);
        Count.method2(c2);

        Calculator.calcAreaCircle(5);
    }
}
