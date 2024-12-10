package quiz;

// 문제 7) 5개의 자동차 정보를 저장하는 배열을 생성하세요.
//각 배열 요소에 Car 객체를 생성해 저장하고, 모든 자동차의 정보를 출력하세요.

public class Car7 {
  private String brand;
  private String color;
  private int year;

  public Car7() {
    brand = "미정";
    color = "검정";
    year = 2000;
  }

  public Car7(String brand, String color, int year) {
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












