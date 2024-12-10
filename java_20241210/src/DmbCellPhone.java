
// 부모 클래스인 CellPhone을 상속받아 사용하는 자식 클래스 DmbCellPhone 
public class DmbCellPhone extends CellPhone {
  
//  필드, DmbCellPhone 클래스 전용 필드
  int channel;
//  부모 클래스인 CellPhone에서 상속받은 필드가 존재함
//  사용자가 입력하지 않아도 내부적으로 존재함

//  this. : 객체 자신을 의미, 객체 자신의 멤버를 호출
//  this() : 객체 자신의 생성자에서 다른 생성자를 호출
//            this() 는 생성자 안에서 가장 먼저 실행되어야 함
//  super. : 부모 객체를 의미, 부모 객체의 멤버를 호출
//  super() : 부모 객체의 생성자를 호출
//            super() 는 자식 객체의 생성자에서 가장 먼저 실행되어야 함
//            부모 객체의 생성자를 의미하는 super() 도 기본 생성자는 생략 가능
//             super() 는 기본 생성자이므로 생략 시 컴파일러가 자동 추가
  
//  생성자
  DmbCellPhone(String model, String color, int channel) {
//    super();
    super(model, color);
//    부모 클래스인 CellPhone 에서 상속받은 필드 model과 color에 데이터 초기화
    System.out.println("DmbCellPhone 생성자 실행 시작");
    this.model = model;
    this.color = color;
    this.channel = channel;
    System.out.println("DmbCellPhone 생성자 실행 완료");
  }

//  메소드, DmbCellPhone 클래스 전용 메소드
  void turnOnDmb() {
    System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
  }

  void turnOffDmb() {
    System.out.println("DMB 방송 수신을 종료합니다.");
  }

  void changeChannelDmb(int channel) {
    this.channel = channel;
    System.out.println("채널 " + this.channel + "번 DMB 방송 수신으로 변경합니다.");
  }

//  메소드, 부모 클래스인 CellPhone 에서 상속받은 메소드가 존재함
}












