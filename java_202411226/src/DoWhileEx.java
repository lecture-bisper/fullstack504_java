import java.util.Scanner;

public class DoWhileEx {

  public static void main(String[] args) {

    System.out.println("메시지를 입력하세요");
    System.out.println("프로그램을 종료하려면 q를 누르세요");

//    사용자 키보드 입력을 위해 사용
    Scanner sc = new Scanner(System.in);
//    사용자 키보드 입력값을 저장하기 위한 변수
    String input;

//    do ~ while : while 문과 기본적으로 동일한 반복문이지만 무조건 1번은 실행하는 반복문
    do {
      System.out.print(" > ");
      input = sc.nextLine();
      System.out.println("입력한 메시지 : " + input);
//      사용자가 입력한 문자가 "q" 와 같은지 확인
    } while (!input.equals("q"));

    System.out.println();
    System.out.println("프로그램 종료");


    System.out.println("\n ----- 일반 while문 사용 시 -----\n");

    input = sc.nextLine();

    while (!input.equals("q")) {
      System.out.print(" > ");
      input = sc.nextLine();
      System.out.println("입력한 메시지 : " + input);
//      사용자가 입력한 문자가 "q" 와 같은지 확인
    }

    System.out.println();
    System.out.println("프로그램 종료");
  }
}












