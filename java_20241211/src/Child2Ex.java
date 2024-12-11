public class Child2Ex {

  public static void main(String[] args) {

    System.out.println("----- 부모 클래스 객체 생성 -----");
//    부모 클래스 타입의 변수에 부모 클래스 타입의 객체 생성/저장
    Parent2 parent = new Parent2();
//    부모 클래스 타입의 멤버 호출
    parent.method1();
    parent.method2();

    System.out.println("\n----- 자식 클래스 객체 생성 -----");
//    자식 클래스 타입의 변수에 자식 클래스 타입의 객체 생성/저장
    Child2 child = new Child2();
//    부모 클래스에서 상속받은 메소드 그대로 사용
    child.method1();
//    부모 클래스에서 상속받은 메소드를 오버라이딩한 메소드 호출
    child.method2();
//    자식 클래스 전용 메소드 호출
    child.method3();

    System.out.println("\n----- 부모 타입의 변수에 자식 객체 저장 -----");
//    부모 클래스 타입의 변수에 자식 클래스 타입의 객체 저장
//    겉 모양은 부모 클래스 타입의 객체이지만 알맹이는 자식 클래스 타입의 객체임
//    부모 클래스 타입의 사용 방법대로 사용해야 함
    parent = child;
//    알맹이인 자식 클래스 타입의 멤버인 메소드이지만 원래 부모 클래스에서 상속받은 메소드를 그대로 사용하는 것임
    parent.method1();
//    알맹이인 자식 클래스 타입의 멤버인 메소드이지만 오버라이딩하여 사용하는 메소드
    parent.method2();
//    알맹이인 자식 클래스 타입의 전용 메소드이지만 현재는 겉 모양이 부모 클래스 타입으로 변환되어 있으므로 부모 클래스 타입의 사용방법대로 사용해야 하기 때문에 자식 클래스 전용 메소드를 사용할 수 없음
//    parent.method3();
  }
}












