public class RemoteControl3Ex {

  public static void main(String[] args) {

//    일반적인 부모 인터페이스를 통한 자식 클래스 객체 사용하기
    RemoteControl rc = new SmartTV();
    rc.turnOn();
    rc.setVolume(80);
    rc.turnOff();

    System.out.println("\n----- 익명 구현 객체 -----");

//    익명 구현 객체 : 인터페이스로 바로 구현 클래스를 생성하는 것
//    익명 구현 객체는 클래스명이 존재하지 않기 때문에 추가적으로 객체를 만들 수 없음 (1회용)
    RemoteControl rc2 = new RemoteControl() {

      private int volume;

      @Override
      public void turnOn() {
        System.out.println("전원을 켭니다.");
      }

      @Override
      public void turnOff() {
        System.out.println("전원을 끕니다");
      }

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
        System.out.println("현재 볼륨 : " + volume);
      }

//      일반 메소드 선언
//      익명 구현 객체에서 일반 메소드를 선언 시 외부에서 사용할 수 없음
//      익명 구현 객체는 부모가 되는 인터페이스에서 제공하는 메소드만 사용할 수 있는데, 익명 구현 객체에서 선언한 일반 메소드는 인터페이스에서 제공하는 메소드가 아니기 때문에 접근이 불가능함, 내부적으로만 사용 가능
      public int getVolume() {
        return this.volume;
      }
    };

    rc2.turnOn();
    rc2.setVolume(90);
    rc2.turnOff();
//    외부에서 접근 불가
//    rc2.getVolume();

  }
}












