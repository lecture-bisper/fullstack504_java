// 인터페이스 MyInterface 를 상속받아 구현한 MyClassB
public class MyClassB implements MyInterface {

//  상속받은 메소드 오버라이딩
  @Override
  public void method1() {
    System.out.println("MyClassB 의 method1() 실행");
  }

//  MyClassB 전용 메소드 (일반 메소드), 오버라이딩
  @Override
  public void method2() {
    System.out.println("MyClassB 의 method2() 실행");
  }
}












