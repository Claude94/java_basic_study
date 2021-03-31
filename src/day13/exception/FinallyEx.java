package day13.exception;

public class FinallyEx {
    public static void main(String[] args) {

        String[] pets = {"비둘기", "소라게", "거북이"};
        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + "키울래요");
            } catch (Exception e) {
                System.out.println("애완동물 데이터가 없습니다");
            } finally { //항상 실행되야 하는 코드를 출력할때 사용
                //메모리 헤제 코드
                System.out.println("애완동물을 사랑합시다");
            }
        }
        System.out.println("프로그램 정상 종료");
    }
}