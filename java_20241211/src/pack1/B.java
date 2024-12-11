package pack1;

// 클래스 A와 같은 패키지에 있는 클래스 B
public class B {

//  protected 접근제한자는 같은 패키지나 상속관계에 있을 경우 사용 가능

  public void method() {
//    A 클래스 타입의 변수 선언 가능
//    new 키워드와 A 클래스의 생성자를 사용하여 객체 생성 가능
    A a = new A();
//    객체 a의 멤버인 필드 value1 사용 가능
    System.out.println(a.value1);
    a.value1 = "클래스 B에서 데이터 저장";
//    객체 a의 멤버인 메소드 method1() 호출 가능
    a.method1();
  }
}












