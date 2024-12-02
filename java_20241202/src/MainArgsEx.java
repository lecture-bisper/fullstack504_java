public class MainArgsEx {
  public static void main(String[] args) {

//    실행 시 옵션으로 입력받은 문자열 타입의 배열의 크기가 2인지 확인
    if (args.length != 2) {
//      배열의 길이가 2가 아닐 경우 실행
      System.out.println("프로그램의 사용방법");
      System.out.println("java MainArgsEx num1 num2");
//      프로그램 종료
      System.exit(0);
    }

//    문자열 타입 배열의 0번 인덱스에서 데이터 가져오기
    String strNum1 = args[0];
//    문자열 타입 배열의 1번 인덱스에서 데이터 가져오기
    String strNum2 = args[1];

//    문자열 타입의 데이터를 정수로 변환
    int num1 = Integer.parseInt(strNum1);
    int num2 = Integer.parseInt(strNum2);

    int result = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + result);
  }
}












