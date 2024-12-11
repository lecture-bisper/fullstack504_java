// Tire 클래스를 상속받은 HankookTire 클래스
public class HankookTire extends Tire {

//  자식 클래스인 HankookTire 클래스의 생성자
  public HankookTire(String location, int maxRotation) {
//    부모 클래스의 생성자 호출
    super(location, maxRotation);
  }

//  상속받은 메소드를 오버라이딩 함
  @Override
  public boolean roll() {
    ++accRotation; // 누적회전수 가져오기

//    현재 회전수와 최대 회전수를 비교
    if (accRotation < maxRotation) {
      System.out.println(location + " HankookTire 수명 : " + (maxRotation - accRotation) + "회");
      return true;
    }
    else {
      System.out.println("***** " + location + " HankookTire 펑크 *****");
      return false;
    }
  }
}












