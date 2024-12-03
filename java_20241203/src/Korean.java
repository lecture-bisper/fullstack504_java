public class Korean {

  String nation = "대한민국";
  String name;
  String ssn;

//  사용자가 선언한 생성자, 매개변수로 데이터 2개 받음
//  public Korean(String inputName, String inputSsn) {
////    전달받은 데이터를 필드(멤버변수)에 저장
//    name = inputName;
//    ssn = inputSsn;
//  }

  public Korean(String name, String ssn) {
//    클래스의 필드와 매개변수의 이름이 같을 경우 클래스의 필드 앞에 this. 을 추가하여 사용
    this.name = name;
    this.ssn = ssn;
  }

//  기본 생성자를 선언
  public Korean() {
//    사용자에게 넘겨 받은 값이 아닌 기본값으로 세팅
//    필드 선언과 동시에 값을 입력하는 것과 같음
    name = "도깨비";
    ssn = "444555-6667777";
  }
}












