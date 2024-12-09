public class PersonEx {

  public static void main(String[] args) {

//    클래스 Person 타입의 객체 생성
    Person p1 = new Person("123456-1234567", "이순신");

//    인스턴스 멤버이기 때문에 객체명.멤버명 으로 사용 가능
    System.out.println(p1.nation);
    System.out.println(p1.ssn);
    System.out.println(p1.name);

//    final 필드이므로 수정이 불가능함
//    p1.nation = "USA";
//    p1.ssn = "987654-1234567";
    p1.name = "율곡이이";
  }
}












