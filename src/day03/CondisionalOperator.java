package day03;

import java.util.Scanner;

public class CondisionalOperator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("돈을 입력하세요");
        int money = sc.nextInt();
        sc.close();
        System.out.println("가진 돈 :" + money);

        String food = money >= 5000 ? "육계장" : "라면";
        System.out.println("선택된 음식 : " + food);
    }
}
