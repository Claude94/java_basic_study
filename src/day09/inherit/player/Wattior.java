package day09.inherit.player;

//상위클래스로부터 상속받은 클래스를 지식, 하위 클래스(sub class)라고 부릅니다.
//상속은 is-a관계를 만족합니다.
public class Wattior extends Player {

    int rage;

    //생성자
    public Wattior(String nickName) {
        super(nickName); //부모의 생성자를 호출
        this.rage = 60;
    }

    @Override //오버라이딩 룰을 위반했는지 확인
    public void info() {
        super.info(); //부모의 info를 호출하는 것으로 player의 메세드를 불러 온다
        System.out.println("# 분노 : " + rage);
    }

    void fireSlash() {

    }
}
