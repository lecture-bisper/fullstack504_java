public class Car2 {

//  인터페이스 타입의 배열 선언
//  배열 선언과 동시에 자식 클래스 타입의 객체로 초기화
  Tire tires[] = {
      new HankookTire(),
      new HankookTire(),
      new HankookTire(),
      new HankookTire()
  };

  public void run() {
//    부모 인터페이스 타입의 배열에서 자식 클래스 타입의 객체를 하나씩 꺼내와서 부모 인터페이스 타입의 변수에 저장하여 사용
    for (Tire tire : tires) {
//      부모인 인터페이스에서 제공하는 메소드로 실행, 결과는 저장된 자식 클래스 타입으로 출력
      tire.roll();
    }
  }
}












