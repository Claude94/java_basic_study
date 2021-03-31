package day13.exception;

public class BalanceInsuffcientException extends Exception{
    //사용자 정의 예외 클래스
    public BalanceInsuffcientException(String message) {
        super(message);
    }
}
