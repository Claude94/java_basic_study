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

        float f1 = 3.74353452345F; //4byte
        double d1 = 3.7235235254235; //8byte
        System.out.println(f1);
        System.out.println(d1);
    }
}
