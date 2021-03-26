package day08.Player;

public class Player {

    String name;
    int level;
    int hp;


    Player() { //this()사용해서 중복코드를 줄일 수 있다 (첫 줄에 입력)
        this("이름 없음", 1);
        System.out.println("1번 생성자 호출");
    }

    Player(String name) {
        this(name, 1);
        Player mmm =new Player(name, 1); //나의 다른 생성자를 연계호출하겠다
        mmm.info();
        System.out.println("mmm : " + mmm);
        System.out.println("this : " + this);
        System.out.println("2번 생성자 호출");
    }

    Player(String name, int level) {
        System.out.println("3번 생성자 호출");
        this.name = name;
        this.level = level;
        this.hp = this.level * 50;
    }

    //    void attack(Player target) {
//        System.out.printf("%s가 %s를 공격합니다", this.name, target.name);
//    }
    void info() {
        System.out.printf("이름 : %s, 레벨 : %d, 체력 : %d\n", this.name, this.level, this.hp);
    }
}
