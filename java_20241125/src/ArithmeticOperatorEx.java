public class ArithmeticOperatorEx {
  public static void main(String[] args) {
    int v1 = 5;
    int v2 = 2;

    int result1 = v1  + v2;
    System.out.println("result1 = " + result1);

    int result2 = v1 - v2;
    System.out.println("result2 = " + result2);

    int result3 = v1 * v2;
    System.out.println("result3 = " + result3);

//    v1 / v2 를 정수로 연산하여 원래는 2.5가 출력되어야 하지만 결과값도 정수로 출력되어 소수점 자리 숫자를 제외한 정수 2만 출력됨
    int result4 = v1 / v2;
    System.out.println("result4 = " + result4);

//    % 나머지 연산자로 연산 후 몫을 결과로 가져오는 것이 아니라 나누고 난 후 나머지 값을 결과로 가져옴
    int result5 = v1 % v2;
    System.out.println("result5 = " + result5);

//    정수값을 가지고 있는 변수 v1에 double 타입으로 강제 타입변환하여 5.0 으로 만들고 난 후 정수 2와 연산
//    double 타입과 int 타입의 연산으로 인식되어 더 큰 데이터 타입인 double 타입으로 모두 자동 타입 변환이 발생함
//    double 타입으로 연산 후 결과도 double 타입으로 출력
    double result6 = (double)v1 / v2;
    System.out.println("result6 = " + result6);

//    괄호 때문에 정수끼리의 연산이 먼저 발생하고, 강제 타입 변환을 진행하기 때문에 출력값이 2.0이 됨
    double result7 = (double) (v1 / v2);
    System.out.println("result7 = " + result7);
  }
}












