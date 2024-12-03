public class Car5Ex {

  public static void main(String[] args) {

    Car5 car01 = new Car5();
    System.out.println("car01.company : " + car01.company);
    System.out.println("car01.model : " + car01.model);
    System.out.println("car01.color : " + car01.color);
    System.out.println("car01.maxSpeed : " + car01.maxSpeed);
    System.out.println();

    Car5 car02 = new Car5("EV3");
    System.out.println("car02.company : " + car02.company);
    System.out.println("car02.model : " + car02.model);
    System.out.println();

    Car5 car03 = new Car5("EV3", "회색");
    System.out.println("car03.company : " + car03.company);
    System.out.println("car03.model : " + car03.model);
    System.out.println("car03.color : " + car03.color);
    System.out.println();

    Car5 car04 = new Car5("EV3", "회색", 200);
    System.out.println("car04.company : " + car04.company);
    System.out.println("car04.model : " + car04.model);
    System.out.println("car04.color : " + car04.color);
    System.out.println("car04.maxSpeed : " + car04.maxSpeed);
    System.out.println();
  }
}












