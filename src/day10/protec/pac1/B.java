package day10.protec.pac1;

public class B {

    B() {
        A a1 = new A(10); //default 생성자
        A a2 = new A("안녕"); //protected 생성자

        a1.f1 = 10; a1.f2 =20;
        a1.m1(); a1.m2();
    }
}
