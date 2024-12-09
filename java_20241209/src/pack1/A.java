package pack1;

// 접근제한자를 default 로 사용한 클래스 A
// default 접근제한자는 동일한 패키지에 있는 클래스에서는 사용가능, 다른 패키지에서는 사용 불가
class A {
//  default 접근제한자를 사용한 필드
  String str1;
//  public 접근제한자를 사용한 필드
  public String str2;
//  private 접근제한자를 사용한 필드
  private String str3;

//  default 접근제한자를 사용한 생성자
  A() {
    str1 = "default 접근제한자 필드";
    str2 = "public 접근제한자 필드";
    str3 = "private 접근제한자 필드";
  }

//  public 접근제한자를 사용한 생성자
  public A(String str1, String str2, String str3) {
    this.str1 = str1;
    this.str2 = str2;
    this.str3 = str3;
  }

//  private 접근제한자를 사용한 생성자
  private A(String str1, String str2) {
    this.str1 = str1;
    this.str2 = str2;
    this.str3 = "private 접근제한자 필드";
  }

//  default 접근제한자를 사용한 메소드
  void print1() {
    System.out.println("default 접근제한자 메소드");
  }

//  public 접근제한자를 사용한 메소드
  public void print2() {
    System.out.println("public 접근제한자 메소드");
  }

//  private 접근제한자를 사용한 메소드
  private void print3() {
    System.out.println("private 접근제한자 메소드");
  }

//  private 접근제한자를 사용할 수 있는 같은 클래스의 멤버인 메소드를 public 접근제한자를 사용하면 외부에서 public 접근제한자를 사용한 메소드를 통해서 private 접근제한자를 사용한 멤버에 접근할 수 있음
  public void print4() {
//    클래스 내부에서는 private 접근제한자를 사용한 멤버를 제한없이 사용할 수 있음
    System.out.println("private 접근제한자 필드 : " + str3);
    print3();
  }

}












