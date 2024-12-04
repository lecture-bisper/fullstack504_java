import java.util.Scanner;

public class QuizEx {

  public static void main(String[] args) {


//    문제 2) 사용자 입력을 통해서 지정한 구구단을 출력하는 프로그램을 작성하세요.
//    # 구구단 출력 부분과 사용자 데이터 입력 부분을 서로 다른 메소드로 만들어서 실행

//    Scanner sc = new Scanner(System.in);
    
////    입력 부분
//    System.out.print("출력할 구구단의 단수를 입력해주세요 >> ");
//    int dan = sc.nextInt();
//
////    출력 부분
//    System.out.println("----- " + dan + "단 -----");
//    for (int i = 1; i < 10; i++) {
//      System.out.println(dan + " * " + i + " = " + dan * i);
//    }

    System.out.println("----- 문제 2 -----");
    Quiz quiz2 = new Quiz();
    int dan = quiz2.inputGugudan();
    quiz2.outputGugudan(dan);

//    문제 3) 사용자 입력을 통해서 국어, 영어, 수학 3과목의 점수를 각각 입력받고, 총점과 평균, 등급을 출력하는 프로그램을 작성하세요
//    # 데이터 입력 메소드, 총점 계산 메소드, 평균 계산 메소드, 등급 계산 메소드, 결과 출력 메소드로 각각 분리하여 작성하세요

    System.out.println("\n----- 문제 3 -----");

//    입력 부분
//    Scanner sc = new Scanner(System.in);
//
//    System.out.print("국어 점수를 입력하세요 >> ");
//    int kor = sc.nextInt();
//    System.out.print("영어 점수를 입력하세요 >> ");
//    int eng = sc.nextInt();
//    System.out.print("수학 점수를 입력하세요 >> ");
//    int math = sc.nextInt();
//
//    int total = kor + eng + math; // 총점 계산
//    double avg = total / 3; // 평균 계산

//    등급 계산
//    String grade = "F";
//
//    if (avg >= 90) {
//      grade = "A";
//    }
//    else if (avg >= 80) {
//      grade = "B";
//    }
//    else if (avg >= 70) {
//      grade = "C";
//    }
//    else if (avg >= 60) {
//      grade = "D";
//    }

//    결과 출력
//    System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이며, 등급은 " + grade + "입니다.");

    Quiz quiz3 = new Quiz();

//    int total = quiz3.inputScore();
//    double avg = quiz3.avgScore(total);
//    String grade = quiz3.gradeScore(avg);
//    quiz3.outputResult(total, avg, grade);

    String titles[] = {"국어", "영어", "수학"};
    int scores[] = new int[3];

    for (int i = 0; i < titles.length; i++) {
      scores[i] = quiz3.inputScore(titles[i]);
    }

    int total = 0;
    for (int i = 0; i < scores.length; i++) {
      total = total + scores[i];
    }

    double avg = quiz3.avgScore(total);
    String grade = quiz3.gradeScore(avg);
    quiz3.outputResult(total, avg, grade);

  }
}












