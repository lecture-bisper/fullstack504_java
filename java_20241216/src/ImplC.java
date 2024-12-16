// 부모 인터페이스인 InterC를 상속받아 구현한 ImplC 클래스
public class ImplC implements InterC {

//  부모 인터페이스가 가지고 있는 모든 추상 메소드를 오버라이딩해야 함
  @Override
  public void methodC() {
    System.out.println("InterC 의 methodC() 호출");;
  }

  @Override
  public void methodA() {
    System.out.println("InterA 의 methodA() 호출");
  }

  @Override
  public void methodB() {
    System.out.println("InterB 의 methodB() 호출");
  }
}












