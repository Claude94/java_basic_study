package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDelete2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        System.out.println("삭제전 : " + Arrays.toString(arr));
        Scanner sc = new Scanner(System.in);
        int indexNum = sc.nextInt();
        for (int i = indexNum; i < arr.length -1; i++) {
             arr[i] = arr[i+1];
        }
        int[] temp = new int[arr.length -1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp; temp = null;
        System.out.println("삭제후 : " + Arrays.toString(arr));
    }
}
