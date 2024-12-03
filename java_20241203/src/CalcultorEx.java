public class CalcultorEx {

  public static void main(String[] args) {

//    Calculator 클래스 타입의 객체 myCalc 생성
    Calculator myCalc = new Calculator();
//    인스턴스 myCalc이 가지고 있는 멤버인 powerOn() 메소드를 호출
    myCalc.powerOn();

//    인스턴스 myCalc이 가지고 있는 멤버인 plus() 메소드를 호출
//    plus() 호출 시 매개변수로 데이터 2개를 전달하고 결과를 받아옴
    int result1 = myCalc.plus(10, 20);
    System.out.println("result1 : " + result1);

    int x = 10;
    int y = 3;
//    인스턴스 myCalc이 가지고 있는 멤버인 divide() 메소드를 호출
//    divide() 호출 시 매개변수로 데이터 2개를 전달하고 결과를 받아옴
    double result2 = myCalc.divide(x, y);
    System.out.println("result2 : " + result2);

//    인스턴스 myCalc이 가지고 있는 멤버 powerOff() 를 호출
    myCalc.powerOff();
  }
}












