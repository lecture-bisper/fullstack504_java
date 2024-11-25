import java.util.Scanner;

public class IfElseEx {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("당신의 점수를 입력하세요 >> ");
    int score = sc.nextInt();

    if (score >= 90) {
      System.out.println("점수가 90보다 큽니다.");
      System.out.println("등급은 A 입니다.");
    } else {
      System.out.println("점수가 90보다 작습니다.");
      System.out.println("등급은 B 입니다.");
    }

    System.out.println("\n");

    System.out.print("현재 소지 금액을 입력하세요 >> ");
    int money = sc.nextInt();

    System.out.println("점심을 먹으러 중화요리점에 갑니다.");

    if (money >= 12000) {
      System.out.println("자장면과 군만두를 주문합니다.");
    }
    else {
      System.out.println("자장면만 주문합니다.");
    }
    System.out.println("주문한 음식을 맛있게 먹습니다.");

  }
}












