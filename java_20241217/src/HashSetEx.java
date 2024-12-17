import java.util.*;

public class HashSetEx {

  public static void main(String[] args) {

    Set<String> set = new HashSet<String>();

//    set 타입에 데이터 저장
    set.add("JAVA");
    set.add("DB");
    set.add("HTML5");
//    이미 저장되어 있는 데이터이므로 저장 안됨
    set.add("JAVA");
    set.add("CSS3");
    set.add("Javascript");

//    Set 타입에 저장된 데이터의 개수를 출력
    int size = set.size();
    System.out.println("Set 타입에 저장된 수 : " + size);

//    set 타입의 데이터를 반복 가능한 객체인 Iterator 타입으로 변환
    Iterator<String> iter = set.iterator();
//    hasNext() : Iterator 에서 제공하는 메소드, 다음 데이터가 있는지 없는지 확인
//    next() : Iterator 에서 제공하는 메소드, 실제로 다음번 데이터를 가져옴
    while (iter.hasNext()) {
      String item = iter.next();
      System.out.println("\t" + item);
    }

//    set 에서 데이터 삭제, index가 없으므로 데이터로 직접 삭제
    set.remove("HTML5");
    set.remove("JAVA");

    System.out.println("set에 저장된 총 개수 : " + set.size());

//    향상된 for 문을 통해서 set에 저장된 데이터를 하나씩 출력
    for (String item : set) {
      System.out.println("\t" + item);
    }

//    set에 저장된 모든 데이터 삭제
    set.clear();
    System.out.println("set에 저장된 총 개수 : " + set.size());
//    현재 set이 비었는지 확인
    System.out.println("set 이 비었나요?? " + set.isEmpty());
  }
}












