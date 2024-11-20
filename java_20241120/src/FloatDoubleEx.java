public class FloatDoubleEx {
  public static void main(String[] args) {

//    실수는 소수점 아래의 데이터를 저장할 수 있는 데이터 타입
//    실수의 기본 데이터 타입은 double
//    자바에서 실수 타입은 큰 데이터를 저장하는 타입이 아니고 정확도를 표현하는 데이터 타입
    double var1 = 3.14; // double 타입의 변수에 double 타입의 값 저장

//    float 타입은 기본 타입이 아니므로 값 뒤에 F를 반드시 붙여야 함
//    float var2 = 3.14; // float 타입의 변수에 double 타입의 값 저장
    float var3 = 3.14F; // float 타입의 변수에 float 타입의 값 저장

//    저장된 데이터의 정확도 차이
    double var4 = 0.12345678901234567890;
    float var5 = 0.12345678901234567890F;

    System.out.println("var1 = " + var1);
    System.out.println("var3 = " + var3);
    System.out.println("var4 = " + var4);
    System.out.println("var5 = " + var5);

//    지수 표현식
    int var6 = 3000000;
    double var7 = 3e6;
    float var8 = 3e6F;
    double var9 = 2e-3;

    System.out.println("var6 = " + var6);
    System.out.println("var7 = " + var7);
    System.out.println("var8 = " + var8);
    System.out.println("var9 = " + var9);
  }
}












