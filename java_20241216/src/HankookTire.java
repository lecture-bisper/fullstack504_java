// 부모 인터페이스인 Tire 를 상속받아 구현한 HankookTire 클래스
public class HankookTire implements Tire {

//  부모 인터페이스가 상속해준 추상메소드 roll()을 오버라이딩
  @Override
  public void roll() {
    System.out.println("한국 타이어가 굴러갑니다.");
  }
}












