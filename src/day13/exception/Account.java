package day13.exception;

public class Account {
    public int balance; //잔액

    public Account(int balance) {
        this.balance = balance;
    }

    //출금 기능
    public void withDraw(int money) throws BalanceInsuffcientException{
        if (balance < money) {
            //throw : 발생시키다, 유발하다 (raise)
            throw new BalanceInsuffcientException("잔액이 부족함");
        }
        this.balance -= money;
    }

    public int getBalance() {
        return balance;
    }
}
