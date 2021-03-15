package day03;

public class RandomEx {
    public static void main(String[] args) {
        double rn = Math.random();
        System.out.println("rn = " + rn);
        
        //랜덤 정수 생성방법
        /*
            #1 ~ 10 사이의 랜검 정수 값 생성
            
            Math.Random()                    -> 0.0 =< ~ < 1.0
            Math.Random() * 10               -> 0.0 =< ~ < 10.0
            (int) (Math.Random() * 10)       -> 0 =< ~ < 10
            (int) (Math.Random() * 10) + 1   -> 1 =< ~ < 11
            
            #공식 x이상 y이하의 랜덤정수
            (int) (Math.Random() * (y - x + 1) +x
         */
        int ri = (int) (Math.random() * 10) + 1;
        System.out.println("ri = " + ri);
    }
}
