public class TryWithResourceEx {

  public static void main(String[] args) {

//    기존 방식의 예외처리 후 리소스 닫기
//    try 코드 블럭 밖에서 해당 객체를 사용하기 위해서 try ~ catch 문 밖에 변수를 선언하여 사용
    FileInputStream fis1 = null;
    
    try {
//      외부 리소스용 객체 생성
      fis1 = new FileInputStream("test1.txt");
      fis1.read();
      throw new Exception();
    }
    catch (Exception e) {
      System.out.println("예외 처리");
    }
    finally {
//      외부 리소스 닫기
      try {
        fis1.close();
      } catch (Exception e) { }
    }

    System.out.println();

//    try with resource 방식으로 사용한 예외처리
    try (FileInputStream fis2 = new FileInputStream("test2.txt")) {
      fis2.read();
//      강제 예외 발생
      throw new Exception();
    }
    catch (Exception e) {
      System.out.println("예외 처리 코드가 실행되었습니다.");
    }
  }
}












