package pack2;

// 클래스 A와 클래스 D 는 다른 패키지이므로 사용하려면 import 필수
// 클래스 A가 클래스의 접근제한자로 public을 사용하여 전체 공개
import pack1.A;

// 클래스 D는 클래스 A를 상속받고 있음
public class D extends A {

//  클래스 A의 멤버는 모두 protected 접근제한자를 사용하여 패키지가 다른 클래스라도 상속 관계에 있을 경우 사용하는 것이 가능함
  
  public D() {
//    부모 클래스인 클래스 A의 생성자를 super() 로 호출 가능
    super();
//    클래스 A의 멤버인 필드 value1 을 상속받아 사용할 수 있음
    this.value1 = "클래스 D의 필드 value1";
    System.out.println(this.value1);
//    클래스 A의 멤버인 메소드 method1()을 상속받아 사용할 수 있음
    this.method1();
  }
}












