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
        sc.nextLine(); //위에서 발생한 nextLine의 \n을 처리하는 구문
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
        //선턴 플레이어 랜덤 결정
        //턴수를 저장할 변수를 선언 (player 배열의 인덱스)
        //ex) 현재 턴수: 0번이면 첫번째 플레이어의 턴
        int firstPlayer = (int) (Math.random() * (gameMember));
        System.out.printf("\n%s님부터 시작합니다.\n", player[firstPlayer]);
        //격잘 전 총알 위치를 랜덤으로 설정

        int bulletPosition = 0;
        while (true) {
            bulletPosition = (int) (Math.random() * (magazine.length));
            System.out.printf("\n[%s님의 턴] 실린더를 돌립니다\n", player[firstPlayer]);

            System.out.println("# 엔터를 누르면 격발합니다");
            sc.nextLine(); //실제로 엔터를 입력받는 기능

            //사망 판정
            if (magazine[bulletPosition]) {
                //사망
                System.out.printf("\n[%s]님사망", player[firstPlayer]);
                //사망자를 배열에서 삭제하고
                for (int i = firstPlayer; i < player.length - 1; i++) {
                    player[i] = player[i + 1];
                }
                String[] temp = new String[player.length];

                //탄창배열에서 총알이 나간 위치를 수정
                magazine[bulletPosition] = false;
                bulletNum--;
                //게임 종요 조건 판단
                // 남은 플레이어가 1명일때, 총알이 모두 소진되었을 때
              /*  if (player) {

                } else if (bulletNum == 0) {

                }*/
            } else {
                //생존
                //턴을 넘겨야 한다
                System.out.println("살았습니다");
                if (firstPlayer == player.length - 1) {
                    //마지막번 플레이어는 다음 턴을 0으로 조절
                    firstPlayer = 0;
                } else {
                    firstPlayer++;
                }
            }
        }
    }
}
