package pack2;

// 클래스 A와 클래스 C 는 다른 패키지이므로 사용하려면 import 필수
// 클래스 A가 클래스의 접근제한자로 public을 사용하여 전체 공개
import pack1.A;

public class C {

//  클래스 A의 멤버는 모두 protected 접근제한자를 사용하여 패키지가 다른 클래스 C에서 클래스 A의 멤버를 사용할 수 없음

  public void method() {
////    클래스 A 타입의 변수 선언 가능
////    클래스 A의 생성자 사용 불가
//    A a = new A("클래스 C에서 필드 value1 사용");
////    객체 a 의 멤버인 필드 value1 사용 불가
//    System.out.println(a.value1);
////    객체 a 의 멤버인 메소드 method1() 호출 불가
//    a.method1();
  }
}












