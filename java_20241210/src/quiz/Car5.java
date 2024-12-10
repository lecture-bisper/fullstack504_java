package quiz;

// 문제 5) Car 클래스에 자동차의 정보를 출력하는 printInfo() 메서드를 작성하세요.
//해당 메서드에서 "브랜드: [브랜드], 색상: [색상], 연식: [연식]"을 출력하도록 작성하고 호출하세요.

public class Car5 {

  private String brand;
  private String color;
  private int year;

  public Car5() {

  }

  public Car5(String brand, String color, int year) {
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












