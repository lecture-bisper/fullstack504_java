public class KoreanEx {

  public static void main(String[] args) {

//    Korean k1 = new Korean();
//    k1.name = "홍길동";
//    k1.ssn = "111111-2223333";
//    System.out.println("k1.name : " + k1.name);
//    System.out.println("k1.nation : " + k1.nation);
//    System.out.println("k1.ssn : " + k1.ssn);

//    Korean 클래스 타입의 변수를 선언과 동시에 객체 생성
//    매개변수를 2개 받는 생성자를 호출하여 객체 생성
    Korean k1 = new Korean("홍길동", "111111-2223333");
    System.out.println("k1.name : " + k1.name);
    System.out.println("k1.nation : " + k1.nation);
    System.out.println("k1.ssn : " + k1.ssn);

    Korean k2 = new Korean("임꺽정", "222222-3334444");
    System.out.println("k2.name : " + k2.name);
    System.out.println("k2.nation : " + k2.nation);
    System.out.println("k2.ssn : " + k2.ssn);

    Korean k3 = new Korean();
    System.out.println("k3.name : " + k3.name);
    System.out.println("k3.nation : " + k3.nation);
    System.out.println("k3.ssn : " + k3.ssn);
  }
}












