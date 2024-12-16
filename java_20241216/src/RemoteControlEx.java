public class RemoteControlEx {

  public static void main(String[] args) {

//    인터페이스는 객체 생성이 불가능 함
//    인터페이스 타입의 변수만 생성이 가능
//    인터페이스 타입의 변수에 자식 클래스 타입의 객체를 저장해서 사용(다형성)
//    부모인 인터페이스 타입에서 제공하는 메소드만 사용 가능
//    실제로 실행하면 결과는 저장된 자식 클래스 타입의 객체를 통해서 결과를 출력
//    자식 객체의 사용 방법을 지정하여 외부에 제공

//    인터페이스는 다중 상속을 지원함

    RemoteControl rc;
    rc = new Audio();
    rc.turnOn();
    rc.setVolume(10);
    rc.turnOff();

    System.out.println("----------------");

    rc = new Tv();
    rc.turnOn();
    rc.setVolume(30);
    rc.turnOff();
  }
}












