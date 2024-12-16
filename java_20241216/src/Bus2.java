// 부모 인터페이스인 Vehicle 을 상속받아 구현한 Bus2 클래스
public class Bus2 implements Vehicle{

//  부모 인터페이스에서 상속 받은 run() 추상메소드를 오버라이딩
  @Override
  public void run() {
    System.out.println("버스가 달립니다.");
  }

//  Bus2 클래스 전용 메소드
  public void checkFare() {
    System.out.println("승차 요금을 확인합니다.");
  }
}












