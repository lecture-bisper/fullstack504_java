import java.util.Scanner;

public class Quiz1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("----- 문제 1 -----");
//    교재 126페이지 2번 문제
    int numArr[] = new int[10];

    System.out.println("정수 10개 입력하세요 ");
    for (int i = 0; i < numArr.length; i++) {
      System.out.print("정수 " + (i + 1) + " 입력 >> ");
      numArr[i] = sc.nextInt();
    }

    for (int i = 0; i < numArr.length; i++) {
      if (numArr[i] % 3 == 0) {
        System.out.println(numArr[i]);
      }
    }


    System.out.println("\n----- 문제 2 -----");
//    교재 126페이지 4번 문제
//    char 타입 배열 생성, (일월화수목금토)
//    키보드로 숫자 입력받기, 7로 나머지 연산, 나머지가 index
//    음수 입력 시 프로그램 종료, while로 무한반복, if문으로 0보다 작은지 확인
    char day[] = new char[] {'일', '월', '화', '수', '목', '금', '토'};

    while (true) {
      System.out.print("정수를 입력하세요 >> ");
      int inputNum = sc.nextInt();

      if (inputNum >= 0) {
        int index = inputNum % 7;
        System.out.println(day[index]);
      }
      else {
        System.out.println("프로그램을 종료합니다...");
        break;
      }
    }


    System.out.println("\n----- 문제 3 -----");
//    교재 126페이지 5번 문제
//    int 타입 배열, 크기 10, 데이터 입력 받기
//    2중 for 문을 사용하여 현재 index와 다음 index의 크기 비교


    System.out.println("\n----- 문제 4 -----");
//    교재 126페이지 6번 문제
//    영문 한글 배열 2개 생성,
//    while문으로 무한 반복, if ~ else 문으로 exit 가 들어왔는지 확인
//    if문으로 입력된 문자열 값과 영문 배열 비교, index 찾고 한글 배열에 해당 index를 사용하는 위치값 출력
    String eng[] = {"student", "love", "java", "happy", "future"};
    String kor[] = {"학생", "사랑", "자바", "행복한", "미래"};

    while (true) {
      System.out.print("영어 단어를 입력하세요 >> ");
      String str = sc.nextLine();

      if (str.equals("exit")) {
        System.out.println("종료합니다...");
        break;
      }
      else {
        int i = 0;
        for (i = 0; i < eng.length; i++) {
          if (str.equals(eng[i])) {
            System.out.println(kor[i]);
            break;
          }
        }

        if (eng.length == i) {
          System.out.println("그런 영어 단어가 없습니다.");
        }
      }
    }

    System.out.println("\n----- 문제5 -----");
//    아래와 같이 정수 배열에서 가장 큰 값을 찾아서 출력하세요
    int numbers[] = {5, 12, 8, 20, 7};

    int big = 0; // 비교 후 더 큰수를 저장하기 위한 변수

//    배열의 처음부터 마지막 index 까지 결과를 출력하기 위한 반복문
    for (int i = 0; i < numbers.length; i++) {
//      i + 1 인 index가 배열의 마지막 index 를 넘지 못하도록 하는 제어문
//      배열.length -1 은 해당 배열의 마지막 index 가 됨
//      i가 마지막 index 까지 못가고, i + 1 이 마지막 index가 될 수 있도록 함
      if (i < numbers.length - 1) {
//        i index 인 값과 i + 1 index 인 값을 비교하여 i 의 값이 더 클 경우 변수에 저장
        if (numbers[i] > numbers[i + 1]) {
          big = numbers[i];
        }
      }
    }

    System.out.println("배열 안에서 가장 큰 수 : " + big);


    System.out.println("\n----- 문제 6 -----");
//    키보드 입력을 통해 1 ~ 9까지의 숫자를 입력받고, 주어진 배열에 입력받은 숫자가 총 몇개가 존재하는지 출력하세요
    int numberArr[] = {3, 7, 5, 1, 8, 4, 9, 2, 6, 5, 7, 1, 3, 8, 9, 2, 4, 6, 5, 7};
    int count = 0;

    System.out.print("1 ~ 9까지의 정수를 입력하세요 >> ");
    int num = sc.nextInt();

    for (int i = 0; i < numberArr.length; i++) {
      if (num == numberArr[i]) {
        count++;
      }
    }

    System.out.println("배열 안에서 사용자가 입력한 숫자와 일치하는 숫자의 개수는 " + count + "개 입니다.");

  }
}












