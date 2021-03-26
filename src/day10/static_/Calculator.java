package day10.static_;

public class Calculator {

    String madeBy; //제조사
    String color;//색상
    static double pi;//원주율
    //정적 초기화자
    //정적 데이터의 초기값을 세팅
    static {
        System.out.println("정적 데이터 생성");
    }
    //메서드내부에서 this필드가 필요하면 non-Static
    //this필드가 필요 없으면 Static
    void paint(String color) {
        this.color = color;
    }
    //원에 넚이를 구해주는 기능
    static double calcAreaCircle(int r) {
        return pi * r * r;
    }
}
