package quiz07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz07 {

  public static void main(String[] args) {

//    키보드 입력용
    Scanner sc = new Scanner(System.in);
//    화면에 내용 출력
    System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼가 있습니다.");
//    HashMap 을 사용한 데이터 저장 부분
    Map<String, Integer> menu = new HashMap<>();
    menu.put("에스프레소", 2000);
    menu.put("아메리카노", 2500);
    menu.put("카푸치노", 3000);
    menu.put("카페라떼", 3500);

//    사용자 입력과 내용을 무한 반복
    while (true) {

//      사용자 입력 요청
      System.out.print("주문 >> ");
//      사용자 입력 받기
      String order = sc.next();
//      화면 출력용 변수
      String print = "";

      if (order.equals("에스프레소") || order.equals("아메리카노") || "카푸치노".equals(order) || "카페라떼".equals(order)) {
//        HashMap에 저장된 내용을 key 를 기준으로 가져옴
        print += order + "는 " + menu.get(order) + "입니다.";
        System.out.println(print);
      }
      else if (order.equals("그만")) {
        break;
      }
      else {
        System.out.println("잘못된 주문입니다.");
      }
    }
  }
}












