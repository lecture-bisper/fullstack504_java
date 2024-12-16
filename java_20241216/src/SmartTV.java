// 부모로 인터페이스 RemoteControl과 인터페이스 Searchable 을 모두 상속받아 구현한 클래스 SmartTV
// 인터페이스는 다중 상속이 가능함
public class SmartTV implements RemoteControl, Searchable {

//  SmartTV 클래스 전용 필드
  private int volume;

//  인터페이스 RemoteControl 에서 상속받은 메소드를 오버라이딩
  @Override
  public void turnOn() {
    System.out.println("스마트 TV를 켭니다.");
  }

//  인터페이스 RemoteControl 에서 상속받은 메소드를 오버라이딩
  @Override
  public void turnOff() {
    System.out.println("스마트 TV를 끕니다.");
  }

//  인터페이스 RemoteControl 에서 상속 받은 메소드를 오버라이딩
  @Override
  public void setVolume(int volume) {
    if (volume > RemoteControl.MAX_VOLUME) {
      this.volume = RemoteControl.MAX_VOLUME;
    }
    else if (volume < RemoteControl.MIN_VOLUME) {
      this.volume = RemoteControl.MIN_VOLUME;
    }
    else {
      this.volume = volume;
    }

    System.out.println("현재 스마트 TV 볼륨 : " + volume);
  }

//  인터페이스 Searchable 에서 상속 받은 메소드를 오버라이딩
  @Override
  public void search(String url) {
    System.out.println(url + "을 검색합니다.");
  }
}












