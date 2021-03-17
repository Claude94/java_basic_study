package day05;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayBasic {
    public static void main(String[] args) {
        //1. 배열 변수를 선언
        int[] points;
        //2. 배열 객체 생성
        points = new int[5];

//        System.out.println("points = " + points);

        //3. 배열 데이터 저장
        points[0] = 87;
        points[1] = 95;
        points[2] = points[0];
        points[3] = (int) 33.3242;
        points[4] = 100;
//        points[5] = 100;

        //5. 배열 길이
        System.out.println("배열의 길이:" + points.length);
        //6. 배열의 반복문 처리
        int total = 0;
        /*for (int i = 0; i < points.length; i++) {
            total += points[i];
        }*/
        // 항상된 for 문
        for (int n : points) {
            total += n;
        }

        System.out.println("배열 데이터 총합:"+ total);

        double[] dArr = new double[4];

        //값 목록으로 배열 생성
        //new type[] 을 생략할 수 있는 상황은 변수를 선언할 때 뿐입니다
        String[] foods = new String[] {"탕수육","김치볶음박","짬뽕"};

        foods = new String[] {"오랜지", "자몽", "레몬"};

        //배열 내부값 한버에 출력하기
        System.out.println(Arrays.toString(foods));
        //배열 값 초기화를 안하면 각 타입의 기본값이 저장됨
        boolean[] bArr = new boolean[6];
        System.out.println(Arrays.toString(bArr));
        //배열의 주소 개념
        int[] iArr = {1, 3, 5, 7, 9, 11};
//        int[] copyArr = iArr;
        int[] copyArr = new int[iArr.length];
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = iArr[i];
        }
        copyArr[0] = 100;
        iArr[1] = -50;
        System.out.println("==============================");
        System.out.println("copy:" + Arrays.toString(copyArr));
        System.out.println("iArr:" + Arrays.toString(iArr));
    }
}
