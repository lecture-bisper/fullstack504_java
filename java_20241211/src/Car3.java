public class Car3 {

//  기존에는 Tire 클래스 타입의 변수 4개 선언하여 사용
//  Tire 클래스 타입의 배열 선언, 배열의 크기는 4, 선언과 객체 생성 및 데이터 추가
  Tire3 tires[] = {
      new Tire3("앞 왼쪽", 6),
      new Tire3("앞 오른쪽", 2),
      new Tire3("뒤 왼쪽",3),
      new Tire3("뒤 오른쪽", 4)
  };
  
//  Tire 클래스 타입의 배열만 크기 4짜리로 선언
//  Tire3 tires[] = new Tire3[4];
//  
//  생성자를 통해서 객체 생성 및 각 배열의 index에 저장
//  public Car3() {
//    tires[0] = new Tire3("앞 왼쪽", 6);
//    tires[1] = new Tire3("앞 오른쪽", 2);
//    tires[2] = new Tire3("뒤 왼쪽",3);
//    tires[3] = new Tire3("뒤 오른쪽", 4);
//  }

//  자동차의 바퀴를 회전시키는 메소드
  int run() {
    System.out.println("[자동차가 달립니다.]");

//    배열의 크기만큼 반복 실행
    for (int i = 0; i < tires.length; i++) {
//      배열의 요소가 가지고 있는 roll() 메소드 반복 실행
      if (tires[i].roll() == false) {
        stop();
        return (i + 1);
      }
    }

    return 0;
  }

  void stop() {
    System.out.println("[자동차가 멈춥니다.]");
  }
}












