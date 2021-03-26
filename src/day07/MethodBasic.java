package day07;

import java.util.Arrays;

public class MethodBasic {
    static int calculateTotal(int n) {
        int total = 0;
        for (int i = 0; i <= n; i++) {
            total += i;
        }
        return total;
    }

    static int calcNumbersTotal(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    static String selectRamdomFood() {
        String[] food = {"김밥", "볶음밥", "오렌지", "닭강정", "귤"};
        return food[(int) (Math.random() * food.length)];
    }

    public static void main(String[] args) {
        // 1~n 까지의 총합을 구해주는 로직
        int result = calculateTotal(10);
        System.out.println("result = " + result);

        int result2 = calculateTotal(100);
        System.out.println("result2 = " + result2);

        String food = selectRamdomFood();
        System.out.println("food = " + selectRamdomFood());

        int total = calcNumbersTotal(new int[]{10, 20, 30});
        System.out.println("total = " + total);

        int total2 = calcNumbersTotal(10, 20, 30, 40, 50);
        System.out.println("total2 = " + total2);

        System.out.println("-------------------------------------");


        int[] result3 = operateAll(20 ,5);
        System.out.println(Arrays.toString(result3));
    }

    //사용자의 이름을 전달하면 인사를 출력해주는 함수
    void sayHello(String userName) {
        System.out.println(userName + "님 안녕하세요");
    }

    // 여러 값을 리턴하고 싶은 경우
    static int[] operateAll(int n1, int n2) {
        return new int[]{n1 + n2, n1 - n2, n1 * n2, n1 / n2};
    }
}//end class
