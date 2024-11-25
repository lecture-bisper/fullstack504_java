import java.util.Scanner;

public class IfEx {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("당신의 점수를 입력해주세요 >> ");
    int score = sc.nextInt();

//    단순 if 문 : 프로그램의 정상적인 흐름에서 조건식의 결과가 true 일 경우 추가적으로 더 실행하는 방식
    if (score >= 90) {
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A 입니다.");
    }

    if (score < 90) {
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B 입니다.");
    }


    System.out.print("당신의 소지금액을 알려주세요 >> ");
    int money = sc.nextInt();

    System.out.println("점심 먹으러 중화요리점에 갑니다.");
    System.out.println("자장면을 주문합니다.");

    if (money > 12000) {
      System.out.println("군만두를 추가로 주문합니다.");
    }

    System.out.println("음식을 맛있게 먹습니다.");


  }
}












