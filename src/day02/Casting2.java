package day02;

public class Casting2 {
    public static void main(String[] args) {

        char c ='B';
        int i = 2;

        System.out.println(c + i);

        char result = (char) (c + i);
        System.out.println("result = " + result);
        //int보다 작은 (byte, shart, char)의 연산은 결과가 자동 int로 변환됨
        byte b1 = 100;
        byte b2 = 110;
//        byte b3 = b1 + b2;
        System.out.println('A' + 'B');

        int n1 =27;
        int n2 =5;

         double res = (double) n1 / n2;//연산과정의 데이터 타입을 생각해야 한다
        System.out.println("res = " + res);
    }
}
