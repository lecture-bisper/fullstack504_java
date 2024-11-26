import java.util.Scanner;

public class Quiz3 {

  public static void main(String[] args) {
    //  문제3) 책 88 페이지 6 번 문제

//    사용자 키보드 입력
    Scanner sc = new Scanner(System.in);

//    사용자가 입력하는 금액을 저장할 변수
    int money = 0;

    System.out.print("돈의 액수를 입력하세요 >> ");
    money = sc.nextInt();

    int money50000 = money / 50000;
    money = money % 50000;
    int money10000 = money / 10000;
    money = money % 10000;
    int money1000 = money / 1000;
    money = money % 1000;
    int money500 = money / 500;
    money = money % 500;
    int money100 = money / 100;
    money = money % 100;
    int money10 = money / 10;
    money = money % 10;

    System.out.println("오만원" + money50000 + "개, 만원" + money10000 + "개, 천원" + money1000 + "개, 500원" + money500 + "개, 100원" + money100 + "개, 10원" + money10 + "개, 1원" + money + "개");

//    사람이 알아보기 쉽도록 += 를 사용하여 문자열을 만듬
    String result = "오만원" + money50000 + "개, ";
    result = result + "만원" + money10000 + "개, ";
    result = result + "천원" + money1000 + "개, ";
    result += "500원" + money500 + "개, ";
    result += "100원" + money100 + "개, ";
    result += "10원" + money10 + "개, ";
    result += "1원" + money + "개";

    System.out.println(result);
  }
}












