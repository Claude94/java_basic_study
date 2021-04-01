package day14.api.lang.string;

import java.util.Arrays;

public class StrManipulation {

    public static void main(String[] args) {
        String str = "hello java";
        //charAt : 문자열 인덱스에 따른 글자를 반환
        char c = str.charAt(0);
        System.out.println("c = " + c);

        //substring : 문자열의 특정 부분을 추출
        //python str [6:]
        String ss1 = str.substring(6); //6번 부터 끝까지 추출
        System.out.println("ss1 = " + ss1);

        //python str[0:5]
        String ss2 = str.substring(0, 5); //0번부터 5번 미만까지 추출
        System.out.println("ss2 = " + ss2);

        //length() : 문자열의 총 길이 반환
        int length = str.length();
        System.out.println("length = " + length);

        //indexOf(), lastIndexOf() : 특정 문자나 단어의 첫글다 위치를 반환
        int first = str.indexOf("l");
        int last = str.lastIndexOf("l");
        System.out.println("first = " + first);
        System.out.println("last = " + last);
        //찾는 단어가 포함되어 있다면 그 첫글자 인덱스 반환
        //없다면 -1 반환
        int java = str.indexOf("java");
        System.out.println("java = " + java);

        //대소문자 변환
        String str2 = "HeLLo PoRORo";
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());

        System.out.println("================================");

        String fileName = "/local/img/2021/04/01/개구쟁이뽀로로.dssd";

        //파일확장자가 JPG, GIF, PNG, SVG면 이미지로 판별
        String indexJpg = fileName.substring(fileName.lastIndexOf(".")+1);
        System.out.println(indexJpg);

        String phone = "010-435-3453";
        String phoneNum = phone.substring(phone.lastIndexOf("-")+1);
        System.out.println(phoneNum);

        //trim(): 문자열의 앞 뒤 공백 제거
        String name = "       김철수";
        System.out.println("이름 : " + name.trim());

        //replace(old, new): 문자열 내부에 있는 old문자를 찾아 new문자로 변경

        String msg = "java study, java program, java offee";
        System.out.println(msg.replace("java", "자바"));
        System.out.println(msg.replace("java", ""));

        //split(구분 문자): 구분 문자를 기준으로 분리하여 String배열 리턴
        String pet = "멍멍이, 야옹이, 짹짹이, 어흥이";
        String[] results = pet.split(",");

        System.out.println("===================================");
        for (String result :results) {
            System.out.println(result.trim());
        }
        System.out.println("===================================");

        int userNum = 130;
        String userName = "박영희";
        String address = "대전시 서구";
        //다른 데이터를 분자열로 변환 : String.valueOf()
        String[] userData = {String.valueOf(userNum), userName, address};
        System.out.println(Arrays.toString(userData));
    }
}
