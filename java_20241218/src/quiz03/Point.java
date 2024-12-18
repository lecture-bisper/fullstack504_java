package quiz03;

//부모 클래스로 사용되는 Point 클래스
public class Point {

//  부모 클래스의 필드, private 접근제한자를 사용하여 상속불가
  private int x;
  private int y;

//  매개변수를 2개 받는 생성자
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

//  필드의 getter
  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

//  필드의 값을 수정하는 메소드
  protected void move(int x, int y) {
    this.x = x;
    this.y = y;
  }
}












