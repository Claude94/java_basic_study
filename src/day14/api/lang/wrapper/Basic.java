package day14.api.lang.wrapper;

import day10.protec.pac1.B;

public class Basic {

    public int x; //기본값 0
    public Integer y; //기본값 null

    public static void main(String[] args) {
        //Byte, Short, Integer, Long, Float, Double, Boolean, Character
        int a = 10;
        //래핑
        Integer i = new Integer(a);
        //auto boxing
        Integer j = 100;

        Object[] oArr = {10, 3.3, "ddd", true};
        Basic b = new Basic();
//        System.out.println(b.x + b.y);

        //문자열 변환기능
        String s1 = "90";
        String s2 = "5.11";

        try {
            int n1 = Integer.parseInt(s1);
            double n2 = Double.parseDouble(s2);
            System.out.println((n1 + n2));
        } catch (NumberFormatException e) {
            System.out.println("변환할 수 없는 문자입니다");
        }
    }
}
