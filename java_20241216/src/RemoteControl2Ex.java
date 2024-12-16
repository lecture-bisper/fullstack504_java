public class RemoteControl2Ex {

  public static void main(String[] args) {

    Audio audio = new Audio();
    audio.turnOn();
    audio.setVolume(10);
    audio.turnOff();

    System.out.println();

    Tv tv = new Tv();
    tv.turnOn();
    tv.setVolume(20);
    tv.turnOff();

    System.out.println();

//    RemoteControl, Searchable 인터페이스에서 다중 상속 받아 구현한 메소드를 모두 사용하고 있음
    SmartTV smartTV = new SmartTV();
    smartTV.turnOn();
    smartTV.setVolume(10);
//    Searchable 인터페이스에서 상속 받아 구현한 search() 메소드
    smartTV.search("네이버");
    smartTV.turnOff();

    System.out.println();

    RemoteControl rc;
    rc = audio;
    rc.setVolume(30);

    rc = tv;
    rc.setVolume(40);

    rc = smartTV;
    rc.setVolume(50);
//    부모 중 RemoteControl 인터페이스 타입의 변수에 자식 클래스인 SmartTV 타입의 객체를 저장하여 사용 시 부모인 RemoteControl 의 멤버만 사용할 수 있음
//    rc.search("구글");

    Searchable searchable;
    searchable = smartTV;
    searchable.search("유튜브");
//    부모 중 Searchable 인터페이스 타입의 변수에 자식 클래스인 SmartTV 타입의 객체를 저장하여 사용 시 부모인 Searchable 의 멤버만 사용할 수 있음
//    searchable.setVolume(60);

  }
}












