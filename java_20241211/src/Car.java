//부모 클래스로 사용하는 Car 클래스
public class Car {

//  필드, 상속 가능
  public int speed;

//  메소드, 상속 가능, 오버라이딩 가능
  public void speedUp() {
    speed += 1;
  }

//  메소드, 상속 가능, final 키워드로 인해서 오버라이딩 불가
  public final void stop() {
    System.out.println("차를 멈춤");
    speed = 0;
  }
}












