package day03;

public class BitOperator {
    public static void main(String[] args) {

        //비트 연산
        byte a = 5; //0000 0101
        byte b = 3; //0000 0011
        //비트의 곱 : 각 자리수를 곱하라
        System.out.println(a & b); // 0000 0001 -> 1
        //비트의 합 : 각 자리수를 더하고 1 + 1은 1로 처리
        System.out.println(a | b); //0000 0111 -> 7
        //비트의 노리합 : 다르면 1 같으면 0
        System.out.println(a ^ b); // 0000 0110 -> 6

        //비트 이동 연산
        int x = 192;
        System.out.println(x << 3); //2에 3승
        //n 승분을 곱한다
        System.out.println(x >> 2); //2에 2승

        //비트 반전(단항)
        int y = 8;
        System.out.println(~y);

    }
}
