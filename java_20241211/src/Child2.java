// Parent2 를 상속받은 Child2
public class Child2 extends Parent2 {

//  상속받고 그대로 사용하는 method1(), 작성 생략

//  상속받은 method2() 를 오버라이딩
  @Override
  public void method2() {
    System.out.println("Child2의 method2() 호출");
  }

//  Child2 클래스 전용의 메소드 method3()
  public void method3() {
    System.out.println("Child2의 method3() 호출");
  }
}












