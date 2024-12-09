public class Car {

//  인스턴스 멤버는 객체 생성 후 사용 가능
//  인스턴스 멤버인 필드
  int speed;

//  인스턴스 멤버인 메소드
  void run() {
    System.out.println(speed + "으로 달립니다.");
  }

//  정적 멤버인 필드
  static int speed2;

//  정적 멤버인 메소드
  static void run2() {
    System.out.println(speed2 + "으로 달립니다.");
  }

//  정적 초기화 블록
  static {
    speed2 = 60;
//    정적 멤버는 정적 멤버만 사용할 수 있음
//    정적 멤버 사용 시 인스턴스 멤버가 메모리에 로딩되어 있는지 알 수 없기 때문에 정적 멤버는 인스턴스 멤버를 사용 못함
//    speed = 100;
  }

  public static void main(String[] args) {

    Car myCar = new Car();
    myCar.speed = 50;
    myCar.run();

//    정적멤버를 클래스명으로 호출하여 사용하려고 하기 때문에 오류 발생
//    Car.speed;
//    Car.run();

//    정적 멤버를 사용하기 때문에 클래스명을 사용하여 정적 멤버를 호출함
    Car.run2();
    Car.speed2 = 100;
    Car.run2();

  }
}












