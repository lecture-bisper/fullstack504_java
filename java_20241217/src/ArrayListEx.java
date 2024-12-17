import java.util.List;
import java.util.ArrayList;

public class ArrayListEx {

  public static void main(String[] args) {

//    ArrayList 객체 생성, 제네릭을 사용하여 사용할 데이터를 지정
    List<String> list = new ArrayList<>();
//    ArrayList : 배열의 단점을 극복하기 위해서 만들어진 데이터 타입
//    배열과 같이 index를 사용하여 데이터를 저장 및 출력
//    배열과 달리 객체의 길이를 유동적으로 사용할 수 있음

//    사용법 (선언)
//    List<데이터타입> 리스트명 = new ArrayList<데이터타입>();
//    List<데이터타입> 리스트명 = new ArrayList<>();

//    사용법 (사용)
//    리스트명.메소드명();
    
//    빈 리스트에 데이터 추가하기
    list.add("JAVA");
    list.add("JDBC");
    list.add("Servlet/JSP");
    list.add("Database");
//    지정한 index로 데이터 추가하기
    list.add(2, "HTML5");
    list.add("CSS3");

//    현재 리스트에 저장된 데이터의 개수를 가져오기
    int size = list.size();
    System.out.println("현재 list에 저장된 데이터 수 : " + size);
    System.out.println();

//    지정한 index 에 있는 데이터 가져오기
    String skill = list.get(2);
    System.out.println("2 : " + skill);
    System.out.println();

//    반복문으로 리스트에 저장된 내용 모두 출력
    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      System.out.println(i + " : " + str);
    }

    System.out.println();

//    지정된 index에 저장된 데이터를 수정
    list.set(4, "MySql");

    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      System.out.println(i + " : " + str);
    }

    System.out.println();

//    지정된 index에 저장된 데이터를 삭제
    list.remove(2);
    list.remove(2);
//    지정된 데이터를 기준으로 검색하여 삭제
    list.remove("CSS3");

    for (int i = 0; i < list.size(); i++) {
      String str = list.get(i);
      System.out.println(i + " : " + str);
    }

    list.clear();
    size = list.size();
    System.out.println("현재 리스트의 크기는 : " + size);
    System.out.println("리스트가 비었나요?? " + list.isEmpty());
  }
}












