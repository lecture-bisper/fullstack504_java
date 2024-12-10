package quiz;

public class Execute {

  public static void main(String[] args) {

    System.out.println("\n----- 문제 1 -----");
    Car1 car1 = new Car1();
    car1.brand = "테슬라";
    car1.color = "흰색";
    car1.year = 2024;

    System.out.println("브랜드 : " + car1.brand);
    System.out.println("색상 : " + car1.color);
    System.out.println("연식 : " + car1.year);

    System.out.println("\n\n----- 문제 2 -----");
    Car2 car2 = new Car2();
    car2.drive();

    System.out.println("\n\n----- 문제 3 -----");
    Car3 car3 = new Car3("롤스로이스", "검정", 2024);
    System.out.println("브랜드 : " + car3.brand);
    System.out.println("색상 : " + car3.color);
    System.out.println("연식 : " + car3.year);

    System.out.println("\n\n----- 문제 4 -----");
    Car4 car4 = new Car4();
    car4.setBrand("BMW");
    car4.setColor("검정");
    car4.setYear(2024);

    System.out.println("브랜드 : " + car4.getBrand());
    System.out.println("색상 : " + car4.getColor());
    System.out.println("연식 : " + car4.getYear());

    System.out.println("\n\n----- 문제 5 -----");
    Car5 car5 = new Car5("지프", "빨강", 2024);
    car5.printInfo();

    System.out.println("\n\n----- 문제 6 -----");
    Car6 car6 = new Car6();
    System.out.println("브랜드 : " + car6.getBrand());
    System.out.println("색상 : " + car6.getColor());
    System.out.println("연식 : " + car6.getYear());

    System.out.println("\n\n----- 문제 7 -----");
    Car7 arrCar7[] = new Car7[5];
    arrCar7[0] = new Car7("벤츠", "검정", 2024);
    arrCar7[1] = new Car7("BMW", "은색", 2024);
    arrCar7[2] = new Car7("폭스바겐", "흰색", 2023);
    arrCar7[3] = new Car7("기아자동차", "은색", 2024);
    arrCar7[4] = new Car7("르노코리아", "검정", 2024);

    for (int i = 0; i < arrCar7.length; i++) {
      arrCar7[i].printInfo();
    }

    System.out.println("\n\n----- 문제 8 -----");
    Rectangle rect = new Rectangle(10, 20);
    System.out.println("사각형의 넓이는 " + rect.getArea() + "입니다.");

    System.out.println("\n\n----- 문제 9 -----");
    Calculator calc = new Calculator();
    int result = calc.add(10, 20);
    System.out.println("메소드 add() 실행 결과 : " + result);
    result = calc.multiply(10, 20);
    System.out.println("메소드 multiply() 실행 결과 : " + result);

    System.out.println("\n\n----- 문제 10 -----");
    Lamp lamp = new Lamp();
    lamp.printStatus();
    lamp.turnOn();
    lamp.printStatus();
    lamp.turnOff();
    lamp.printStatus();
  }
}












