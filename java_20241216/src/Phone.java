
// 추상 클래스로 선언한 Phone 클래스
// abstract 키워드를 사용하여 추상 클래스로 선언
// 추상 클래스는 객체를 생성할 수 없음 (부모 클래스로만 사용)
// 추상 클래스도 클래스이기 때문에 필드와 메소드를 상속해줄 수 있음
public abstract class Phone {

//  상속 가능한 필드
  public String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

//  상속 가능한 메소드
  public void turnOn() {
    System.out.println("폰 전원을 켭니다.");
  }

  public void turnOff() {
    System.out.println("폰 전원을 끕니다.");
  }
}












