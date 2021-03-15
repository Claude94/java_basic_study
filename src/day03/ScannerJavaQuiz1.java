package day03;

import java.util.Scanner;

public class ScannerJavaQuiz1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("**** 상품 재고 총액 구하기 ****");
        System.out.print("상품 가격을 입력하세요 : ");
        int value = sc.nextInt();
        System.out.print("상품 개수를 입력하세요 : ");
        int count = sc.nextInt();
        sc.close();
        System.out.println("----------------------------");
        //재고 총액을 저장 할 변수
        int total = value * count;
        System.out.printf("상품 재고 총액 : %d원", total);

    }
}
