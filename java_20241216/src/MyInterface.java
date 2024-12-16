// 부모로 사용되는 인터페이스
public interface MyInterface {

//  상속해 줄 추상 메소드
  public void method1();
  
//  추가 기능을 위해서 추상메소드 추가
//  추가 기능을 추상 메소드를 통해서 추가 시 부모인 인터페이스가 가지고 있는 모든 추상 메소드를 구현해야 함
//  이럴 경우 디폴트 메소드로 기능을 추가하면 자식 클래스에서 상속받 오버라이딩하여 사용해도 되고, 그냥 그대로 사용해도 되고, 상속받고 안써도 됨
  public default void method2() {
    System.out.println("MyInterface 의 method2() 실행");
  }
}












