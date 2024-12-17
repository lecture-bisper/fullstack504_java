import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

  public static void main(String[] args) {

//    빈 HashMap 타입 객체 생성
//    key의 데이터 타입은 String, value의 데이터 타입은 Integer
    Map<String, Integer> map = new HashMap<>();

//    map에 데이터 추가
    map.put("아이유", 90);
    map.put("유인나", 85);
    map.put("나형석", 70);
    map.put("유재석", 80);
    map.put("정우성", 80);

//    map 저장된 개수 출력
    System.out.println("map 저장된 수 : " + map.size());

//    map 저장된 데이터를 key를 기준으로 출력
    System.out.println("유재석의 점수 : " + map.get("유재석"));
    System.out.println();

//    entrySet() : Map 에 저장되어 있는 Map.Entry 타입의 데이터를 Map.Entry 타입형태로 모두 출력, Set 타입으로 출력
    Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

    Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
    while (iterator.hasNext()) {
      Map.Entry<String, Integer> entry = iterator.next();
      String key = entry.getKey();
      Integer value = entry.getValue();
      System.out.println("\t" + key + " : " + value);
    }
    System.out.println();

//    map에 저장된 데이터 중 지정한 키를 검색하여 삭제
    map.remove("나형석");
    System.out.println("map 에 저장된 수 : " + map.size());

//    keySet() : map에 저장된 내용 중 key만 모두 모아서 Set 타입으로 출력
    Set<String> keySet = map.keySet();
//    출력된 Set 타입의 데이터를 반복 실행할 수 있는 Iterator 타입으로 변환
    Iterator<String> iter = keySet.iterator();
    while (iter.hasNext()) {
//      Iterator 에서 데이터를 하나 출력하여 String 타입 변수 key에 저장
      String key = iter.next();
//      get() 을 이용하여 출력한 key 기준으로 데이터 출력
      Integer value = map.get(key);
      System.out.println("\t" + key + " : " + value);
    }
    System.out.println();

//    map에 저장된 모든 내용 삭제
    map.clear();
    System.out.println("map 에 저장된 수 : " + map.size());
  }
}












