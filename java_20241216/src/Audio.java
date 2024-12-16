
// 인터페이스 RemoteControl을 상속받아 구현한 Audio 클래스
public class Audio implements RemoteControl {

//  필드
  private int volume;

//  상속받은 추상메소드 turnOn() 을 오버라이딩
  @Override
  public void turnOn() {
    System.out.println("Audio를 켭니다.");
  }

//  상속받은 추상메소드 turnOff() 를 오버라이딩
  @Override
  public void turnOff() {
    System.out.println("Audio를 끕니다.");
  }

//  상속받은 추상메소드 setVolume() 를 오버라이딩
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

    System.out.println("현재 Audio 볼륨 : " + this.volume);
  }
}












