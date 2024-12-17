
// 최상위 예외 클래스를 상속받아 사용자 정의 예외 클래스를 생성
public class BalanceException extends Exception {

  public BalanceException(){}

//  메시지를 입력받은 생성자
  public BalanceException(String message){
    super(message);
  }
}












