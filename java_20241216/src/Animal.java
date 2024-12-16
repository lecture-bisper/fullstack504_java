// 추상 클래스로 선언한 Animal 클래스
// 추상 클래스는 추상 메소드를 가지고 있는 클래스
// 추상 메소드는 하나라도 가지고 있을 경우 추상 클래스가 됨
public abstract class Animal {

//  필드
  public String kind;
  
//  생성자, Animal 클래스가 기본 생성자를 입력하지 않았으므로 컴파일러가 기본 생성자를 자동 추가함

//  메소드
  public void breathe() {
    System.out.println("숨을 쉽니다.");
  }

//  추상 메소드 선언
//  추상 메소드는 메소드의 선언부만 존재하고 코드 블록은 없는 메소드
//  초상 메소드에는 abstract 키워드를 반드시 붙여 줌
  public abstract void sound();
}












