public class Car3Ex {

  public static void main(String[] args) {

//    Car3 클래스 타입의 객체 생성
    Car3 car = new Car3();

//    자동차를 5회전 시킴
    for (int i = 1; i <= 5; i++) {
//      한바퀴 달린 후 문제 지점 확인
      int position = car.run();

//      문제가 있는 위치가 0이 아니면 바퀴 교체
      if (position != 0) {
        System.out.println(car.tires[position - 1].location + " HankookTire로 교체");
        car.tires[position - 1] = new HankookTire3(car.tires[position - 1].location, 15);
      }

      System.out.println("-------------------------------------------");
    }
  }
}












