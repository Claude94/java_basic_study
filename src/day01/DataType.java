package day01;

public class DataType {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 21474836471L;
        System.out.println(d);

        int i;
        double n = 0.0;
        for (i = 0; i < 100; i++) {
            n += 0.1;
        }
        System.out.println(n);// 실수는 저장하는 과정에서 오차가 있을 수 있다
        //실수형
        float f1 = 3.74353452345F; //4byte
        double d1 = 3.7235235254235; //8byte
        System.out.println(f1);
        System.out.println(d1);
        //논리형
        boolean b1 = true;
        boolean b2 = false;
//        boolean b3 = 0;
//        boolean b4 = null;
//        boolean b5 = "true";
//        boolean b6 = True;
        //문자형
        //char 차입은 무자 1개를 저잘할 수있는 타입, 홑따옴표로 저장
        char c1 = 'A';
        //String 타입은 무자열을 저장할 수 있는 타입, 겹따옴표로 저장
        String s1 = "ABC";
        String s2 = "A";

        System.out.println("100" + "200");
        System.out.println(100 + "200");//숫자와 문자열의 뎃셈만 문자열변환처리
//        System.out.println("200" + 100);

    }
}
