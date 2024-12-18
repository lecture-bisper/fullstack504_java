package quiz02;

// 추상 클래스를 상속받기 때문에 extends 키워드 사용
public class Adder extends Calculator{

//  부모 클래스에서 상속받은 int 타입 필드 a, b 존재함

//  상속받은 추상 메소드 오버라이딩
  @Override
  protected int calc() {
    return a + b;
  }
}












