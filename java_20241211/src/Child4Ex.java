public class Child4Ex {

//  매개변수로 부모 클래스 타입의 변수를 받음
  public static void method1(Parent4 parent) {
//    instanceof 연산자를 사용하여 원본이 지정한 클래스 타입이 맞는지 확인
    if (parent instanceof Child4) {
//      지정한 타입이 맞으면 강제 타입 변환
      Child4 child = (Child4) parent;
      System.out.println("method1 - Child4로 변환 성공");
    }
    else {
      System.out.println("method1 - Child4로 변환 불가");
    }
  }

//  매개변수로 부모 클래스 타입의 변수를 받음
  public static void method2(Parent4 parent) {
//    자식 클래스 타입으로 강제 타입 변환
    Child4 child = (Child4) parent;
    System.out.println("method2 - Child4로 변환 성공");
  }

  public static void main(String[] args) {
//    원본이 자식 클래스 타입
    Parent4 parentA = new Child4();
    method1(parentA);
    method2(parentA);

    System.out.println();

    Parent4 parentB = new Parent4();
    method1(parentB);
    method2(parentB);
  }
}












