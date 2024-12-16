public class ExtendsEx {

  public static void main(String[] args) {

//    InterC를 상속받아 구현한 ImplC 클래스 타입의 객체 생성
    ImplC impl = new ImplC();
    impl.methodA();
    impl.methodB();
    impl.methodC();
    System.out.println();

//    상속 관계에 있기 때문에 구현 클래스 ImplC 타입의 객체를 InterA 인터페이스 타입의 변수에 저장할 수 있음
    InterA ia = impl;
//    InterA 가 methodA() 만 가지고 있으므로 methodA() 만 사용 가능
    ia.methodA();
    System.out.println();

//    상속 관계에 있기 때문에 구현 클래스 ImplC 타입의 객체를 InterB 인터페이스 타입의 변수에 저장할 수 있음
//    InterB 가 methodB() 만 가지고 있으므로 methodB() 만 사용 가능
    InterB ib = impl;
    ib.methodB();
    System.out.println();

//    상속 관계에 있기 때문에 구현 클래스 ImplC 타입의 객체를 InterC 인터페이스 타입의 변수에 저장할 수 있음
//    InterC 는 InterA, InterB 에서 methodA(), methodB()를 상속받아 사용하고 있으므로 methodA(), methodB(), methodC()를 모두 사용할 수 있음
    InterC ic = impl;
    ic.methodC();
    ic.methodA();
    ic.methodB();
  }
}












