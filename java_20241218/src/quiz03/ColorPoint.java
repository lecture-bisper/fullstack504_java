package quiz03;

// 문제 3) 책 237페이지 4번 문제

// Point 클래스를 상속받아 사용하는 ColorPoint 클래스
public class ColorPoint extends Point {
  
//  Point 클래스에서 필드를 상속받아야하지만 private 접근제한자 때문에 상속을 못받음, x/y에 직접 접근이 불가능

//  ColorPoint 클래스 전용 필드
  private String color;

//  매개변수를 3개 가지는 생성자
  public ColorPoint(int x, int y, String color) {
//    자식 클래스의 생성자는 상속관계에 있는 부모 클래스의 생성자를 제일 먼저 호출
    super(x, y);
//    ColorPoint 클래스의 필드값 초기화
    this.color = color;
  }

//  ColorPoint 전용 메소드, 부모 클래스인 Point의 필드인 x, y 값을 변경할 수 있는 setter 메소드가 없음
  public void setPoint(int x, int y) {
//    부모 클래스의 필드인 x, y 값을 한번에 변경하는 메소드가 존재
    move(x, y);
  }

//  색상을 변경하는 메소드, ColorPoint 클래스 전용 메소드
//  ColorPoint 클래스의 필드인 color 의 값을 변경
  public void setColor(String color) {
    this.color = color;
  }

//  ColorPoint 클래스 전용 메소드, 이제까지의 설정 값을 출력
  public void show() {
//    부모 클래스인 Point의 x, y 값은 getter 메소드를 통해서 가져옴
    System.out.println(color + "색으로(" + getX() + "," + getY() + ")");
  }

  public static void main(String[] args) {
    ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
    cp.setPoint(10, 20);
    cp.setColor("GREEN");
    cp.show();

//    GREEN색으로(10, 20);
  }
}












