package day05;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] arr = {0};

        int newData = 40;

        //1. 원본 배열보다 사이즈가 1개 큰 새로운 배열을 생성
        int[] temp = new int[arr.length + 1];

        //2. 기존 뱌열 데이터를 복사해서 신규 배열에 저장
        for (int i = 0; i < arr.length ; i++) {
            temp[i] = arr[i];
        }
        //3. 추가할 데이터를 마지막 위치에 저장
        temp[temp.length - 1] = newData;

        //4. 기존 배열 변수가 신규 배열의 주소를 가질 수 있도록 설정
        arr = temp; temp = null;
        System.out.println(Arrays.toString(arr));
    }
}
