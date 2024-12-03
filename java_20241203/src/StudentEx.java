public class StudentEx {

  public static void main(String[] args) {
//    Student 클래스 타입의 변수를 생성과 동시에 new 키워드와 Student() 생성자를 사용하여 메모리에 객체를 생성
//    메모리에 생성된 객체가 존재하는 주소를 Student 클래스 타입의 변수 s1에 저장
    Student s1 = new Student();
    System.out.println("s1 변수가 Student 객체를 참조합니다.");

//    Student 클래스 타입의 변수 s2를 선언, 현재는 주소를 저장하고 있지 않은 null 인 상태
    Student s2;
//    new 키워드와 Student 클래스 타입의 생성자를 사용하여 메모리에 객체(인스턴스)를 생성
//    메모리에 생성된 객체(인스턴스)의 주소를 Student 클래스 타입의 변수 s2에 저장
    s2 = new Student();
    System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
  }
}












