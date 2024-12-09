public class Person {

//  final 키워드를 사용하여 수정불가 필드로 지정
//  선언과 동시에 데이터를 저장
  final String nation = "Korea";
//  final 키워드를 사용하여 수정불가 필드로 지정
//  필드를 선언만 함
  final String ssn;
//  일반 필드
  String name;

//  생성자의 매개변수로 외부에서 데이터를 받아옴
  public Person(String ssn, String name) {
//    final 필드로 선언된 필드에 데이터를 처음 저장(초기화)
    this.ssn = ssn;
//    일반 필드에 데이터 저장(초기화)
    this.name = name;
  }
}












