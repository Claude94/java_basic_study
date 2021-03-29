package day09.inherit.player;

public class Mage extends Player{

    int mana;

    //생성자
    public Mage(String nickName) {
        super(nickName);
        this.mana = 50;
    }

    @Override //오버라이딩 룰을 위반했는지 확인
    public void info() {
        super.info();
        System.out.println("# 마력 : " + mana);
    }

    public void meteo(Player ...players ) {
        if (players.length > 0) {
            System.out.printf("%s님 메테오 시전", this.getNickName());
            for (Player player : players) {
                if (player == this) {
                    continue;
                }
                int damage = (int) (Math.random() * 6) + 10;
                player.hp -= damage; //체력 차감
                System.out.printf("%s님이 %d의 피해를 입었습니다 (남은 체력: %d)\n",player.getNickName(), damage, player.hp);

            }
        }
    }
}
