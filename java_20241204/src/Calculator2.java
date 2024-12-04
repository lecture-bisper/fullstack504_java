// Calculator2 클래스를 선언
public class Calculator2 {

//  Calculator2 클래스의 멤버인 메소드 선언
  int plus(int x, int y) {
    int result = x + y;
//    메소드 내에서 연산한 결과를 되돌려 줌
    return result;
  }


  double avg(int x, int y) {
//    같은 클래스의 멤버이기 때문에 메소드명만으로 메소드를 호출
//    호출한 메소드에서 연산된 결과를 받아서 사용
    double sum = plus(x, y);
    double result = sum / 2;
//    메소드 내에서 연산한 결과를 되돌려 줌
    return result;
  }

//  현재 클래스 외부에서 호출한 메소드
  void execute() {
//    현재 클래스의 멤버 중 avg() 메소드를 호출
//    같은 클래스의 멤버이기 때문에 메소드명만으로 메소드를 호출
//    호출한 메소드에서 연산된 결과를 받아서 사용
    double result = avg(7, 10);
//    같은 클래스의 멤버인 output() 메소드를 호출
//    같은 클래스의 멤버이므로 메소드명만 사용하여 메소드 호출
    output("실행결과 : " + result);
  }

//  매개변수로 전달받은 내용을 화면에 출력
  void output(String message) {
    System.out.println(message);
  }
}












