public class SupersonicAirplaneEx {

  public static void main(String[] args) {

//    자식 클래스인 SupersonicAirplane 클래스 타입의 객체 생성
    SupersonicAirplane sa = new SupersonicAirplane();
//    상속받아 사용하는 메소드 호출
    sa.takeOff();
//    상속받은 메소드를 오버라이딩한 메소드 호출
    sa.fly();
//    자식 클래스의 멤버인 flyMode 값 설정
    sa.flyMode = SupersonicAirplane.SUPERSONIC;
//    상속받은 메소드를 오버라이딩한 메소드 호출
    sa.fly();
    sa.flyMode = SupersonicAirplane.NORMAL;
    sa.fly();
//    상속받아 사용하는 메소드 호출
    sa.land();
  }
}












