package quiz04;

public class StringStack implements StackInterface {

  private int index = 0; // 저장할 데이터의 위치
  private String[] stack; // 스택 구조를 배열로 생성

  public StringStack(int size) {
    stack = new String[size];
  }

//  스택(배열)에 저장된 데이터의 개수 출력,
  @Override
  public int length() {
    return index;
  }

//  스택(배열)에서 데이터 출력
  @Override
  public String pop() {
    if (index == 0) {
      return "스택이 비었습니다.";
    }

    index--;
    return stack[index];
  }

//  스택에 데이터 저장
  @Override
  public boolean push(String ob) {
    if (index < stack.length) {
      stack[index] = ob;
      index++;
      return true;
    }
    return false;
  }
}












