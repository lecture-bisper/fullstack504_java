public class DriverEx {

  public static void main(String[] args) {

    System.out.println("----- 매개변수의 다형성 사용 -----");
    Driver driver = new Driver();

    Vehicle vehicle = new Vehicle();
    Bus bus = new Bus();
    Taxi taxi = new Taxi();

    driver.drive(vehicle);
    driver.drive(bus);
    driver.drive(taxi);

    System.out.println("\n ----- 일반 다형성 방식 -----");
    vehicle.run();

    vehicle = bus;
    vehicle.run();
    vehicle = taxi;
    vehicle.run();
  }
}












