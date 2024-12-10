package quiz03;

public class Circle {

//  private 접근제한자는 사용하는 필드, 반지름 저장
  private int radius;

//  매개 변수 1개를 가지는 생성자, 필드 radius의 값을 초기화
  public Circle(int radius) {
    this.radius = radius;
  }

//  필드 radius의 Getter
  public int getRadius() {
    return radius;
  }

//  필드 radius의 Setter
  public void setRadius(int radius) {
    this.radius = radius;
  }
}












