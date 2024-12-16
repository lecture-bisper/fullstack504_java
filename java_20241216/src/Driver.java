public class Driver {

//  부모 인터페이스인 Vehicle 을 매개변수로 사용하는 메소드
  public void drive(Vehicle vehicle) {
//    매개변수로 받아오는 자식 클래스 타입의 객체에 따라 출력되는 결과가 달라짐
    vehicle.run();
  }
}












