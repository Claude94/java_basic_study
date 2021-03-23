package day07;

//실행용 클래스는 main메서드를  포함합니다
public class PhoneMain {
    public static void main(String[] args) {

        //갹체의 생성
        phone galaxyS20 = new phone();
//        phone iphoneX = new phone();

        //객체의 속성과 기능을 참조 : 참조연산자 . 을 사용
        galaxyS20.showSpec();

        System.out.println("=========================");

        phone iPhoneX = new phone("아이폰X");
        iPhoneX.showSpec();

        System.out.println("=========================");

        phone lgV6 = new phone("LG V6", "에메랄드 그린");
        lgV6.showSpec();
        /*galaxyS20.model = "갤럭시S20";
        galaxyS20.color = "펄 블루";
        galaxyS20.price = 1000000;

        iphoneX.model = "아이폰X";
        iphoneX.color = "스노우 화이트";
        iphoneX.price = 1200000;

        galaxyS20.powerOn();
        galaxyS20.showSpec();
        galaxyS20.powerOff();

        iphoneX.showSpec();
        iphoneX.powerOff();*/
    }
}
