package quiz;

// 문제 6) Car 클래스에 기본 생성자를 추가하여, 브랜드를 "미정", 색상을 "검정", 연식을 2000으로 설정하세요.
//기본 생성자를 사용해 객체를 생성하고 속성을 출력하세요.

public class Car6 {
  private String brand;
  private String color;
  private int year;

  public Car6() {
    brand = "미정";
    color = "검정";
    year = 2000;
  }

  public Car6(String brand, String color, int year) {
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

  public void printInfo() {
    System.out.println("브랜드: [" + brand + "], 색상: [" + color + "], 연식: [" + year + "]");
  }
}












