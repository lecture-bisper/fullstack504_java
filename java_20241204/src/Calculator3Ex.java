public class Calculator3Ex {

  public static void main(String[] args) {

    Calculator3 cal = new Calculator3();

    System.out.println("----- 1번 형태 사용 -----");
    cal.plus1();
    cal.plus1();

    System.out.println("\n----- 2번 형태 사용 -----");
    cal.plus2(10, 3);
    cal.plus2(10, 20);

    System.out.println("\n----- 3번 형태 사용 -----");
    cal.plus3();
    int result3 = cal.plus3();
    System.out.println("두 수의 덧셈은 " + result3 + "입니다.");
    result3 = result3 + 10;
    System.out.println("반환받은 데이터를 추가 연산 후 결과 : " + result3);

    System.out.println("\n----- 4번 형태 사용 -----");
    cal.plus4(10, 3);
    int result4 = cal.plus4(10, 3);
    System.out.println("두 수의 덧셈은 " + result4 + "입니다.");
    result4 = cal.plus4(10, 20);
    System.out.println("두 수의 덧셈은 " + result4 + "입니다.");
    result4 = result4 * 2;
    System.out.println("반환받은 데이터를 추가 연산 후 결과 : " + result4);


//    문제 1) Calculator3 클래스에 사칙 연산을 위한 메소드를 선언하고 그 메소드를 사용하여 사칙 연산의 결과를 출력하는 프로그램을 작성하세요.
//    # 메소드명 : sum - 덧셈, sub - 뺄셈, multi - 곱셈, div - 나눗셈
//    # sum은 2번 형태, sub는 3번 형태, multi는 4번 형태, div 1번 형태
    System.out.println("\n----- 문제 1-----");
    cal.sum(10, 20);
    int result = cal.sub();
    System.out.println("두 수의 뺄셈은 " + result + "입니다");
    result = cal.multi(10, 20);
    System.out.println("두 수의 곱셈은 " + result + "입니다.");
    cal.div();

//    문제 2) 사용자 입력을 통해서 지정한 구구단을 출력하는 프로그램을 작성하세요.
//    # 구구단 출력 부분과 사용자 데이터 입력 부분을 서로 다른 메소드로 만들어서 실행

//    문제 3) 사용자 입력을 통해서 국어, 영어, 수학 3과목의 점수를 각각 입력받고, 총점과 평균, 등급을 출력하는 프로그램을 작성하세요
//    # 데이터 입력 메소드, 총점 계산 메소드, 평균 계산 메소드, 등급 계산 메소드, 결과 출력 메소드로 각각 분리하여 작성하세요
  }
}












