package quiz03;

public class StaticTest {

  public static void main(String[] args) {

//    Circle 클래스 타입의 객체 생성, 생성자에 매개변수 1개를 입력하여 객체 생성
    Circle pizza = new Circle(20);
    Circle waffle = new Circle(10);

//    pizza와 waffle 비교
    boolean res = CircleManager.equals(pizza, waffle);

    if (res == true) {
      System.out.println("pizza와 waffle 크기 같음");
    }
    else {
      System.out.println("pizza와 waffle 크기 다름");
    }

//    pizza를 waffle에 복사
    CircleManager.copy(pizza, waffle);

//    pizza와 waffle 비교
    res = CircleManager.equals(pizza, waffle);

    if (res == true) {
      System.out.println("pizza와 waffle 크기 같음");
    }
    else {
      System.out.println("pizza와 waffle 크기 다름");
    }
  }
}

// 출력내용
// pizza와 waffle 크기 다름
// pizza와 waffle 크기 같음








