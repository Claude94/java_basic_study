package day04;

import java.util.Scanner;

public class WhileQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 1: ");
        int num1 = sc.nextInt();
        int num3 = num1;
        System.out.print("정수 2: ");
        sc.close();
        int num2 = sc.nextInt();
        int total = 0;
        for (num1 = num3 ;num1 <= num2; num1++) {
            total += num1;
            num1++;
            System.out.printf("%d~%d까지의 총합 : %d", num3, num2, total);
        }

    }
}
