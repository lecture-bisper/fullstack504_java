package pack2;

// 다른 패키지의 default 접근제한자를 사용한 클래스이므로 import로 가져올 수 없음
//import pack1.A;

// 다른 패키지에 있는 public 접근제한자를 사용한 클래스를 가져옴
import pack1.B;

// 접근제한자 public 을 사용한 클래스 C
public class C {

//  다른 패키지인 pack1 에 존재하는 클래스 A 타입의 변수 선언
//  클래스 A 는 default 접근제한자를 사용하여 다른 패키지의 클래스인 C 는 A 클래스를 사용할 수 없음
//  A a;
//  다른 패키지인 pack1 에 존재하는 클래스 B 타입의 변수 선언
//  클래스 B 는 public 접근제한자를 사용하여 제한없이 사용 가능
  B b;

  public static void main(String [] args) {
//    default 접근제한자를 사용한 생성자는 다른 패키지에서는 외부에서 사용할 수 없음
//    B defaultB = new B();
//    public 접근제한자를 사용한 생성자는 제한없이 사용
    B publicB = new B("default", "public");

//    default 접근제한자를 사용한 필드는 다른 패키지에서는 외부에서 사용할 수 없음
//    System.out.println("default 방식 필드 : " + publicB.str1);
//    public 접근제한자를 사용한 필드는 제한없이 사용
    System.out.println("default 방식 필드 : " + publicB.str2);

//    default 접근제한자를 사용한 메소드는 다른 패키지에서는 외부에서 사용할 수 없음
//    publicB.print1();
//    public 접근제한자를 사용한 메소드는 제한없이 사용
    publicB.print2();
    
  }
}












