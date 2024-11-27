public class MultiForWhileEx {

  public static void main(String[] args) {

    System.out.println("----- 기본 for 문 -----");

    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    System.out.println("\n----- 중첩 for 문 -----");

//    중첩 for 문 : for문 안에 또 for문이 존재하는 for문
//    외부 for 문이 1번 루프 시 내부 for문은 전체 루프를 진행함
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.println("i : " + i + ", j : " + j);
      }
    }

    System.out.println("\n ----- 일반 while 문 -----");

    int count = 0;

    while (count < 5) {
      System.out.println(count);
      count++;
    }

    System.out.println("\n ----- 중첩 while 문 -----");

//    중첩 while 문 : 중첩 for문과 같이 while 문 안에 또 while 문이 존재하는 while 문
//    중첩 while 문 사용 시 초기화 변수를 while 문 밖에 선언하고 사용하기 때문에 내부 while문이 종료되고 나서도 그 값이 계속 유지됨
//    내부 while 문에서 사용한 초기화 변수를 다시 초기값으로 변경해야 함

    int c1 = 0; // 외부 while 문용 초기화 변수
    int c2 = 0; // 내부 while 문용 초기화 변수

    while (c1 < 5) {
      while (c2 < 5) {
        System.out.println("c1 : " + c1 + ", c2 : " + c2);
        c2++; // 내부 while 문용 증감식
      }
      System.out.println("-------------");
      c2 = 0; // 내부 while 문용 초기화 변수값 리셋
      c1++; // 외부 while문용 증감식
    }

    System.out.println("\n ----- 중첩 while문 조금 더 쉽게 -----");
    int c3 = 0; // 외부 while 문용 초기화 변수

//    코드 블록 안에 선언한 변수는 코드 블록이 종료되면 메모리에서 삭제
    while (c3 < 5) {
//      외부 while문의 루프를 한번 실행 후 안에서 사용하던 변수를 모두 삭제
//      내부 while문용 초기화 변수를 외부 while 문 안에 선언하면 외부 while문 루프 실행 시 마다 새로 선언됨
      int c4 = 0; // 내부 while 문용 초기화 변수

      while (c4 < 5) {
        System.out.println("c3 : " + c3 + ", c4 : " + c4);
        c4++; // 내부 while 문용 증감식
      }

      System.out.println("-------------");
      c3++; // 외부 while문용 증감식
    }
  }
}












