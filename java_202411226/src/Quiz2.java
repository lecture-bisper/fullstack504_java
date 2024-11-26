import java.util.Scanner;

public class Quiz2 {

  public static void main(String[] args) {
    //  문제2) 책 87 페이지 4 번 문제
//    키보드 입력용
    Scanner sc = new Scanner(System.in);

//    입력된 데이터 저장용 변수
    int x = 0;
    int y = 0;

    System.out.print("점 (x, y)의 좌표를 입력하세요 >> ");
    x = sc.nextInt();
    y = sc.nextInt();

//    사용자가 입력한 x, y가 지정된 사각형 안에 있는지 아닌지의 결과를 저장하는 변수
    boolean resultX = false;
    boolean resultY = false;
    String result = "";

//    x 가 50 보다 크거나 같고, 100보다 작거나 같은지 확인
    if (x >= 50) {
      if (x <= 100) {
        resultX = true;
      }
      else {
        resultX = false;
      }
    }
    else {
      resultX = false;
    }

//    y 가 50 보다 크거나 같고, 100보다 작거나 같은지 확인
    if (y >= 50) {
      if (y <= 100) {
        resultY = true;
      }
    }

    if (resultX && resultY) {
      result = "내에";
    }
    else {
      result = "밖에";
    }

    System.out.println("점 (" + x +", " + y + ")은 (50, 50)과 (100, 100)의 사각형 " + result + " 있습니다.");
  }
}












