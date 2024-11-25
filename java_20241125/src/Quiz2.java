import java.util.Scanner;

public class Quiz2 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

//    입력받은 데이터 저장용 변수
    int input = 0;

    System.out.print("몇 층인지 입력하세요 >> ");
//    키보드로 입력된 정수 받아오기
    input = sc.nextInt();

    System.out.println((input * 5) + "m 입니다.");
  }
}












