// 사용자가 선언한 Car4 클래스
public class Car4 {

//  Car4 클래스의 필드(멤버 변수)
  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

//  생성자 오버로딩 : 하나의 클래스에서 여러개의 생성자를 선언하여 사용하는 것
//  생성자가 가지고 있는 매개변수의 데이터 타입, 개수, 순서가 다를 경우 생성자 오버로딩으로 사용할 수 있음
//  순서의 경우는 데이터 타입의 순서로 판단

//  Car4 클래스의 생성자
//  기본 생성자
  public Car4() {
  }

//  매개변수가 있는 생성자
  public Car4(String model) {
    this.model = model;
  }

//  매개변수의 개수는 같지만 매개변수의 데이터 타입이 다르기 때문에 생성자 오버로딩이 가능함
  public Car4(int maxSpeed) {
    this.maxSpeed = maxSpeed;
    this.model = "아반떼";
    this.color = "회색";
  }

  public Car4(String model, String color) {
    this.model = model;
    this.color = color;
  }

//  생성자의 매개변수 개수는 같지만 매개변수의 데이터 타입이 다르므로 생성자 오버로딩이 가능함
  public Car4(String model, int maxSpeed) {
    this.model = model;
    this.maxSpeed = maxSpeed;
    this.color = "회색";
  }

  public Car4(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }

//  매개변수의 개수는 같지만 매개변수의 데이터 타입의 순서가 다르기 때문에 생성자 오버로딩 가능함
  public Car4(int maxSpeed, String model, String color) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}












