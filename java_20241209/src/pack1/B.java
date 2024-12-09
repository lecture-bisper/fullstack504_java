package pack1;

// 접근제한자 public을 사용한 클래스 B
// public 접근제한자는 제한 없이 모든 패키지에서 사용 가능
public class B {

//  A 클래스 타입의 변수 a 를 선언
//  A 클래스는 default 접근제한자를 사용하지만 B 클래스와 같은 패키지에 있기 때문에 B 클래스가 A 클래스를 사용할 수 있음
  A a;

  String str1 = "default 필드";
  public String str2 = "public 필드";

  B() {
    str1 = "default 생성자를 사용한 str1";
    str2 = "default 생성자를 사용한 str2";
  }

  public B(String str1, String str2) {
    this.str1 = str1;
    this.str2 = str2;
  }

  void print1() {
    System.out.println("default 메소드");
  }

  public void print2() {
    System.out.println("pulbic 메소드");
  }


  public static void main(String[] args) {
//    default 접근제한자를 사용한 생성자로 객체 생성
    A defaultA = new A();
//    public 접근제한자를 사용한 생성자로 객체 생성
    A publicA = new A("default", "public", "private");
//    private 접근제한자를 사용한 생성자로 외부에서 사용 불가
//    생성자를 호출할 수 없어서 객체 생성 불가
//    A privateA = new A("default", "public");


//    default 접근제한자를 사용한 필드는 같은 패키지에서는 외부에서 사용 가능
    System.out.println("default 방식 필드 : " + defaultA.str1);
//    public 접근제한자를 사용한 필드는 제한없이 사용
    System.out.println("public 방식 필드 : " + defaultA.str2);
//    private 접근제한자를 사용한 필드는 외부에서 접근 불가
//    System.out.println("private 방식 필드 : " + defaultA.str3);

//    default 접근제한자를 사용한 메소드는 같은 패키지에서는 외부에서 사용 가능
    defaultA.print1();
//    public 접근제한자를 사용한 메소드는 제한없이 사용
    defaultA.print2();
//    private 접근제한자를 사용한 메소드는 외부에서 접근 불가
//    defaultA.print3();

    defaultA.print4();
  }
}












