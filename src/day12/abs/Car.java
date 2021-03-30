package day12.abs;
//추상 클래스
public abstract class Car {

    private String model;
    private int price;


    //추상 메서드
    public abstract void start(); //주행 기능 명세

    public static void staticMet() {} //공통 명세
    public void instanceMet() {} // 옵선 명세
    public final void finalMet() {} //옵션 변경 금지 명세
}
