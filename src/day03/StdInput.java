package day03;

import java.io.IOException;
//1. 스케너 api 불러오기
import java.util.Scanner;

public class StdInput {
    public static void main(String[] args) throws IOException {

//        int data = System.in.read();
//        System.out.println("data = " + data);

        //2. 스케너 객체 생성
        Scanner sc = new Scanner(System.in);
        //3. 스케너가 제공하는 함수들로 입력을 처리
        // next(), nextLine() : 문자열을 입력처리, next는 공백 입력 불가
        // nextInt(), nextDouble(): 각각 정수와 실수를 입력처리
        System.out.println("정보를 입력하세요");
        System.out.print("- 이름: ");
        String name = sc.next();//입력 커서를 만들고 입력된 데이터를 린턴

        System.out.print("- 나이: ");
        int age = sc.nextInt();

        System.out.printf("입력된 이름은 %s이고, 나이는 %d세입니다.\n", name, age);

        //4. 스캐너 메모리 해제
        sc.close();
    }
}
