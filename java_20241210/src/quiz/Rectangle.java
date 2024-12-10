package quiz;

// 문제 8) Rectangle 클래스를 만들어 가로(width)와 세로(height)를 속성으로 추가하세요.
//사각형의 넓이를 계산해 반환하는 getArea() 메서드를 작성하세요.
//객체를 생성하여 getArea() 메서드를 호출하고 넓이를 출력하세요.

public class Rectangle {

  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int getArea() {
    return width * height;
  }
}












