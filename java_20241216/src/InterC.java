// 부모 인터페이스 InterA, InterB를 동시에 상속받아 사용하는 인터페이스 InterC
// 인터페이스끼리는 다중 상속이 가능함
public interface InterC extends InterA, InterB {

//  InterA와 InterB에서 상속받은 추상 메소드 methodA(), methodB() 가 존재함
//  현재 InterC 는 인터페이스 이므로 상속 받은 추상메소드를 구현하지 못 함
  
//  상속해 줄 추상 메소드
  public void methodC();
}












