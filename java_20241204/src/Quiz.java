import java.util.Scanner;

public class Quiz {

  Scanner sc;

  Quiz() {
    sc = new Scanner(System.in);
  }

  int inputGugudan() {
    System.out.print("출력할 구구단의 단수를 입력해주세요 >> ");
    int dan = sc.nextInt();
    return dan;
  }

  void outputGugudan(int dan) {
    System.out.println("----- " + dan + "단 -----");
    for (int i = 1; i < 10; i++) {
      System.out.println(dan + " * " + i + " = " + dan * i);
    }
  }

  int inputScore() {
    System.out.print("국어 점수를 입력하세요 >> ");
    int kor = sc.nextInt();
    System.out.print("영어 점수를 입력하세요 >> ");
    int eng = sc.nextInt();
    System.out.print("수학 점수를 입력하세요 >> ");
    int math = sc.nextInt();

    int total = totalScore(kor, eng, math);
    return total;
  }

  int inputScore(String title) {
    System.out.print(title + "의 점수를 입력하세요 >> ");
    int score = sc.nextInt();
    return score;
  }

  int totalScore(int kor, int eng, int math) {
    int total = kor + eng + math; // 총점 계산
    return total;
//    return kor + eng + math;
  }

  double avgScore(int total) {
//    double avg = total / 3; // 평균 계산
//    return avg;
    return (double)total / 3;
  }

  String gradeScore(double avg) {
    String grade = "F";

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

    return grade;
  }

  void outputResult(int total, double avg, String grade) {
    System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + grade + "입니다.");
  }
}












