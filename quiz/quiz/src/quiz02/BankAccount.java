package quiz02;

//클래스명: BankAccount
//멤버변수:
//  accountNumber (String): 계좌번호
//  balance (double): 잔액
//생성자:
//	계좌번호, 초기잔액을 받는 생성자
//메서드:
//  deposit(double amount): 입금 - 멤버변수에 누적
//  withdraw(double amount): 출금 - 멤버변수에 차감
//  getBalance(): 잔액 조회 - 잔액 반환;

public class BankAccount {

    String accountNumber; //계좌번호
    double balance; //잔액
    
    //생성자
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    double getBalance() {
        return balance;
    }
}
