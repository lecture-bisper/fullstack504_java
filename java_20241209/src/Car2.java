public class Car2 {

//  필드 선언, 접근제한자 private 사용, 외부에서 접근 불가
  private int speed;
  private boolean stop;
  private String str;

  public String getStr() {
    return str;
  }

  public void setStr(String str) {
    this.str = str;
  }

  //  필드 speed의 Getter 메소드 선언, 같은 클래스의 멤버이므로 private 으로 설정된 멤버에 접근 가능
//  접근제한자로 public 을 사용하여 외부에서 접근가능
  public int getSpeed() {
    return speed;
  }

//  필드 speed의 Setter 메소드 선언, 같은 클래스의 멤버이므로 private 으로 설정된 멤버에 접근 가능
//  매개변수로 입력받은 데이터를 private 으로 설정된 필드에 저장
//  정확한 데이터인지 검증할 수 있음
  public void setSpeed(int speed) {
    if (speed < 0) {
      this.speed = 0;
    }
    else if (speed > 100) {
      this.speed = 100;
    }
    else {
      this.speed = speed;
    }
  }

  public boolean isStop() {
    return stop;
  }

  public void setStop(boolean stop) {
    this.stop = stop;
    this.speed = 0;
  }
}












