public class PromotionEx {
  public static void main(String[] args) {

    byte byteValue = 10; // byte 타입의 변수에 정수 10 저장
//    자동 타입 변환 발생
    int intValue = byteValue; // int 타입의 변수에 byte 타입의 변수 저장
    System.out.println(intValue);

    char charValue = '가'; // char 타입의 변수에 문자 '가' 저장
//    자동 타입 변환 발생
//    변수는 한번 선언 시 계속 재활용 가능
//    변수는 같은 범위 안에서 같은 이름으로 재선언 불가
    intValue = charValue; // int 타입의 변수에 char 타입의 변수 저장
    System.out.println("가의 유니코드 값 : " + intValue);

    intValue = 500; // int 타입의 변수에 정수 500 저장
//    long 타입의 변수에 int 타입의 변수 저장
    long longValue = intValue;
    System.out.println(longValue);

    intValue = 200;
//    double 타입의 변수에 int 타입의 정수 저장
    double doubleValue = intValue;
    System.out.println(doubleValue);
  }
}












