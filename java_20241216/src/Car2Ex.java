public class Car2Ex {

  public static void main(String[] args) {

    Car2 myCar = new Car2();
    myCar.run();

    System.out.println("\n-----------------------\n");

    myCar.tires[0] = new KumhoTire();
    myCar.tires[1] = new KumhoTire();

    myCar.run();
  }
}












