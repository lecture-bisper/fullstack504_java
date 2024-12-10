package quiz;

// 문제 4) Car 클래스의 속성을 private으로 변경하고, 각 속성에 접근하기 위한 getter와 setter 메서드를 작성하세요.
//객체를 생성하고 setter를 사용해 값을 설정한 뒤, getter를 사용해 값을 출력하세요.

public class Car4 {
  private String brand;
  private String color;
  private int year;

  public Car4() {

  }

  public Car4(String brand, String color, int year) {
    this.brand = brand;
    this.color = color;
    this.year = year;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public void drive() {
    System.out.println("자동차가 달립니다");
  }
}












