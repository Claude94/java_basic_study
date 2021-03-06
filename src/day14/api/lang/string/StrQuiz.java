package day14.api.lang.string;

import java.util.Scanner;

public class StrQuiz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호 : ");
        String juminNum = sc.next();
        String[] results = juminNum.split("-");
        System.out.println("앞자리 : " + results[0]);
        System.out.println("뒷자리 : " + results[1]);
        String year = juminNum.substring(0, 2);
        String moth = juminNum.substring(2, 4);
        String date = juminNum.substring(4, 6);
        String gender = juminNum.substring(7, 8);
        String gender2 = "";
        switch (gender) {
            case "1":
            case "3":
                gender2 = "남";
                break;
            case "2":
            case "4":
                gender2 = "여";
                break;
        }
        //나이 : 2021에서 생년월일 년도를 뺀다
        switch (gender) {
            case "3":
            case "4":
                int n2 = Integer.parseInt(year);
                int fullYear2 = n2 + 2000;
                int age2 = 2021 - (n2 + 2000);
                System.out.printf("%s년도 %s월 %s일생 %d세 성별 : %s\n", fullYear2, moth, date, age2, gender2);
                break;
            case "1":
            case "2":
                int n1 = Integer.parseInt(year);
                int fullYear = n1 + 1900;
                int age = 2021 - (n1 + 1900);
                System.out.printf("%s년도 %s월 %s일생 %d세 성별 : %s\n", fullYear, moth, date, age, gender2);
                break;
        }
    }
}
