package quiz02;

import java.util.Scanner;

public abstract class Calculator {

//  protected 접근제한자를 사용한 필드, 패키지가 다르더라도 상속 관계에 있을 경우 사용 가능
  protected  int a;
  protected  int b;

  abstract protected int calc(); // 추상메소드

  protected  void input() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수 2개를 입력하세요 >> ");
    a = scanner.nextInt();
    b = scanner.nextInt();
  }

  public void run() {
    input();
    int res = calc();
    System.out.println("계산된 값은 " + res);
  }
}












