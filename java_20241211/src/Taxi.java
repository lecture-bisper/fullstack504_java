// 부모 클래스 Vehicle 을 상속받은 Taxi 클래스
public class Taxi extends Vehicle {

//  상속 받은 메소드 오버라이딩
  @Override
  public void run() {
    System.out.println("택시가 달립니다.");
  }
}












