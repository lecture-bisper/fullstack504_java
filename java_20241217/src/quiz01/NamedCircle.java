package quiz01;

public class NamedCircle extends Circle {

//  상속받아서 존재해야 하는 필드, 부모 클래스에서 private 접근제한자를 사용하여 상속 안해줌
//  private int radius;
//  NamedCircle 클래스 전용 필드
  private String name;


  public NamedCircle(int x, String name) {
//    부모 생성자 호출
    super(x);
    this.name = name;
  }

  public void show() {
//    부모 클래스의 필드인 radius 를 직접 접근할 수 없으므로 getter 인 getRadius()를 통해서 radius의 데이터를 가져옴
    System.out.println(name + ", 반지름 = " + getRadius());
  }
}












