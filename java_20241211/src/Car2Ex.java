public class Car2Ex {

  public static void main(String[] args) {

//    Car2 클래스 타입의 객체 생성
    Car2 car = new Car2();

//    바퀴 5회 회전
    for (int i = 1; i <= 5; i++) {
//      문제가 있는 바퀴의 위치 가져오기, 0 ~ 4 까지의 값 가져옴
      int problemLocation = car.run();

//      문제가 있는 바퀴 위치로 switch ~ case문 실행
      switch (problemLocation) {
//        1 이면 앞 왼쪽 교체
        case 1:
          System.out.println("앞 왼쪽 HankookTire로 교체");
//          앞 왼쪽 타이어(부모인 Tire 클래스 타입의 객체)에 자식 클래스인 HankookTire 클래스 타입의 객체를 저장
          car.frontLeftTire = new HankookTire("앞 왼쪽", 15);
          break;

//          2이면 앞 오른쪽 교체
        case 2:
          System.out.println("앞 오른쪽 KumhoTire로 교체");
//          앞 오른쪽 타이어(부모인 Tire 클래스 타입의 객체)에 자식 클래스인 KumhoTire 클래스 타입의 객체를 저장
          car.frontRightTire = new KumhoTire("앞 오른쪽", 13);
          break;

//          3이면 뒤 왼쪽 교체
        case 3:
          System.out.println("뒤 왼쪽 HankookTire로 교체");
          car.backLeftTire = new HankookTire("뒤 왼쪽", 14);
          break;

//          4이면 뒤 오른쪽 교체
        case 4:
          System.out.println("뒤 오른쪽 KumhoTire로 교체");
          car.backRightTire = new KumhoTire("뒤 오른쪽", 17);
          break;
      }

      System.out.println("--------------------------------------------------");
    }
  }
}












