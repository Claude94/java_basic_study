package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("게임 인원 (2 ~ 4명) ==> ");
        int gameMember = sc.nextInt();
        if (gameMember > 4) {
            return;
        } else if (gameMember < 2) {
            return;
        }
        String[] player = new String[gameMember];

        System.out.println("플레이어 이름을 등록 합니다.");
        for (int n = 0; n < player.length; n++) {
            System.out.printf("%d번 플레이어 이름 : ", n + 1);
            player[n] = sc.next();
        }
        System.out.println(Arrays.toString(player));
        System.out.print("실탄 개수 (6개 미만) ==> ");
        int bulletNum = sc.nextInt();
        if (bulletNum > 6) {
            return;
        }
        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");
        //탄창 배열을 만든다
        boolean[] magazine = new boolean[6];
        System.out.println(Arrays.toString(magazine));
        int successConunt = 0;
        while (successConunt < bulletNum) {
            int bullet = (int) (Math.random() * (magazine.length));
            if (!magazine[bullet]) {
                magazine[bullet] = true;
                successConunt++;
            }
        }
        System.out.println("탄창: " + Arrays.toString(magazine));
        int firstPlayer = (int) (Math.random() * (gameMember));
        for (int i = 0; i < player.length; i++) {
            System.out.println(i);
        }

    }
}
