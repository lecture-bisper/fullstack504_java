// Car 클래스를 상속받아 사용하는 SportsCar 클래스
public class SportsCar extends Car {

//  Car 클래스에서 상속받은 필드 speed 가 존재

//  상속받은 메소드를 오버라이딩한 메소드
  @Override
  public void speedUp() {
    speed += 10;
  }

//  상속받은 메소드가 final 키워드로 인하여 오버라이딩이 불가능하기 때문에 상속받은 그대로 사용해야 함
//  @Override
//  public void stop() {
//    System.out.println("스포츠카를 멈춤");
//    speed = 0;
//  }
}












