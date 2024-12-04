public class Car2Ex {

  public static void main(String[] args) {

//    Car2 클래스 타입의 변수 car1 을 생성
//    new 키워드와 Car2() 생성자를 호출하여 객체 생성 및 주소 저장
    Car2 car1 = new Car2("포르쉐");
//    Car2 클래스 타입의 변수 car2 을 생성
//    new 키워드와 Car2() 생성자를 호출하여 객체 생성 및 주소 저장
    Car2 car2 = new Car2("현대자동차");

//    객체 car1과 객체 car2 는 동일한 클래스를 바탕으로 생성된 객체이지만 서로 다른 객체임
    car1.run();
    car2.run();
  }
}












