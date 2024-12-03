public class Car4Ex {

  public static void main(String[] args) {

//    Car4 클래스 타입의 변수 car01을 선언과 동시에 객체 생성
//    기본 생성자를 사용하여 객체 생성
    Car4 car01 = new Car4();
    System.out.println("car01.company : " + car01.company);
    System.out.println("car01.model : " + car01.model);
    System.out.println("car01.color : " + car01.color);
    System.out.println("car01.maxSpeed : " + car01.maxSpeed);
    System.out.println();

//    Car4 클래스 타입의 변수 car02을 선언과 동시에 객체 생성
//    매개변수가 1개인 생성자를 사용하여 객체 생성
    Car4 car02 = new Car4("EV5");
    System.out.println("car02.company : " + car02.company);
    System.out.println("car02.model : " + car02.model);
    System.out.println();

//    Car4 클래스 타입의 변수 car03을 선언과 동시에 객체 생성
//    매개변수가 2개인 생성자를 사용하여 객체 생성
    Car4 car03 = new Car4("EV5", "흰색");
    System.out.println("car03.company : " + car03.company);
    System.out.println("car03.model : " + car03.model);
    System.out.println("car03.color : " + car03.color);
    System.out.println();

//    Car4 클래스 타입의 변수 car04을 선언과 동시에 객체 생성
//    매개변수가 3개인 생성자를 사용하여 객체 생성
    Car4 car04 = new Car4("EV5", "흰색", 250);
    System.out.println("car04.company : " + car04.company);
    System.out.println("car04.model : " + car04.model);
    System.out.println("car04.color : " + car04.color);
    System.out.println("car04.maxSpeed : " + car04.maxSpeed);
    System.out.println();

    Car4 car05 = new Car4(250, "EV5", "흰색");
    System.out.println("car05.company : " + car05.company);
    System.out.println("car05.model : " + car05.model);
    System.out.println("car05.color : " + car05.color);
    System.out.println("car05.maxSpeed : " + car05.maxSpeed);
    System.out.println();

    Car4 car06 = new Car4("EV5", 250);
    System.out.println("car06.company : " + car06.company);
    System.out.println("car06.model : " + car06.model);
    System.out.println("car06.maxSpeed : " + car06.maxSpeed);
    System.out.println();

    Car4 car07 = new Car4(250);
    System.out.println("car07.company : " + car07.company);
    System.out.println("car07.maxSpeed : " + car07.maxSpeed);
    System.out.println();
  }
}












