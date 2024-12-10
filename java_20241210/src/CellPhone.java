// 부모 클래스로 사용하는 CellPhone 클래스
public class CellPhone {

//  필드, 접근제한자가 private 이 아니기 때문에 상속 가능
  String model;
  String color;

//  기본 생성자
  public CellPhone() {
    System.out.println("CellPhone 생성자 실행 시작");
    System.out.println("CellPhone 생성자 실행 완료");
  }

//  매개변수를 가지는 생성자
  public CellPhone(String model, String color) {
    System.out.println("매개변수가 있는 CellPhone 생성자 실행 시작");
    this.model = model;
    this.color = color;
    System.out.println("매개변수가 있는 CellPhone 생성자 실행 완료");
  }

//  메소드, 접근제한자가 private 이 아니기 때문에 상속 가능
  void powerOn() {
    System.out.println("전원을 켭니다.");
  }

  void powerOff() {
    System.out.println("전원을 끕니다.");
  }

  void bell() {
    System.out.println("벨이 울립니다.");
  }

  void sendVoice(String message) {
    System.out.println("나 : " + message);
  }

  void receiveVoice(String message) {
    System.out.println("상대방 : " + message);
  }

  void hangUp() {
    System.out.println("전화 통화를 종료합니다.");
  }
}












