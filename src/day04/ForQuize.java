package day04;

public class ForQuize {
    public static void main(String[] args) {

        int ri = (int) (Math.random() * 8) + 2;

        int total = 0;
        System.out.printf("랜덤 구구단 %d단\n", ri);
        System.out.println("--------------------");
        for (int num1 = 1; num1 <= 9; num1++) {
            int value = ri * num1;
            total += num1;
            System.out.printf("%d X %d = %d\n", ri, num1, value);
        }
    }
}
