public class Car2 {

//  필드(멤버 변수 선언)
  String model;
  int speed;

//  생성자 선언
  Car2(String model) {
//    매개변수로 받은 model을 필드인 model에 저장
    this.model = model;
  }

  void setSpeed(int speed) {
//    매개변수로 받은 speed 를 필드인 speed에 저장
    this.speed = speed;
  }

  void run() {
    for (int i = 10; i <= 50; i+=10) {
      setSpeed(i);
      System.out.println(model + "가 달립니다.(시속 : " + speed + "km/s)");
    }
  }
}












