package quiz06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
//    데이터를 저장하기 위한 ArrayList 생성
    List<String> scores = new ArrayList<String>();

    System.out.print("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F) >> ");

    for (int i = 0; i < 5; i++) {
      scores.add(sc.next());
    }

//    마지막에 화면에 출력할 문자열을 저장할 변수
    String score = "";

//    반복문으로 ArrayList에 저장된 내용을 순서대로 하나씩 출력
    for (int i = 0; i < scores.size(); i++) {
      switch (scores.get(i)) {
        case "A":
          score += "4.0 ";
          break;

        case "B":
          score += "3.0 ";
          break;

        case "C":
          score += "2.0 ";
          break;

        case "D":
          score += "1.0 ";
          break;

        case "F":
          score += "0.0 ";
          break;
      }
    }

    System.out.println(score);
  }
}












