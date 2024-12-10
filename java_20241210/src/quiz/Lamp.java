package quiz;

// 문제 10) Lamp라는 클래스를 만들어, 속성으로 전원이 켜져 있는지 나타내는 isOn(boolean)을 추가하세요.
//전원을 켜는 turnOn() 메서드와 끄는 turnOff() 메서드를 작성하세요.
//상태를 출력하는 printStatus() 메서드를 추가하세요.
//객체를 생성하고 전원을 켜고 끄는 메서드를 호출하여 상태를 출력하세요.
public class Lamp {

  private boolean isOn;

  public Lamp() {
    this.isOn = false;
  }

  public void turnOn() {
    this.isOn = true;
  }

  public void turnOff() {
    this.isOn = false;
  }

  public void printStatus() {
    if (this.isOn == true) {
      System.out.println("램프가 켜져 있습니다.");
    }
    else {
      System.out.println("램프가 꺼져 있습니다.");
    }
  }
}












