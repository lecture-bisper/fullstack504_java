// 다른 클래스에서 실행을 위해서 사용하는 클래스
public class Car {

//  필드를 인터페이스 타입으로 선언
//  객체는 인터페이스를 상속받아 구현한 자식 클래스를 사용하여 객체 생성
  Tire frontLeftTire = new HankookTire();
  Tire frontRightTire = new HankookTire();
  Tire backLeftTire = new KumhoTire();
  Tire backRightTire = new KumhoTire();

  void run() {
//    Tire 인터페이스에서 제공하는 roll() 메소드를 실행
    frontLeftTire.roll();
    frontRightTire.roll();
    backLeftTire.roll();
    backRightTire.roll();
  }
}












