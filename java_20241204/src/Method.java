import java.util.Scanner;

public class Method {
  static Scanner sc = new Scanner(System.in);

  static void scoreCalculator() {

    int kor = 0;
    int eng = 0;
    int math = 0;
    int total = 0;
    int avg = 0;
    String grade = "F";

    System.out.print("당신의 국어 점수를 입력하세요 >> ");
    kor = sc.nextInt();
    System.out.print("당신의 영어 점수를 입력하세요 >> ");
    eng = sc.nextInt();
    System.out.print("당신의 수학 점수를 입력하세요 >> ");
    math = sc.nextInt();

    total = kor + eng + math;
    avg = total / 3;

    if (avg >= 90) {
      grade = "A";
    }
    else if (avg >= 80) {
      grade = "B";
    }
    else if (avg >= 70) {
      grade = "C";
    }
    else if (avg >= 60) {
      grade = "D";
    }
    else {
      grade = "F";
    }

    System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + grade + "입니다.");
  }

  static void gugudan() {
    System.out.print("출력할 구구단의 단수를 입력해주세요 >> ");
    int dan = sc.nextInt();

    System.out.println("\n----- " + dan + "단 출력 -----");
    for (int i = 1; i < 10; i++) {
      System.out.println(dan + " * " + i + " = " + dan * i);
    }
  }

  public static void main(String[] args) {

//    총점과 등급 계산
    scoreCalculator();

//    구구단 출력
    gugudan();
  }
}












