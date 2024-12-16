// 부모인 Vehicle 인터페이스를 상속 받아 구현한 Bus 클래스
public class Bus implements Vehicle {

//  부모 인터페이스에서 상속 받은 추상 메소드 run() 을 오버라이딩
  @Override
  public void run() {
    System.out.println("버스가 달립니다.");
  }
}












