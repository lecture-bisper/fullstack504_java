
// 모든 데이터를 입력받을 수 있는 클래스
public class Box1 {

//  필드로 Object 타입을 사용, Object 클래스는 자바의 최상위 클래스이므로 모든 데이터 타입을 저장할 수 있음
//  다시 데이터를 꺼낼려면 강제 타입 변환이 필수
  private Object obj;

  public Object getObj() {
    return obj;
  }

  public void setObj(Object obj) {
    this.obj = obj;
  }
}












