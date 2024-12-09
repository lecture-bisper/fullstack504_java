public class Car2Ex {

  public static void main(String[] args) {

    Car2 myCar = new Car2();
//    클래스 Car2의 필드가 모두 private 접근제한자 사용
//    myCar.speed = 100;

    myCar.setSpeed(-50);
    System.out.println("현재 속도 : " + myCar.getSpeed());

    myCar.setSpeed(60);
    System.out.println("현재 속도 : " + myCar.getSpeed());

    if (!myCar.isStop()) {
      myCar.setStop(true);
    }

    System.out.println("현재 속도 : " + myCar.getSpeed());
  }
}












