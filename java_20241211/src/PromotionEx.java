public class PromotionEx {

  public static void main(String[] args) {

//    자손 클래스 타입 각각의 객체 생성
    B b = new B();
    C c = new C();
    D d = new D();
    E e = new E();

//    최상위 조상 클래스 타입의 변수 선언
//    각각의 자손 객체를 저장
    A a1 = b;
    A a2 = c;
    A a3 = d;
    A a4 = e;

//    부모 클래스 타입의 변수에 자식 클래스 타입의 객체 저장
    B b1 = d;
    C c1 = e;
    
//    직계 상속 관계가 아니기 때문에 오류 발생
//    B b2 = e;
//    C c2 = d;
  }
}












