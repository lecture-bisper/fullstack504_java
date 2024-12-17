public class TryCatchEx {

  public static void main(String[] args) throws ClassNotFoundException {

    System.out.println("----- 프로그램 시작 -----\n");

//    지정한 클래스가 존재하는지 확인
//    Class clazz = Class.forName("java.lang.String2");

    try {
      Class clazz = Class.forName("java.lang.String2");
    }
    catch(ClassNotFoundException e) {
      System.out.println("클래스가 존재하지 않습니다.");
    }

    System.out.println("\n----- 프로그램을 종료합니다. -----");
  }
}












