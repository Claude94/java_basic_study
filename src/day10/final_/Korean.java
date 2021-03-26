package day10.final_;

public class Korean {
    String name;
    //상수 (대문자 띄어쓰기 '_' 로 처리
    static final String NATION = "대한민국"; //국적
    final String ssn; //주민번호

    Korean(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
//        nation = "미국";
        name = "홍길동";
    }
}
