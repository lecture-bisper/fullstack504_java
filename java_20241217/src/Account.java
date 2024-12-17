public class Account {

//  예금 금액을 저장한 필드
  private long balance;

  public Account() { }

//  필드 내용을 외부로 출력하는 Getter
  public long getBalance() {
    return balance;
  }

//  예금을 위한 메소드
  public void deposit(int money) {
    balance += money;
  }

//  예금을 찾는 메소드
//  throws를 통해서 예외처리를 떠 넘김
//  사용자가 직접 만든 예외 클래스를 떠 넘김
  public void withdraw(int money) throws BalanceException {

    if (balance < money) {
//      Throw 호출 시 지정한 예외를 강제로 발생시킴
      throw new BalanceException("잔고부족 : " + (money - balance) + "원 모자람");
    }

//    예금된 금액에서 출금 금액을 뺌
    balance -= money;
  }
}












