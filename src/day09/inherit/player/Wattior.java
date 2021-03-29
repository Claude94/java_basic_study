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

    public void fireSlash(Player player) {
        System.out.printf("%s님이 %s님에게 fireSlash를 시전 했습니다\n",this.getNickName(), player.getNickName());
        if (player instanceof Mage) {
            player.hp -= 10;
            System.out.printf("%s님이 10의 피해를 입었습니다\n", this.getNickName());
            System.out.printf("현재 체력 : %s\n",player.hp);
        } else if (player instanceof Wattior){
            player.hp -= 20;
            System.out.printf("%s님이 20의 피해를 입었습니다\n", this.getNickName());
            System.out.printf("현재 체력 : %s\n",player.hp);
        } else if (player instanceof Hunter) {
            player.hp -= 15;
            System.out.printf("%s님이 15의 피해를 입었습니다\n", this.getNickName());
            System.out.printf("현재 체력 : %s\n",player.hp);
        }
    }
}
