public class PhoneEx {

  public static void main(String[] args) {

//    Phone 클래스는 추상 클래스이므로 객체 생성이 불가능함
//    new 키워드와 생성자 호출이 불가
//    Phone phone = new Phone("유재석");
//    phone.turnOn();
//    phone.turnOff();

//    추상 클래스는 객체는 생성이 불가능하지만 추상 클래스 타입의 변수는 생성할 수 있음 (다형성을 위해서 사용할 수 있음)
    Phone phone;

    System.out.println();

//    추상 클래스는 부모 클래스로만 사용이 가능함
    SmartPhone smartPhone = new SmartPhone("아이유");
//    owner은 추상 클래스인 Phone 클래스에서 상속해준 필드
    System.out.println(smartPhone.owner);
//    turnOn()는 추상 클래스인 Phone 클래스에서 상속해준 메소드
    smartPhone.turnOn();
    smartPhone.internetSearch();
//    turnOff()는 추상 클래스인 Phone 클래스에서 상속해준 메소드
    smartPhone.turnOff();
  }
}












