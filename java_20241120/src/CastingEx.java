public class CastingEx {
  public static void main(String[] args) {
    int intValue = 44032;
//    char 타입의 변수에 int 타입의 변수를 저장
//    int 타입이 char 타입보다 크기가 크기 때문에 강제 타입 변환이 필요
    char charValue = (char)intValue;
    System.out.println(charValue);

    long longValue = 500;
//    int 타입의 변수에 long 타입의 변수를 저장
//    long 타입이 int 타입보다 크기가 크기 때문에 강제 타입 변환이 필요
    intValue = (int)longValue;
    System.out.println(intValue);

//    int 타입의 변수에 double 타입의 변수를 저장
//    double 타입이 int 타입보다 크기가 크기 때문에 강제 타입 변환이 필요
    double doubleValue = 3.14;
    intValue = (int)doubleValue;
    System.out.println(intValue);
  }
}












