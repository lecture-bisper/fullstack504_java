package quiz03;

public class CircleManager { // static 메소드만 가짐

// src를 dest에 복사
//  정적 멤버, 매개변수로 Circle 클래스 타입의 객체를 2개 사용
  public static void copy(Circle src, Circle dest) {
//    원본의 반지름 값을 받아서 사본의 반지름으로 저장
    dest.setRadius(src.getRadius()); // src의 반지름을 dest에 복사
  }

// a와 b의 반지름이 같으면 true 리턴
//  정적 멤버, 매개변수로 Circle 클래스 타입의 객체 2개를 사용
  public static boolean equals(Circle a, Circle b) {
    if (a.getRadius() == b.getRadius()) {
      return true;
    }
    else {
      return false;
    }
  }
}












