package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        System.out.println("* 우리반 학생들의 별명 : [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]");
        System.out.println("- 삭제할 학생의 별명을 입력하세요");
        String[] DongBang = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
//        System.out.println(DongDang.length);
        while (true) {
            System.out.print("> ");
            Scanner sc = new Scanner(System.in);
            String name = sc.next();
            boolean match = false;
            int i = 0;
            for (i = 0; i < DongBang.length; i++) {
                if (name.equals(DongBang[i])) {
                    match = true;
                    break;
                }
            }
            if (match) {
                System.out.print("> ");
                for (int n = i; n < DongBang.length -1; n++) {
                    DongBang[n] = DongBang[n+1];
                }
                String[] temp = new String[DongBang.length -1];
                for ( int m = 0; m < temp.length; m++) {
                    temp[m] = DongBang[m];
                }
                DongBang = temp; temp = null;
                System.out.printf("%s의 별명을 삭제합니다\n", name);
                System.out.println("*변경 후 정보: " + Arrays.toString(DongBang));
                break;
            } else {
                System.out.printf("%s은(는) 존재하지 않습니다\n", name);
            }
        }
    }
}

