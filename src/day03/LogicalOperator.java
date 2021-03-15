package day03;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 10, y = 20;
//        &와 &&의 차이는 우항을 보고 판단한 후 좌항을 계산 하는 것과 스킵하는 것이다
        boolean result1 = (x != 10) & (++y == 21);
        boolean result2 = (x == 10) | (++y == 21);

        boolean result3 = (x != 10) && (++y == 21);
        boolean result4 = (x == 10) || (++y == 21);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x );
        System.out.println("y = " + y );


    }
}
