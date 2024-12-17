public class ThrowsEx {

//  throws 를 사용하여 현재 메소드에서 직접 예외처리를 하지 않고 현재 메소드를 호출한 위치로 처리해야할 예외를 떠 넘김
  public static void findClass() throws ClassNotFoundException {

//    throws 를 사용하지 않아서 메소드 내에서 직접 예외처리
//    try {
//      Class clazz = Class.forName("java.lang.String2");
//    }
//    catch (ClassNotFoundException e) {
//      System.out.println("해당 클래스가 존재하지 않습니다.");
//    }

    Class clazz = Class.forName("java.lang.String2");
  }

  public static void main(String[] args) {

// 예외가 발생하는 메소드를 호출한 곳에서 예외처리를 대신 해야 함
    try {
      findClass();
    }
    catch (ClassNotFoundException e) {
      System.out.println("지정한 클래스를 찾을 수 없습니다.");
    }

  }
}












