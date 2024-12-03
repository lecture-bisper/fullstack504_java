public class Car5 {

  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

//  this() : 생성자 안에서 또 다른 생성자를 호출하는 명령어
//  this() 는 생성자 안에서 가장 먼저 실행되어야 함

  public Car5() {
    this("아반떼");
    System.out.println("기본 생성자 사용");
  }

  public Car5(String model) {
    this(model, "은색");
  }

  public Car5(String model, String color) {
    this(model, color, 200);
  }

  public Car5(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}












