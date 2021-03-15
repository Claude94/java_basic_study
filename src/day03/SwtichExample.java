package day03;

import java.util.Scanner;

public class SwtichExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("### 여행지 추전 프로그램 ###");
        System.out.println("[ 여행을 원하는 계정을 입력하세요");
        System.out.print(">> ");

        String season =sc.next();

        //switch에는 문자, 정수형 변수 이외에는 작성 불가가
       switch (season) {
            case "spring": case "봄":
                System.out.println("봄에는 여이도 공원으로 가세요~");
                break;
            case "여름":
                System.out.println("여름에는 낙산해육장으로 가세요");
                break;
            case "가을":
                System.out.println("가을에는 대청댐으로 가세요~");
                break;
            case "겨울":
                System.out.println("겨울에는 스키장으로 가세요~");
                break;
            default:
                System.out.println(" 봄, 여름, 가을, 겨울 중에 하나를 입력하세요");
                sc.close();
        }
    }
}
