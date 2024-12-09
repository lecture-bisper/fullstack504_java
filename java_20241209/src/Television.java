public class Television {

//  정적 멤버는 클래스가 메모리에 로딩될 때 함께 로딩되어야 하기 때문에 적정 필드는 선언과 동시에 데이터를 저장함
//  정적 초기화 블럭을 사용하여 정적 필드를 초기화 할 수 있음

  //  정적 필드를 선언과 동시에 데이터 저장
  static String company = "Samsung";
  static String model = "OLED";
  //  정적 필드를 선언만 함
  static String info;

  static String brand;

  //  정적 초기화 블럭 선언
  static {
//    정적 필드를 초기화
    info = company + " - " + model;
  }

//  정적 초기화 블럭이 여러개 있을 경우 위에서 아래로 순서대로 실행
  static {
    brand = "파브";
    info = company + brand + " - " + model;
  }
}












