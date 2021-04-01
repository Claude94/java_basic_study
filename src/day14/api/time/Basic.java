package day14.api.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Basic {

    public static void main(String[] args) {
        //날짜 정보 재어
        LocalDate curDate = LocalDate.now();
        System.out.println("curDate = " + curDate);
        
        //임의의 날짜 생성
        LocalDate targetDate = LocalDate.of(2022,5,21);
        System.out.println("targetDate = " + targetDate);
        
        //시간 정보 제어
        LocalTime surTime = LocalTime.now();
        System.out.println("surTime = " + surTime);

        LocalTime targetTime = LocalTime.of(20, 00, 00);
        System.out.println("targetTime = " + targetTime);
        
        //날짜와 시간 정보 제어
        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println("curDateTime = " + curDateTime);

        //각 날짜와 시간정보 추출
        int year = curDateTime.getYear();
        System.out.println("year = " + year);

        int monthValue = curDateTime.getMonthValue();
        System.out.println("monthValue = " + monthValue);

        DayOfWeek dayOfWeek = curDateTime.getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);


        
    }
}
