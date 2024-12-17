public class NumberExceptionEx {

  public static void main(String[] args) {

//    문자열이긴 하지만 숫자로만 만들어진 문자열
    String data1 = "100";
//    숫자와 문자가 합쳐진 문자열
    String data2 = "a100";

//    숫자 타입으로 변환이 가능
    int value1 = Integer.parseInt(data1);
//    숫자와 문자가 합쳐진 문자열이라서 숫자 타입으로 변환이 불가능
    int value2 = Integer.parseInt(data2);

    int result = value1 + value2;
    System.out.println(data1 + " + " + data2 + " = " + result);
  }
}












