public class LongEx {
  public static void main(String[] args) {
//    long 타입은 int 타입보다 더 큰 숫자를 저장할 수 있는 데이터 타입
//    long 타입의 정수 리터럴에는 값 뒤에 반드시 L, l 을 입력해야 함
    long var1 = 10; // long 타입의 변수에 int 타입의 정수 10 저장
    long var2 = 10L; // long 타입의 변수에 long 타입의 정수 10 저장

//    long 타입의 변수에 int 타입의 정수 10000000000 을 저장
//    자바의 정수 기본 타입은 int 타입이고, int 타입은 최대 -21억 ~ +21억까지 저장할 수 있는데 100억의 숫자를 int 타입으로 표현하고 있으므로 오류가 발생
//    long var3 = 10000000000;
//    long 타입의 변수에 long 타입의 정수 10000000000 을 저장
    long var4 = 10000000000L;

    System.out.println(var1);
    System.out.println(var2);
    System.out.println(var4);
  }
}












