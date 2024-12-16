
// 인터페이스로 선언한 RemoteControl
public interface RemoteControl {

//  인터페이스의 멤버
//  추상메소드, 상수, 정적 메소드, default 메소드
//  인터페이스는 기본적으로 public 접근제한자를 사용
  
//  상수 선언
//  인터페이스의 멤버로 사용된 필드는 무조건 상수
//  static final 키워드를 생략해도 컴파일러가 자동으로 추가함
//  기본적으로 public 접근제한자를 사용하므로 생략해도 컴파일러가 자동으로 추가함
  int MAX_VOLUME = 100;
  public static final int MIN_VOLUME = 0;

//  추상 메소드
//  인터페이스의 기본 멤버는 추상 메소드
//  기본 멤버가 추상 메소드 이므로 abstract 키워드를 생략 가능
//  인터페이스의 멤버는 기본적으로 public 접근제한자를 사용하므로 생략 가능
  void turnOn();
  abstract void turnOff();
  public abstract void setVolume(int volume);

//  정적 메소드
//  Java 8 부터 인터페이스의 기능 확장을 위해서 추가된 기능
//  인터페이스의 멤버는 기본적으로 public 접근제한자를 사용하므로 생략 가능
  public static void changeBattery() {
    System.out.println("배터리를 교체합니다.");
  }

//  default 메소드
//  Java 8 부터 인터페이스의 기능 확장을 위해서 추가된 기능
//  인터페이스의 멤버는 기본적으로 public 접근제한자를 사용하므로 생략 가능
//  클래스의 일반 메소드와 동일함
//  default 키워드를 추가한 메소드 (상속 됨, 오버라이딩 가능)
  public default void setMute(boolean mute) {
    if (mute) {
      System.out.println("무음 처리합니다.");
    }
    else {
      System.out.println("무음 해제합니다.");
    }
  }
}












