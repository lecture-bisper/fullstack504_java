package quiz;

// 문제 3) Car 클래스에 매개변수가 있는 생성자를 추가하여 자동차의 브랜드, 색상, 연식을 초기화하세요.
//객체를 생성하면서 초기값을 전달하고, 해당 속성을 출력하세요.

public class Car3 {
  String brand;
  String color;
  int year;

  public Car3(String brand, String color, int year) {
    this.brand = brand;
    this.color = color;
    this.year = year;
  }

  public void drive() {
    System.out.println("자동차가 달립니다");
  }
}












