package day09.inherit.player;

public class Main {
    public static void main(String[] args) {
        Wattior w = new Wattior("킹왕짱짱");
        w.info();

        Mage m = new Mage("대마봅사");
        m.info();

        Hunter h = new Hunter("헌터");
        h.info();
    }
}
