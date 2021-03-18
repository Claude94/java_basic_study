package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        //배열을 값목록으로 생성
        int[][] arr2d = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("arr2d.length " + arr2d.length);
        System.out.println(Arrays.toString(arr2d[1]));
        int[] temp = arr2d[2];
        System.out.println(arr2d[2][0]);
        int number = arr2d[2][2];
        System.out.println("number = " + number);

        arr2d[1][1] = 0;
        arr2d[2] = new int[] {10, 20, 30};
        for (int[] arr : arr2d) {
            for (int n : arr) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arr2d));
        System.out.println(arr2d[1]);

        //배열 생성문으로 배열 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("생성할 배열을 입력하세요");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int[][] testArr = new int[num1][num2];
        for (int[] ints : testArr) {
            for (int anIst : ints) {
                System.out.print(anIst + " ");
            }
        System.out.println();
        }
        //3차원 배열
//        int[][][] arr3d = {
//                {
//                    {1,2,3},{3,4,5},
//                }
//        }
    }
}
