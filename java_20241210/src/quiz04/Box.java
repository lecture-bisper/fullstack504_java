package quiz04;

public class Box {

//  필드
  private int width; // 박스의 너비
  private int height; // 박스의 높이
  private char fillChar; // 박스를 그리는데 사용하는 문자

//  기본 생성자, 10x1 의 박스 생성
  public Box() {
    this(10, 1); // this() 이용하여 완성하라
  }

//  매개변수로 너비와 높이를 가진 생성자
  public Box(int width, int height) {
    this.width = width; // this 레퍼런스를 이용하라
    this.height = height;
  }

//  박스 그리는 메소드
  public void draw() {
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        System.out.print(fillChar);
      }
      System.out.println();
    }
  }

//  박스를 그리는데 사용하는 문자 설정
  public void fill(char c) {
    this.fillChar = c;
  }

  public static void main(String[] args) {

    Box a = new Box(); // 10x1 사각형
    Box b = new Box(20, 3); // 20x3 사각형
    a.fill('*'); // box를 그릴 때 사용하는 문자 "*"
    b.fill('%'); // box를 그릴 때 사용하는 문자 "%"
    a.draw(); // 박스 a 그리기
    b.draw(); // 박스 b 그리기
  }
}

// 문제 1) Car1라는 클래스를 만들어 브랜드(brand), 색상(color), 연식(year)을 속성으로 추가하세요.
//객체를 생성하여 브랜드, 색상, 연식을 출력하세요.

// 문제 2) Car2 클래스에 자동차가 달리는 동작을 출력하는 drive() 메서드를 추가하세요.
//객체를 생성하고 drive() 메서드를 호출하여 "자동차가 달립니다."를 출력하세요.

// 문제 3) Car3 클래스에 매개변수가 있는 생성자를 추가하여 자동차의 브랜드, 색상, 연식을 초기화하세요.
//객체를 생성하면서 초기값을 전달하고, 해당 속성을 출력하세요.

// 문제 4) Car4 클래스의 속성을 private으로 변경하고, 각 속성에 접근하기 위한 getter와 setter 메서드를 작성하세요.
//객체를 생성하고 setter를 사용해 값을 설정한 뒤, getter를 사용해 값을 출력하세요.

// 문제 5) Car5 클래스에 자동차의 정보를 출력하는 printInfo() 메서드를 작성하세요.
//해당 메서드에서 "브랜드: [브랜드], 색상: [색상], 연식: [연식]"을 출력하도록 작성하고 호출하세요.

// 문제 6) Car6 클래스에 기본 생성자를 추가하여, 브랜드를 "미정", 색상을 "검정", 연식을 2000으로 설정하세요.
//기본 생성자를 사용해 객체를 생성하고 속성을 출력하세요.

// 문제 7) 5개의 자동차 정보를 저장하는 배열을 생성하세요.
//각 배열 요소에 Car 객체를 생성해 저장하고, 모든 자동차의 정보를 출력하세요.

// 문제 8) Rectangle 클래스를 만들어 가로(width)와 세로(height)를 속성으로 추가하세요.
//사각형의 넓이를 계산해 반환하는 getArea() 메서드를 작성하세요.
//객체를 생성하여 getArea() 메서드를 호출하고 넓이를 출력하세요.

// 문제 9) Calculator 클래스를 만들어 더하기(add)와 곱하기(multiply) 메서드를 작성하세요.
//각 메서드는 두 개의 정수를 입력받아 결과를 반환합니다.
//객체를 생성하고 메서드를 호출하여 결과를 출력하세요.

// 문제 10) Lamp라는 클래스를 만들어, 속성으로 전원이 켜져 있는지 나타내는 isOn(boolean)을 추가하세요.
//
//전원을 켜는 turnOn() 메서드와 끄는 turnOff() 메서드를 작성하세요.
//상태를 출력하는 printStatus() 메서드를 추가하세요.
//객체를 생성하고 전원을 켜고 끄는 메서드를 호출하여 상태를 출력하세요.










