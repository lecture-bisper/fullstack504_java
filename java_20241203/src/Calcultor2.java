public class Calcultor2 {

//  메소드 : 클래스의 멤버 중 하나로 사용자가 특정 결과를 얻기 위해서 필요한 소스 코드들을 하나의 이름(메소드명)으로 묶어 놓은 것
//  메소드만 호출하면 원하는 연산이 자동으로 실행되고 그 결과를 출력
//  소스코드의 중복을 줄이기 위함
//  간단한 소스코드를 사용하기 위함
//  유지보수가 쉬워짐

  public void sum(int x, int y) {
    int result = x + y;
    System.out.println("두 수의 덧셈은 " + result + " 입니다.");
  }

  public void sub(int x, int y) {
    int result = x - y;
    System.out.println("두 수의 뺄셈은 " + result + " 입니다.");
  }

  public void multi(int x, int y) {
    int result = x * y;
    System.out.println("두 수의 곱셈은 " + result + " 입니다.");
  }

  public void div(int x, int y) {
    double result = (double)x / y;
    System.out.println("두 수의 나눗셈은 " + result + " 입니다.");
  }
}












