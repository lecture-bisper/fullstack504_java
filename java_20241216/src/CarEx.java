public class CarEx {

  public static void main(String[] args) {
    
//    Car 클래스 타입의 객체 생성
    Car myCar = new Car();
//    Car 클래스로 생성한 객체의 인스턴스 멤버 메소드를 호출
    myCar.run();

    System.out.println("\n ---------------------\n ");
//    Car 클래스 타입의 객체가 가지고 있는 필드에 자식 클래스 타입의 객체를 생성하여 저장 (순서를 변경)
    myCar.frontLeftTire = new KumhoTire();
    myCar.frontRightTire = new KumhoTire();
    myCar.backLeftTire = new HankookTire();
    myCar.backRightTire = new HankookTire();

    myCar.run();
  }
}












