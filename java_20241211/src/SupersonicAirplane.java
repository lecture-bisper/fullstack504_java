// Airplane 클래스를 상속받아 사용하는 클래스
public class SupersonicAirplane extends Airplane {

//  상수로 선언한 필드, 선언과 동시에 데이터 저장
  public static final int NORMAL = 1;
  public final static int SUPERSONIC = 2;

//  일반 인스턴스 필드
  public int flyMode = NORMAL;

//  상속받은 메소드를 오버라이딩한 메소드
  @Override
  public void fly() {
//    조건문으로 현재 flyMode 확인
    if (flyMode == SUPERSONIC) {
      System.out.println("초음속 비행합니다.");
    }
    else {
//      상속받은 부모 클래스의 메소드를 호출
      super.fly();
    }
  }
}












