public class Child3Ex {

  public static void main(String[] args) {

    Parent3 parent = new Parent3();
    parent.field1 = "부모 클래스의 변수 field1";
    System.out.println(parent.field1);
    parent.method1();
    parent.method2();

    System.out.println();

    Child3 child = new Child3();
    child.field1 = "부모 클래스에서 상속받은 변수 field1";
    System.out.println(child.field1);
    child.field2 = "자식 클래스 전용 변수 field2";
    System.out.println(child.field2);
    child.method1();
    child.method2();
    child.method3();

    System.out.println("\n----- 다형성 실행 후 -----");
//    부모 클래스 타입의 변수에 자식 클래스 타입의 객체 저장
    parent = child;
//    부모 클래스인 Parent3에 원래 존재하는 필드 field1 사용 가능
    parent.field1 = "다형성 실행 후 field1";
    System.out.println(parent.field1);
//    자식 클래스 전용인 필드 field2 은 부모 클래스 타입의 변수가 아니기 때문에 사용 불가
//    parent.field2 = "다형성 실행 후 field2";
//    System.out.println(parent.field2);
    parent.method1();
    parent.method2();
//    자식 클래스 전용은 메소드 method3() 은 부모 클래스 타입의 메소드가 아니기 때문에 사용 불가
//    parent.method3();

    System.out.println("\n ----- 강제 타입 변환 후 -----");

    Child3 child2 = (Child3)parent;
    child2.field1 = "강제 타입 변환 후 field1";
    System.out.println(child2.field1);
    child2.field2 = "강제 타입 변환 후 field2";
    System.out.println(child2.field2);
    child2.method1();
    child2.method2();
    child2.method3();

    System.out.println("\n----- 처음부터 부모 타입을 강제 타입 변환 시 -----");
    Parent3 parent3 = new Parent3();
//    오류 발생, 원본이 부모 타입인 객체는 자식 클래스 타입의 변수로 강제 타입 변환할 수 없음
//    Child3 child3 = (Child3)parent3;
//    child3.field1 = "내용";
//    child3.field2 = "내용";
//    child3.method1();
//    child3.method2();
//    child3.method3();

  }
}












