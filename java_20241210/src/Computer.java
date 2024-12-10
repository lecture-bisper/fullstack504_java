// 부모 클래스인 Calculator을 상속받은 자식 클래스 Computer
public class Computer extends Calculator {

//  오버라이딩 : 부모 클래스에서 상속받은 메소드의 내용을 수정하여 자식 클래스 전용 메소드를 만드는 것
//  부모 클래스에서 상속받은 메소드의 선언부과 동일해야 함

//  부모 클래스에서 상속받은 메소드를 오버라이딩
  @Override
  public double areaCircle(double r) {
    System.out.println("자식 클래스인 Computer 객체의 areaCircle() 실행");
    return Math.PI * r * r;
  }
}












