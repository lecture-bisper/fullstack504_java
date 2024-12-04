// Car 클래스 선언
public class Car {

//  필드 선언
  int speed;

//  생성자 없음, 컴파일러가 빈 기본 생성자 추가
  
//  메소드 선언
//  현재 필드값을 출력
  int getSpeed() {
    return speed;
  }

  void keyTurnOn() {
    System.out.println("키를 돌립니다.");
  }

//  반복문을 사용하고 현재 필드의 값을 계속 올리고 화면 출력
  void run() {
    for (int i = 10; i <= 50; i+=10) {
      speed = i;
      System.out.println("달립니다.(시속 : " + speed + "km/s)");
    }
  }
}












