public class IFNestedEx {

  public static void main(String[] args) {

//    Math.random() : 자바에서 제공하는 임의의 숫자를 출력하는 명령어
//    0.0 ~ 0.9 까지의 임의의 숫자를 출력
//    (Math.random() * 정수) + 1 을 하게 되면 최소 1 ~ 지정한 정수까지 임의의 숫자를 출력
    int score = (int)(Math.random() * 20) + 81;
    System.out.println("점수 : " + score);

    String grade = "";

//    if문 안에 if문을 중첩해서 사용
    if (score >= 90) {
      if (score >= 95) {
        grade = "A+";
      }
      else {
        grade = "A";
      }
    }
    else {
      if (score >= 85) {
        grade = "B+";
      }
      else {
        grade = "B";
      }
    }

    System.out.println("학점 : " + grade);
  }


//  문제1) 사용자에게서 국어, 영어, 수학 점수를 각각 입력받고, 평균 점수 및 총점, 등급을 출력하는 프로그램을 작성하세요
//  $ 중첩 if 문이나 else if 문으로 작성
//  $ 등급은 95 이상 A+, 90 이상 A, 85 이상 B+, 80 이상 B, 70 이상 C, 60 이상 D, 60 미만 F 로 처리
//  출력 예시 >  당신의 총점은 xxx 점이고, 평균은 xx.x 점이고, 등급은 x 입니다.

//  문제2) 책 87 페이지 4 번 문제
//  문제3) 책 88 페이지 6 번 문제
//  문제4) 책 89 페이지 9 번 문제
}












