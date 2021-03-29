package day11.poly.casting;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.m1();
        parent.m2();
//        parent.m3();

        System.out.println("===================");
        //타입이 올라가면 그전에 사용하던 것을 사용할 수 없게 된다
        Parent child = new Child();
        child.m1();
        child.m2();
        //사용이 필요할 시에 일시적으로 다운 케스팅을 한다
        ((Child)child).m3();
        System.out.println("====================");
        //다운캐스팅은 한번 업캐스팅 된 객체만 사용이 가능하다
//        Child c = (Child) new Parent();

        Parent p = new Parent();
        if (p instanceof Child) {
            Child c = (Child) p;
        } else {
            System.out.println("변환을 수행 할 수 없습니다");
        }
    }
}
