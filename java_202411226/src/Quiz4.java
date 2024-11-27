import java.util.Scanner;

public class Quiz4 {

  public static void main(String[] args) {
    //  문제4) 책 89 페이지 9 번 문제

//    1. 사용자 입력
    Scanner sc = new Scanner(System.in);

    System.out.print("1 ~ 99 사이의 정수를 입력하세요 >> ");
    int num = sc.nextInt();

    // 10의 자리 숫자를 저장할 변수
    int first = num / 10;
    // 1의 자리 숫자를 저장할 변수
    int second = num % 10;

//    입력 받은 숫자가 0일 경우 3의 배수를 확인하기 위한 숫자 % 3 == 0 연산 시 무조건 0 이 나오게 되므로 3의 배수가 아닌 값으로 변경
    if (first == 0) {
      first = 1;
    }

    if (second == 0) {
      second = 1;
    }

//    입력 받은 숫자가 3의 배수인지 아닌지를 저장하는 변수
    boolean resultFirst = false;
    boolean resultSecond = false;

//    2. 1 ~ 99까지의 정수 확인
//    중첩 if 문의 조건을 한번에 입력하기
//    if (num > 0 && num < 100) {
//
//    }

    if (num > 0) {
      if (num < 100) {
//    3. 3, 6, 9 중 하나라도 있으면 박수짝 출력
//        3의 배수인지 % 연산자로 확인
        if (first % 3 == 0) {
          resultFirst = true;
        }

        if (second % 3 == 0) {
          resultSecond = true;
        }

//        or 연산을 통해서 10의 자리와 1의 자리에 3의 배수가 1 개 라도 존재하는지 확인
        if (resultFirst || resultSecond) {
//          and 연산을 통해서 10의 자리와 1의 자리에 모두 3의 배수가 있는지 확인
          if (resultFirst && resultSecond) {
            System.out.println("박수 짝짝");
          }
          else {
            System.out.println("박수 짝");
          }
        }
        else {
          System.out.println("박수 없음");
        }
      }
      else {
        System.out.println("1 ~ 99 사이의 정수로 입력해 주세요");
      }
    }
    else {
      System.out.println("1 ~ 99 사이의 정수로 입력해 주세요");
    }
  }
}












