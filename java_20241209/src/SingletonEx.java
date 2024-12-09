public class SingletonEx {

  public static void main(String[] args) {

//    Singleton 디자인 패턴으로 객체 생성
    Singleton obj1 = Singleton.getInstance();
    Singleton obj2 = Singleton.getInstance();

//    일반적인 방식으로 객체 생성
//    Singleton obj1 = new Singleton();
//    Singleton obj2 = new Singleton();

    if (obj1 == obj2) {
      System.out.println("obj1의 주소 : " + obj1);
      System.out.println("obj2의 주소 : " + obj2);
      System.out.println("같은 Singleton 객체입니다.");
    }
    else {
      System.out.println("obj1의 주소 : " + obj1);
      System.out.println("obj2의 주소 : " + obj2);
      System.out.println("다른 Singleton 객체입니다.");
    }
  }
}












