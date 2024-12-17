public class TryCatchFinallyEx {

  public static void main(String[] args) {

//    String 타입 변수 2개 선언
    String data1 = null;
    String data2 = null;

    try {
//      실행 시 매개변수로 값을 2개 받아옴
//      없으면 오류 발생
      data1 = args[0];
      data2 = args[1];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("실행 매개값의 수가 부족합니다.");
      System.out.println("[실행방법]");
      System.out.println("java TryCatchFinallyEx  num1  num2");
      return;
    }

    try {
//      오류 발생이 가능한 소스코드
      int value1 = Integer.parseInt(data1);
      int value2 = Integer.parseInt(data2);
      int result = value1 + value2;
      System.out.println(data1 + " + " + data2 + " = " + result);
    }
    catch (NumberFormatException e) {
//      예외처리 코드
      System.out.println("숫자로 변환할 수 없습니다.");
    }
//    예외가 발생하거나 발생하지 않거나 무조건 실행하는 코드
    finally {
      System.out.println("다시 실행하세요");
    }

    System.out.println("\n----- 프로그램 종료 -----");
  }
}












