
// 부모 클래스로 사용하는 Tire 클래스, 집합 관계로 사용되는 클래스
public class Tire {
  
  public int maxRotation; // 최대 회전수
  public int accRotation; // 누적 회전수
  public String location; // 타이어 위치

//  매개변수가 2개 있는 생성자, 필드의 초기화 작업
  public Tire(String location, int maxRotation) {
    this.location = location;
    this.maxRotation = maxRotation;
  }

//  메소드
  public boolean roll() {
    ++accRotation; // 누적 회전수 1 상승

//    타이어 펑크 여부 확인, 누적 회전수가 최대 회전수보다 작으면 true
    if (accRotation < maxRotation) {
      System.out.println(location + " Tire 수명 : " + (maxRotation - accRotation) + "회");
      return true;
    }
    else {
      System.out.println("***** " + location + " Tire 펑크 *****");
      return false;
    }
  }
}












