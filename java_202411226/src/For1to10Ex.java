public class For1to10Ex {

  public static void main(String[] args) {

//    for : 프로그래밍에서 가장 자주 사용하는 반복문
//    반복 실행할 횟수가 정해져 있을 경우 주로 사용함
//    구성은 초기화변수, 조건식, 증감식, 반복 소스 로 구성되어 있음
//    초기화변수는 for문 실행 시 첫번째 반복에서만 1번 실행됨
//    초기화 변수는 for문 내부에서 사용되고, for 문 밖에서는 삭제됨
//    조건식의 결과가 true 이면 코드 블록 안의 소스를 반복 실행함
//    코드 블록 안의 소스코드를 모두 실행 후 증감식으로 이동
//    증감식을 통해서 초기화변수의 값을 변경
//    다시 조건식을 확인하여 true 이면 코드 블록을 실행하고, false 이면 for문에서 탈출
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    for (int i = 1; i <= 10; i++) {
      System.out.println("나무꾼이 나무를 " + i + "번 찍습니다.");
    }

    System.out.println("나무가 넘어갑니다.");
//    i 는 for문 내부에서 선언되었기 때문에 for 문 밖에서 사용할 수 없음
//    System.out.println(i);

    System.out.println();

//    1 ~ 10 까지의 총합을 저장할 변수 선언
    int total = 0;

//    for 문을 통해서 1 ~ 10까지의 내용을 반복 실행
    for (int i = 1; i < 11; i++) {
      total = total + i;
      System.out.println("i : " + i + ", total : " + total);
    }

    System.out.println("1 ~ 10까지의 총합은 " + total + "입니다.");

    System.out.println("\n ----- 실수 데이터로 for문 사용 -----\n");

    double dTotal = 0.0;

    for (double x = 0.1; x <= 1.0; x+=0.1) {
      dTotal = (dTotal) + x;
      System.out.println("x : " + x + ", dTotal : " + dTotal);
    }

    System.out.println("0.1 ~ 1.0 까지의 실수 데이터의 총합 : " + dTotal);
  }
}












