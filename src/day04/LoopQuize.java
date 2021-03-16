package day04;

import java.util.Scanner;

public class LoopQuize {
    public static void main(String[] args) {
        System.out.println("~~~~~~~ 재미있는 사칙연산 게임 ~~~~~~~");
        System.out.println("[즐겁게 문제를 푸시다가 지며우면 0을 누르세요~]");
        System.out.println("# 엔터를 누르면 시작합니다");
        System.out.println("==============================");
        int conuto = 0;
        int conutx = 0;
        int num1 = 0, num2 = 0;
        int levelnum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("난이도를 입력하세요 [상, 중, 하]");
        System.out.print(">> ");
        String level = sc.next();
        switch (level) {
            case "상":
                System.out.println("상급 난이도는 1~2000까지의 범위로 출제");
                 levelnum = 2000;
                break;
            case "중":
                levelnum = 200;
                System.out.println("상급 난이도는 1~200까지의 범위로 출제");
                break;
            case "하":
                levelnum = 20;
                System.out.println("상급 난이도는 1~20까지의 범위로 출제");
                break;
            default:
                System.out.println("상, 중, 하 중에 선택하세요 상급 난이도로 자동 시작 ");
                levelnum = 2000;
        }
        while (true) {
            //랜덤 값 출력
            num1 = (int) (Math.random() * levelnum) + 1;
            num2 = (int) (Math.random() * levelnum) + 1;
            int oper = (int) (Math.random() * 4) + 1;
            //문제 정답 구하는 기능
            int realasr = 0;
            if (1 == oper) {
                oper = '/';
                realasr = num2 / num1;
            } else if (2 == oper) {
                oper = '-';
                realasr = num2 - num1;
            } else if (3 == oper) {
                oper = '*';
                realasr = num1 * num2;
            } else {
                oper = '+';
                realasr = num1 + num2;
            }
            //문제 출제 기능
            if (num1 < num2) {
                System.out.printf("%d - %d = ?\n", num2, num1);
                System.out.print(">> ");
                int userasr = sc.nextInt();
                if (userasr == realasr) {
                    System.out.printf("%d는 정답입니다\n", userasr);
                    conuto++;
                } else if (userasr == 0) {
                    System.out.println("게임을 종료 합니다");
                    break;
                } else {
                    System.out.printf("%d는 오답입니다\n", userasr);
                    conutx++;
                }
            } else {
                System.out.printf("%d %c %d = ?\n", num1, oper, num2);
                System.out.print(">> ");
                int userasr = sc.nextInt();
                if (userasr == realasr) {
                    System.out.printf("%d는 정답입니다\n", userasr);
                    conuto++;
                } else if (userasr == 0) {
                    System.out.println("게임을 종료 합니다");
                    break;
                } else {
                    System.out.printf("%d는 오답입니다\n", userasr);
                    conutx++;
                }
            }
        }
        //오답 정답 횟수 출력
        System.out.printf("정답횟수 : %d / 오답횟수 : %d", conuto, conutx);
    }
}
