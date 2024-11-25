import java.util.Scanner;

public class Quiz1 {

  public static void main(String[] args) {

//    키보드 입력을 받기 위한 스케너 객체 생성
    Scanner sc = new Scanner(System.in);

//    키보드로 정수를 입력받을 변수 선언
    int a = 0;
    int b = 0;

    System.out.println("두 정수를 입력하세요 >> ");
//    키보드로 정수 입력 받기, 숫자가 아닐 경우 오류 발생
    a = sc.nextInt();
    b = sc.nextInt();

//    출력, a + b 부분을 괄호로 감싸서 먼저 연산되도록 함
    System.out.println(a + " + " + b + "은 " + (a + b));
  }
}












