public class Calculator3 {

//  1번 형태, 매개변수 X, 반환값 X
  void plus1() {
    int x = 10;
    int y = 3;
    int result = x + y;
    System.out.println("두 수의 덧셈은 " + result + "입니다.");
  }

//  2번 형태, 매개변수 O, 반환값 X
  void plus2(int x, int y) {
    int result = x + y;
    System.out.println("두 수의 덧셈은 " + result + "입니다.");
  }

//  3번 형태, 매개변수 X, 반환값 O
  int plus3() {
    int x = 10;
    int y = 3;
    int result = x + y;
    return result;
  }

//  4번 형태, 매개변수 O, 반환값 O
  int plus4(int x, int y) {
    int result = x + y;
    return result;
  }

//  2번 방식
  void sum(int x, int y) {
    int result = x + y;
    System.out.println("두 수의 덧셈은 " + result + "입니다.");
  }

//  3번 방식
  int sub() {
    int x = 10;
    int y = 20;
    int result = x - y;
    return result;
  }

//  4번 방식
  int multi(int x, int y) {
    int result = x * y;
    return result;
  }

//  1번 방식
  void div() {
    int x = 10;
    int y = 3;
    double result = (double) x / y;
    System.out.println("두 수의 나눗셈은 " + result + "입니다.");
  }
}












