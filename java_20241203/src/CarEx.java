public class CarEx {

  public static void main(String[] args) {

//    Car 클래스 타입의 변수 myCar 선언
//    new 키워드와 생성자를 사용하여 메모리에 인스턴스(객체) 생성
//    생성된 인스턴스(객체)의 주소를 Car 클래스 타입의 변수 myCar에 저장
    Car myCar = new Car();

//    인스턴스 myCar의 필드(멤버 변수)를 호출하여 사용
    System.out.println("제작회사 : " + myCar.company);
    System.out.println("모델명 : " + myCar.model);
    System.out.println("색상 : " + myCar.color);
    System.out.println("최고속도 : " + myCar.maxSpeed);
    System.out.println("현재속도 : " + myCar.speed);

    myCar.speed = 60;
    System.out.println("수정된 속도 : " + myCar.speed);

    System.out.println("가격 : " + myCar.price);
    System.out.println("배기량 : " + myCar.displacement);
    System.out.println("전기차 유무 : " + myCar.ev);

  }
}












