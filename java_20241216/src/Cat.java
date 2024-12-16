// 추상 클래스인 Animal 클래스를 상속받은 Cat 클래스
public class Cat extends Animal {

//  추상 클래스인 Animal 에서 상속 받은 필드 kind가 존재

  public Cat() {
//    추상 클래스인 Animal 클래스에서 기본 생성자를 사용하므로 자식 클래스인 Cat 클래스의 생성자에서 super() 를 호출해야하지만 기본 생성자이므로 생략해도 상관없음
    
//    상속받은 필드 사용
    this.kind = "포유류";
  }

//  추상 클래스인 Animal 에서 상속 받은 메소드 breath() 가 존재

//  추상 클래스인 Animal 에서 상속 받은 추상 메소드 sound()를 오버라이딩하여 사용
//  상속 받은 추상 메소드는 반드시 오버라이딩해야 함
//  상속 받은 추상 메소드를 오버라이딩 하지 않을 경우 해당 클래스도 추상 클래스로 선언해야 함
  @Override
  public void sound() {
    System.out.println("야옹");
  }
}












