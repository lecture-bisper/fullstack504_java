public class DefaultMethodEx {

  public static void main(String[] args) {

//    부모 인터페이스 타입의 변수에 자식 클래스 타입의 객체 저장
    MyInterface mi1 = new MyClassA();
//    부모 인터페이스에서 제공하는 메소드 실행, 결과는 자식 객체 것
    mi1.method1();
    mi1.method2();

    System.out.println();
//    부모 인터페이스 타입의 변수에 자식 클래스 타입의 객체 저장
    MyInterface mi2 = new MyClassB();
//    부모 인터페이스에서 제공하는 메소드 실행, 결과는 자식 객체 것
    mi2.method1();
//    부모 인터페이스에서 제공하는 메소드가 아니기 때문에 실행 불가
    mi2.method2();
  }
}












