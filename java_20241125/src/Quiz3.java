import java.util.Scanner;

public class Quiz3 {

  public static void main(String[] args) {

//     키보드 입력받기 위한 객체
    Scanner sc = new Scanner(System.in);

//    입력받은 데이터를 저장할 변순
    int input = 0;

    System.out.print("x 값을 입력하세요 >> ");
//    키보드로 정수 입력 받기
    input = sc.nextInt();

//    y 값을 얻기 위한 연산식, 기본 자바 연산자에 제곱연산자가 없음, 제곱 연산을 위해서 입력받은 값 * 입력받음 값으로 처리
    int y = input * input - 3 * input + 7;

    System.out.println("x = " + input + ", y = " + y);

  }
}












