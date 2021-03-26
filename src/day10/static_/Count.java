package day10.static_;

public class Count {

    public int x; //인스턴스 필드
    public static int y; //스태틱 필드 : 공유 변수
    //인스턴스 메서드
    public void method1() {
        int z = x + y;
        System.out.println("z(instance) = " + z);
    }
    //스태틱 메서드
    public static void method2(Count c) {
        //스태틱 블록 내에서는 인스턴스 멤버를 직접 사용할 수 없습니다.
        int z = c.x + y;
        c.method1();
    }
}
