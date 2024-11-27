public class NullEx {

  public static void main(String[] args) {

    int num = 10;
    String str = "참조타입데이터";

    System.out.println("기본 타입 변수 num의 값 : " + num);
    System.out.println("참조 타입 변수 str의 값 : " + str);

//    기본 타입의 변수에는 null을 저장할 수 없음
//    num = null;
//    참조 타입의 변수에는 null을 저장할 수 있음
    str = null;

    System.out.println("참조 타입 변수 str의 값 : " + str);
    System.out.println(str);
//    참조 타입 변수인 str은 데이터가 저장된 메모리 주소를 가지고 있지 않은 null 인 상태이기 때문에 참조 타입의 기능을 사용할 수 없음
    System.out.println("참조 타입 변수 str의 기능 사용 : " + str.length());
  }
}












