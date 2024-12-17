public class NullPointerExceptionEx {

  public static void main(String[] args) {

    String data = null;
//    String 타입의 변수 data가 참조하고 있는 주소가 null 인 상태인데 해당 클래스에서 지원하는 메소드를 실행하려고 하여 오류 발생
    System.out.println(data.toUpperCase());
  }
}












