package day08.Player;

public class main {
    public static void main(String[] args) {
        Player kim = new Player("김철수");
        System.out.println("===============================");
        Player park = new Player("박영희", 20);

        park.info();
        System.out.println("kim : " + kim);
        kim.info();
//        System.out.println("kim의 주소값: " + kim);
//        System.out.println("park 주소값: " + park);
//
//        park.attack(kim);
    }
}
