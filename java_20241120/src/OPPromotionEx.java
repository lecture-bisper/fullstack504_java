public class OPPromotionEx {
  public static void main(String[] args) {

//    byte 타입의 변수에 정수 10 저장
    byte byteValue1 = 10;
//    byte 타입의 변수에 정수 20 저장
    byte byteValue2 = 20;
//    java 에서 정수 연산 시 int 타입으로 자동 타입 변환이 발생함
//    연산된 결과를 byte 타입으로 강제 타입 변환 시 저장 가능
//    byte byteValue3 = byteValue1 + byteValue2;
//    byte byteValue3 = (byte) (byteValue1 + byteValue2);

//    byte 타입의 정수를 연산 후 int 타입의 변수에 저장
    int intValue1 = byteValue1 + byteValue2;
    System.out.println(intValue1);

//    char 타입의 변수에 문자 A 를 저장
    char charValue1 = 'A';
//    char 타입의 변수에 정수 1 저장
    char charValue2 = 1;

//    char charValue3 = charValue1 + charValue2;
//    char charValue3 = (char) (charValue1 + charValue2);
    int intValue2 = charValue1 + charValue2;
    System.out.println(intValue2);

//    int 타입의 변수에 정수 10 저장
    int intValue3 = 10;
//    int 타입의 변수에 int 타입의 변수와 정수를 연산
//    자바에서 정수끼리 연산 시 int 타입이 됨
    int intValue4 = intValue3 / 4;
    System.out.println(intValue4);

    int intValue5 = 10;
//    int intValue6 = 10 / 4.0;
//    int 타입의 변수와 실수를 연산 시 더 큰 타입인 실수 타입으로 모두 자동 타입 변환 후 연산이 실행됨, 결과값도 실수로 출력
    double doubleValue = intValue5 / 4.0;
    System.out.println(doubleValue);
  }
}












