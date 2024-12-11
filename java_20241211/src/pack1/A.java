package pack1;

// 일반적인 용도의 클래스 선언
public class A {
  
//  접근제한자를 protected 로 설정한 필드
  protected String value1;

//  접근제한자를 protected 로 설정한 생성자
  protected A() {
    this.value1 = "클래스 A의 필드 value1";
  }

  public A(String value1) {
    this.value1 = value1;
  }

//  접근제한자를 protected 로 설정한 메소드
  protected void method1() {
    System.out.println("클래스 A의 method1() 호출");
  }
}












