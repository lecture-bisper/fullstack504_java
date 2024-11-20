public class ScopeEx {
//  프로그램 시작
  public static void main(String[] args) {
//    변수 선언과 동시에 데이터 저장
//    main 메소드 전체에서 다 사용 가능
    int var1 = 1;
//    변수 var1 에 저장한 데이터 출력
    System.out.println("변수 var1 = " + var1);

//    if 문 사용, if 문에는 중괄호가 있음
    if (true) {
//      변수 var2 선언, if문 안에서 선언
      int var2;

      var1 = 10; // 변수 var1에 데이터 저장
      var2 = 20; // 변수 var2에 데이터 저장
//      저장한 데이터 출력
      System.out.println("if문 안에서 변수 var1 = " + var1);
      System.out.println("if문 안에서 변수 var2 = " + var2);
    }

//    if문 밖으로 나와서 변수 var1 에 데이터 저장
    var1 = 100;
//    if문 밖으로 나와서 if문 안에서 선언한 변수 var2에 데이터 저장
//    if문 안에서 선언한 변수는 if문의 코드블럭을 벗어나면 메모리에서 삭제 됨
//    var2 = 200;
//    if문 밖에서 변수 var1을 사용
    System.out.println("if문 밖에서 변수 var1 = " + var1);
//    if문 밖에서 변수 var2를 사용, 오류 발생, 이미 메모리에서 삭제되어 존재하지 않는 변수를 사용
//    System.out.println("if문 밖에서 변수 var2 = " + var2);

//    for문 선언, 코드 블럭이 존재함
    for (int i = 0; i < 1; i++) {
//      for문 안에서 변수 선언
      int var3;

//      for문 안에서 변수 var1에 데이터 저장
      var1 = 1000;
//      for문 안에서 변수 var3에 데이터 저장
      var3 = 3000;
//      for문 안에서 변수 var1에 저장된 데이터 출력
      System.out.println("for문 안에서 변수 var1 = " + var1);
//      for문 안에서 변수 var3에 저장된 데이터 출력
      System.out.println("for문 안에서 변수 var3 = " + var3);
    }

//    for문 밖에서 변수 var1에 데이터 저장
    var1 = 10000;
//    for문 밖에서 변수 var3에 데이터 저장, 오류 발생, for문이 실행완료되어 메모리 상에서 삭제됨, 존재하지 않는 변수를 사용
//    var3 = 30000;
//    변수 var1에 저장된 내용 출력
    System.out.println("for문 밖에서 변수 var1 = " + var1);
//    System.out.println("for문 밖에서 변수 var3 = " + var3);
  }
}












