public class BoxEx {

  public static void main(String[] args) {

    System.out.println("----- 제네릭 미사용 시 -----");

//    모든 타입의 데이터를 저장할 수 있음
    Box1 box11 = new Box1();
//    원래 입력하려던 데이터의 타입을 실수로 잘못 입력할 경우 실행전까지 오류를 확인할 수 없음
    box11.setObj(100);
    String str = (String)box11.getObj();
    System.out.println(str);

    Box1 box12 = new Box1();
    box12.setObj(100);
    int num = (int)box12.getObj();
    System.out.println(num);

    System.out.println("----- 제네릭 사용 시 -----");

//    제네릭 타입을 사용 시 모든 타입의 데이터를 저장할 수 있음
//    제네릭 타입을 사용 시 사용할 데이터 타입을 처음부터 지정하고 사용함
    Box2<String> box21 = new Box2<String>();
//    잘못된 데이터 타입을 사용하려고 할 경우 컴파일 오류가 발생함
    box21.setT("100");
    String str2 = box21.getT();
    System.out.println(str2);

//    제네릭 타입에 지정할 수 있는 데이터 타입은 기본 타입은 불가능
//    참조 타입으로 지정해야 함
//    자바에서 기본 타입에 대해서 여러 기능을 추가하기 위하여 클래스 타입을 미리 만들어 둠
//    int -> Integer, long -> Long, double -> Double, boolean -> Boolean
    Box2<Integer> box22 = new Box2<Integer>();
    box22.setT(100);
    int num2 = box22.getT();
    System.out.println(num2);
  }
}












