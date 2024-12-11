// 일반적인 클래스
public class Driver {

//  메소드, 매개변수로 Bus와 Taxi의 부모 클래스인 Vehicle 클래스 타입을 사용함
//  매개변수로 받을 수 있는 객체는 Vehicle 클래스의 객체, Bus 클래스의 객체, Taxi 클래스의 객체 모두 다 받을 수 있음
  public void drive(Vehicle vehicle) {
//    Vehicle 클래스의 멤버 run() 을 실행
    vehicle.run();
  }
}












