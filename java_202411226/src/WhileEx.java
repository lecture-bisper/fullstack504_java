public class WhileEx {

  public static void main(String[] args) {

//    while : for 문과 같이 프로그래밍 언어에서 자주 사용하는 반복문
//    while 키워드 뒤에 반복 조건을 입력하고 반복 조건의 결과가 true 이면 코드 블록의 내용을 반복 실행함

//    for문과의 차이점(주의사항)
//    - 초기화 변수를 while 문 외부에 선언하고 while 문 내부에서 사용함
//    - while 을 연속적으로 사용할 경우 같은 초기화 변수를 사용하면 2번째 while문이 실행되지 않을 수 있음
//    - 첫번째 while 문 사용 후 초기화변수의 값이 그대로 있음
//    - 증감식을 반복 소스 코드가 있는 코드 블록 안에서 실행
//    - 코드 블록 내에서의 증감식 위치에 따라 출력되는 결과가 달라짐
//    - 증감식을 생략할 경우 무한반복이 될 수 있음

//    기본적인 while 문 사용
    int i = 0; // 초기화 변수 선언

//    while 문 선언 및 반복 조건식 입력
    while (i < 10) {
//      반복 실행할 소스코드
      System.out.println(i);

      i++; // 증감식
    }


    System.out.println("\n ----- while 문으로 1 ~ 10 까지 총합 ----- \n");

    int total = 0;
    int count = 1;

    while (count < 11) {
      total = total + count;
      System.out.println("count : " + count + ", total : " + total);
      count++;
    }

    System.out.println("1 ~ 10까지의 총합은 " + total + "입니다.");


    System.out.println("\n ----- while 2번 연속 시 주의 ----- \n");

    int j = 0;

//    첫번째 while문은 초기화 변수 값이 0으로 시작됨
    System.out.println("----- 첫번째 while문 실행 -----");
    while (j < 5) {
      System.out.println("j의 값 : " + j);
      j++;
    }

//    두번째 while문은 초기화 변수 j의 값이 이미 5 이기 때문에 두번째 while문의 반복조건에 맞지 않음, 한번도 실행되지 않음
//    j = 0; // while 문 사용 전 반드시 초기화 진행
    System.out.println("----- 두번째 while문 실행 -----");
    while (j < 5) {
      System.out.println("두번째 while문에서 j의 값 : " + j);
      j++;
    }

    System.out.println("\n ----- for 2번 연속 시 -----\n");

    for (int k = 0; k < 5; k++) {
      System.out.println("첫번째 for 문에서 k의 값 : " + k);
    }

    for (int k = 0; k < 5; k++) {
      System.out.println("두번째 for 문에서 k의 값 : " + k);
    }


    System.out.println("\n ----- 증감식 위치에 따라 다른 결과 -----\n");

    int c = 0;

    while (c < 11) {
//      c++; // 증감식을 먼저 실행 후 나머지 실행

      System.out.println("나무꾼이 도끼로 나무를 " + c + "번 찍습니다.");

//      c++; // 반복 소스코드 중간에 증감식을 실행

      if (c == 10) {
        System.out.println("나무가 넘어갑니다.");
        break;
      }

//      c++; // 반복 소스코드를 다 실행하고 마지막에 증감식 실행
    }
  }
}












