public class Child3 extends Parent3 {

  public String field2;

  @Override
  public void method2() {
    System.out.println("자식 클래스에서 오버라이딩된 method2() 실행");
  }

  public void method3() {
    System.out.println("자식 클래스 전용 method3() 실행");
  }
}












