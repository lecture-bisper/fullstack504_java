public class AccountEx {

  public static void main(String[] args) {

//    객체 생성
    Account account = new Account();

//    입금
    account.deposit(10000);
    System.out.println("예금액 : " + account.getBalance());

//    throws 를 통해서 떠 넘겨진 예외처리를 withdraw() 를 호출한 위치에서 예외처리 구분을 입력함
    try {
//      출금
      account.withdraw(30000);
    }
//    사용자가 직접 만든 예외 처리 클래스에서 catch 가 발생함
    catch (BalanceException e) {
//      사용자 예외 처리 클래스 생성 시 전달한 메시지를 가져옴
      String message = e.getMessage();
      System.out.println(message);
      System.out.println();
//      예외가 실제 발생한 위치를 알려줌
      e.printStackTrace();
    }
  }
}












