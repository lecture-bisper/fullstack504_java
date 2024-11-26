import java.util.Scanner;

public class Quiz1 {

  public static void main(String[] args) {
    //  문제1) 사용자에게서 국어, 영어, 수학 점수를 각각 입력받고, 평균 점수 및 총점, 등급을 출력하는 프로그램을 작성하세요
//  $ 중첩 if 문이나 else if 문으로 작성
//  $ 등급은 95 이상 A+, 90 이상 A, 85 이상 B+, 80 이상 B, 70 이상 C, 60 이상 D, 60 미만 F 로 처리
//  출력 예시 >  당신의 총점은 xxx 점이고, 평균은 xx.x 점이고, 등급은 x 입니다.

//    사용자 키보드 입력을 받기 위한 객체 생성
    Scanner sc = new Scanner(System.in);

//    국어, 영어, 수학, 총점, 평균 점수를 저장하기 위한 변수 선언
    int kor = 0;
    int eng = 0;
    int math = 0;
    int total = 0;
    int avg = 0;
    String grade = "F";

    System.out.print("국어 점수를 입력해 주세요 >> ");
    kor = sc.nextInt();

    System.out.print("영어 점수를 입력해 주세요 >> ");
    eng = sc.nextInt();

    System.out.print("수학 점수를 입력해 주세요 >> ");
    math = sc.nextInt();

    total = kor + eng + math;
    avg = total / 3;

    if (avg >= 95) {
      grade = "A+";
    }
    else if (avg >= 90) {
      grade = "A";
    }
    else if (avg >= 85) {
      grade = "B+";
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

    System.out.println("당신의 총점은 " + total + "점이고, 평균은 " + avg + "점이고, 등급은 " + grade + "입니다.");
    
    
//    중첩 if ~ else 문 만 사용 시
    if (avg >= 90) {
      if (avg >= 95) {
        grade = "A+";
      }
      else {
        grade = "A";
      }
    }
    else {
      if (avg >= 80) {
        if (avg >= 85) {
          grade = "B+";
        }
        else {
          grade = "B";
        }
      }
      else {
        if (avg >= 70) {
          grade = "C";
        }
        else {
          if (avg >= 60) {
            grade = "D";
          }
          else {
            grade = "F";
          }
        }
      }
    }
    
//    else if 문과 중첩 if 문을 함께 사용 시
    if (avg >= 90) {
      if (avg >= 95) {
        grade = "A+";
      }
      else {
        grade = "A";
      }
    }
    else if (avg >= 80) {
      if (avg >= 85) {
        grade = "B+";
      }
      else {
        grade = "B";
      }
    }
    else if (avg >= 70) {
      
    }
    else if (avg >= 60) {
      
    }
    else {
      
    }
  }
}












