package day09.inherit.player;

public class Mage extends Player{

    int mana;

    //생성자
    public Mage(String nickName) {
        super(nickName);
        this.mana = 50;
    }

    @Override //오버라이딩 룰을 위반했는지 확인
    void info() {
        super.info();
        System.out.println("# 마력 : " + mana);
    }

    void meteo() {

    }
}
