public class Vehicle2Ex {

  public static void main(String[] args) {

//    부모인 Vehicle 인터페이스 타입의 변수 선언
//    부모 인터페이스 타입의 변수에 자식 클래스인 Bus2 클래스 타입의 객체 저장
    Vehicle vehicle = new Bus2();
//    부모 인터페이스에서 제공하는 run() 메소드 실행, 결과는 Bus2 객체로 출력
    vehicle.run();
//    부모 인터페이스에서는 checkFare() 메소드를 제공하지 않기 때문에 실행불가
//    vehicle.checkFare();

//    원본이 Bus2 타입의 객체였던 부모 인터페이스 타입의 변수를 다시 자식 클래스 타입의 객체로 변환
    Bus2 bus2 = (Bus2) vehicle;
    bus2.run();
//    자식 클래스가 가지고 있던 멤버 메소드 checkFare()가 실행 가능함
    bus2.checkFare();

    System.out.println("\n ----- instanceof ----- \n");

//    Vehicle 인터페이스를 부모로 가지는 Taxi 클래스
//    Taxi 클래스 타입의 객체 생성
    Taxi taxi2 = new Taxi();

//    부모 타입의 변수에 자식 타입인 Bus2 클래스 타입의 객체를 저장
    vehicle = bus2;
    vehicle.run();

//    부모 타입의 변수에 자식 타입인 Taxi 클래스 타입의 객체를 저장
    vehicle = taxi2;
    vehicle.run();

//    부모 타입 변수를 자식 클래스 타입의 객체로 강제 타입 변환
//    오류 발생, 부모 타입의 변수에 마지막으로 저장한 객체가 Bus2 클래스 타입이 아닌 Taxi 클래스 타입의 객체임
//    Bus2 bus3 = (Bus2) vehicle;
//    bus3.run();
//    bus3.checkFare();

//    instanceof 연산자를 사용하여 부모 타입의 변수에 저장된 객체의 원본이 어떤 클래스인지 확인하고 강제 타입변환을 진행

//    vehicle = bus2;
    if (vehicle instanceof Bus2) {
      Bus2 bus3 = (Bus2) vehicle;
      bus3.run();
      bus3.checkFare();
    } else {
      vehicle.run();
    }
  }
}









