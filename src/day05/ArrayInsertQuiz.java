package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInsertQuiz {
    public static void main(String[] args) {
        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
//              String[] foods = new String[0];
        String[] foods = {};
        while (true) {
            System.out.print("> ");
            Scanner sc = new Scanner(System.in);
            String foodName = sc.nextLine();
            if (foodName.equals("그만")) {
                System.out.println("입력종료");
                sc.close();
                System.out.println(Arrays.toString(foods));
                break;
            } else {
//              System.out.println(foods.length);
//              foods[0] = foodName;
                String[] temp = new String[foods.length + 1];
                for (int i = 0; i < foods.length; i++) {
                    temp[i] = foods[i];
                }
                temp[temp.length - 1] = foodName;
                foods = temp; temp = null;
            }
        }
    }
}
