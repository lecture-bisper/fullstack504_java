import java.util.Scanner;

public class Quiz6 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

//    문제 6) for 문을 사용하여 사용자가 입력한 단수의 구구단을 출력하는 프로그램을 작성하세요
//    출력 형식 (5단) :
//    5 * 1 = 5
//    5 * 2 = 10
//    5 * 3 = 15
//    5 * 4 = 20

    System.out.print("출력할 구구단의 단수를 입력하세요 >> ");
    int dan = sc.nextInt();

    System.out.println("----- 문제6 (" + dan + "단) -----");

    for (int i = 1; i < 10; i++) {
      System.out.println(dan + " * " + i + " = " + dan * i);
    }

//    문제 7) while 문을 사용하여 사용자가 입력한 단수의 구구단을 출력하는 프로그램을 작성하세요

    System.out.print("출력할 구구단의 단수를 입력해주세요 >> ");
    dan = sc.nextInt();

    int count = 1;

    System.out.println("----- 문제 7 (" + dan + "단) -----");

    while (count < 10) {
      System.out.println(dan + " * " + count + " = " + dan * count);
      count++;
    }

//    문제 8) 1 부터 50까지의 숫자 중 홀수만 화면에 출력하는 프로그램을 반복문을 사용하여 작성하세요
//    반복문 안에 제어문 사용

    System.out.println("----- 문제 8 -----");

    for (int i = 1; i <= 50; i++) {
      if (!(i % 2 == 0)) {
        System.out.print("홀수 : " + i + "    ");
      }
    }
  }
}













