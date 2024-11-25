public class StringConcatEx {
  public static void main(String[] args) {

//    + : 문자열 연결 연산자, 산술 연산자 '+' 와 같은 기호 사용
//    여러개의 문자열을 하나의 긴 문자열로 연결하여 합해줌
//    문자열과 다른 데이터 타입의 연산 시 모두 문자열이 됨

//    문자열 + 실수 이기 때문에 실수를 문자열로 변환 후 연산
    String str1 = "JDK" + 17.0; // JDK17.0
//    문자열 + 문자열 이기 때문에 긴 문자열 하나로 합해줌
    String str2 = str1 + " 특징"; // JDK17.0 특징
    System.out.println(str2);

//    문자열 + 정수 + 실수 이지만 연산의 순서가 왼쪽에서 오른쪽으로 이동하면서 진행하므로 문자열 + 정수 부분이 둘다 문자열로 변환
//    합해진 문자열 + 실수 이므로 둘다 문자열로 변환 후 합해짐
//    숫자 데이터 먼저 연산하고 싶을 경우 () 사용
    String str3 = "JDK" + 10 + 7.0; // JDK107.0

//    정수 + 실수 + 문자열 이므로 연산 방향에 의해서 정수 + 실수의 연산이 먼저 발생하고 그 결과값 + 문자열 연산이 진행됨
    String str4 = 10 + 7.0 + "JDK"; // 17.0JDK
    System.out.println(str3);
    System.out.println(str4);
  }
}












