package quiz08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz08 {

  public static void main(String[] args) {

//    사용자 키보드 입력용
    Scanner sc = new Scanner(System.in);
//    나라 이름과 인구 수를 저장하기 위한 HashMap
    Map<String, Integer> nations = new HashMap<>();
    
    int num1 = 0; // 가장 많은 인구수를 저장하는 변수
    String name = ""; // 가장 많은 인구수의 나라 이름을 저장하는 변수

//    안내 멘트 출력
    System.out.println("나라 이름과 인구를 5개 입력하세요.(예: Korea 5000)");

//    반복문으로 사용자 입력 받기
    for (int i = 1; i <= 5; i++) {
      System.out.print("나라 이름, 인구 >> ");
      String nationName = sc.next();
      int people = sc.nextInt();
//      HashMap 에 데이터 저장
      nations.put(nationName, people);
    }

//    반복문을 사용하여 입력된 키를 모두 출력
    for (String key : nations.keySet()) {
//      꺼내온 키를 기준으로 인구수 출력
      int people = nations.get(key);

//      가장 많은 인구 수를 저장한 변수와 현재 인구 수를 비교
      if (num1 < people) {
//        기존 인구수가 현재 인구수보다 적을 경우 저장
        num1 = people;
//        현재 인구수와 연동되는 key 도 함께 저장
        name = key;
      }
    }

    System.out.println("제일 인구가 많은 나라는 (" + name + ", " + num1 + ")");
  }
}












