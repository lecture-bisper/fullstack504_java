public class Singleton {

//  접근제한자 private은 외부의 접근을 제한하고 클래스 내부에서만 사용하도록 함

//  클래스 내부에서는 생성자를 호출할 수 있으므로 객체 생성 가능
//  static을 사용하여 정적 멤버로 선언하여 데이터를 공유
//  접근제한자 private를 사용하여 외부에서 직접 접근을 막음
  private static Singleton singleton = new Singleton();

//  기본 생성자, 접근제한자를 private로 사용하여 외부에서 객체 생성을 못하도록 막음
  private Singleton() {}

//  정적 메소드이므로 정적 필드인 singleton 객체에 접근 가능
//  접근제한자 private 이 없으므로 외부에서 해당 메소드 사용 가능
  static Singleton getInstance() {
//    반환값으로 정적 멤버인 singleton을 반환
    return singleton;
  }
}












