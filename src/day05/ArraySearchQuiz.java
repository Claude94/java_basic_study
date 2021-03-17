package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        System.out.println("* 변경 전 정보 : [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]");
        System.out.println("- 수정할 맴버의 이름을 입력하세요");
        String[] DongDang = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
//        System.out.println(DongDang.length);
        while (true) {
            System.out.print("> ");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            boolean match = false;
            int i = 0;
            for (i = 0; i < DongDang.length; i++) {
                if (name.equals(DongDang[i])) {
                    match = true;
                    break;
                }
            }
            if (match) {
                System.out.printf("%s의 별명을 입력하세요\n", DongDang[i]);
                System.out.print("> ");
                DongDang[i] = sc.next();
                System.out.println("변경 완료!");
                break;
            } else {
                System.out.printf("%s은(는) 존재하지 않습니다", name);
            }
            System.out.println("*변경 후 정보: " + Arrays.toString(DongDang));
        }
    }
}
