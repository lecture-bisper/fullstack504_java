
// 추상 클래스이며, 부모 클래스인 Phone 클래스를 상속받은 SmartPhone 클래스
public class SmartPhone extends Phone {

//  추상 클래스인 Phone 클래스에서 상속받은 필드인 owner이 존재

  public SmartPhone(String owner) {
//    부모 클래스인 Phone 클래스의 생성자 호출
    super(owner);
  }

//  추상 클래스인 Phone 클래스에서 상속받은 메소드가 존재
  
//  자식 클래스 전용 메소드
  public void internetSearch() {
    System.out.println("인터넷 검색을 합니다.");
  }
}












