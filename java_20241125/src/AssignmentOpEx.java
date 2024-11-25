public class AssignmentOpEx {

  public static void main(String[] args) {

//    변수 result 선언과 동시에 0으로 초기화
//    대입 연산자를 사용하여 변수에 정수 0을 대입
    int result = 0;

//    대입 연산자를 연산 순위가 가장 느리므로 10 + result 가 먼저 연산됨
//    10 + result 한 결과를 변수 result 에 대입
    result = result + 10;
    System.out.println("result : " + result);

//    복합 대입 연산자 += 을 사용
//    += 의 의미는 result = result + 10 과 동일함
    result += 10;
    System.out.println("result : " + result);

//    String str = "";
//    str += "추가된 문자열";
//    str += "다시 추가한 문자열";
//    str += "또 다시 추가한 문자열";
//    str += "마지막으로 추가한 문자열";

//    result = result - 10; 과 동일함
    result -= 10;
    System.out.println("result : " + result);

    result *= 10;
    System.out.println("result : " + result);

    result /= 10;
    System.out.println("result : " + result);

    result %= 3;
    System.out.println("result : " + result);
  }
}












