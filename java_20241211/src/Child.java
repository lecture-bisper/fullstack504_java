// 부모 클래스인 Parent를 상속받아 사용하는 Child 클래스
public class Child extends Parent {

//  부모 클래스의 멤버인 method1(), method2() 메소드를 상속받음, 상속받은 메소드는 자식 클래스에 작성하지 않아도 사용가능

//  부모 클래스에서 상속받은 메소드를 자식 클래스에서 오버라이딩한 메소드
//  부모 클래스에서 상속받은 메소드와 선언부는 동일하지만 코드 블럭 안의 소스코드는 달라짐
  @Override
  public void method2() {
//    부모 클래스에서 상속받은 메소드를 호출하기
    super.method2();
    System.out.println("자식 클래스에서 오버라이딩된 method2() 실행");
  }

//  자식 클래스에 전용 메소드
  public void method3() {
    System.out.println("자식 클래스의 멤버 method3() 실행");
  }
}












