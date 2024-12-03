public class Car2Ex {

  public static void main(String[] args) {

//    Car2 클래스 타입의 변수 myCar 선언
//    new 키워드와 Car2() 생성자를 사용하여 메모리에 객체 생성
//    생성된 객체의 주소를 변수 myCar2 에 저장
    Car2 car2 = new Car2();

    Car3 car3 = new Car3("검정", 3000);
//    클래스 Car3에는 기본 생성자인 Car3() 이 없기 때문에 new 키워드가 기본 생성자를 호출할 수 없음
    Car3 car31 = new Car3();
  }
}












