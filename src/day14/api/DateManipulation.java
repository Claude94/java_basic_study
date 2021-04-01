package day14.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateManipulation {
    public static void main(String[] args) {
        LocalDate orderDate = LocalDate.now();
        LocalDate takeDate = orderDate.plusDays(3);

        System.out.println("orderDate = " + orderDate);
        System.out.println("takeDate = " + takeDate);

        LocalDateTime targetTime = LocalDateTime.now()
                .plusYears(1)
                .plusMonths(10)
                .plusHours(3)
                .plusMinutes(23);
        System.out.println("targetTime = " + targetTime);

        //축제 시작일, 종료일
        LocalDateTime startDate =
        LocalDateTime.of(2021,2,1,0,0,12);
        LocalDateTime lastDate =
        LocalDateTime.of(2021,3,31,0,0,12);

        //현재 시간
        LocalDateTime now = LocalDateTime.now();

        if (now.isBefore(lastDate)) {
            System.out.println("현재 진행중인 행사입니다");
        } else {
            System.out.println("종료된 행사입니다");
        }
        //날짜 연산
        long between = ChronoUnit.DAYS.between(startDate, lastDate);
        System.out.println("between = " + between);
    }
}
