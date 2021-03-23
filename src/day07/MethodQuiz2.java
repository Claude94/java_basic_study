package day07;

import java.util.Arrays;

public class MethodQuiz2 {
    static double[] calcArrayTotal(int[] numbers) {
        double total = 0;
        double avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }
        avg = total / numbers.length;
        return new double[] {total, avg};
    }
    public static void main(String[] args) {
        int[] numbers = {57, 89, 78, 91, 93, 47};
        double[] arrTatvg = calcArrayTotal(numbers);
        System.out.printf("총점: %d점, 평균: %.2f점\n", (int)arrTatvg[0], arrTatvg[1]);
    }
}
