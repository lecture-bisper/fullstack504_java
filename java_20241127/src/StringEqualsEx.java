public class StringEqualsEx {

  public static void main(String[] args) {

    String str1 = "자바";
    String str2 = "자바";
    String str3 = new String("자바");
    String str4 = new String("자바");

    System.out.println("str1의 값 : " + str1);
    System.out.println("str2의 값 : " + str2);
    System.out.println("str3의 값 : " + str3);
    System.out.println("str4의 값 : " + str4);

    System.out.println();

    if (str1 == str2) {
      System.out.println("str1과 str2는 참조가 같음");
    }
    else {
      System.out.println("str1과 str2는 참조가 다름");
    }

    System.out.println();

    if (str2 == str3) {
      System.out.println("str2과 str3는 참조가 같음");
    }
    else {
      System.out.println("str2과 str3는 참조가 다름");
    }

    System.out.println();

    if (str3 == str4) {
      System.out.println("str3과 str4는 참조가 같음");
    }
    else {
      System.out.println("str3과 str4는 참조가 다름");
    }

    System.out.println("\n----- String 타입이 참조하고 있는 값 비교 -----");

//    equals() : String 데이터 타입의 변수가 참조하는 있는 주소에 실제로 저장된 데이터를 비교하기 위한 명령어
//    사용방법 :
//    문자열.equals(비교할문자열);

    if (str1.equals(str2)) {
      System.out.println("str1과 str2가 참조하고 있는 값이 같음");
    }
    else {
      System.out.println("str1과 str2가 참조하고 있는 값이 다름");
    }

    System.out.println();

    if (str2.equals(str3)) {
      System.out.println("str2과 str3가 참조하고 있는 값이 같음");
    }
    else {
      System.out.println("str2과 str3가 참조하고 있는 값이 다름");
    }

    System.out.println();

    if (str3.equals(str4)) {
      System.out.println("str3과 str4가 참조하고 있는 값이 같음");
    }
    else {
      System.out.println("str3과 str4가 참조하고 있는 값이 다름");
    }

    System.out.println();


  }
}












