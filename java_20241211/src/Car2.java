
// Tire 클래스를 필드로 사용하는 Car2 클래스
public class Car2 {

//  필드로 Tire 클래스의 객체를 사용함
  Tire frontLeftTire = new Tire("앞왼쪽", 6);
  Tire frontRightTire = new Tire("앞오른쪽", 2);
  Tire backLeftTire = new Tire("뒤왼쪽", 3);
  Tire backRightTire = new Tire("뒤오른쪽", 4);

//  자동차의 바퀴가 회전하는 메소드
  int run() {
    System.out.println("[자동차가 달립니다.]");

    if (frontLeftTire.roll() == false) {
      stop();
      return 1;
    }

    if (frontRightTire.roll() == false) {
      stop();
      return 2;
    }

    if (backLeftTire.roll() == false) {
      stop();
      return 3;
    }

    if (backRightTire.roll() == false) {
      stop();
      return 4;
    }

    return 0;
  }

  void stop() {
    System.out.println("[자동차가 멈춥니다.]");
  }
}












