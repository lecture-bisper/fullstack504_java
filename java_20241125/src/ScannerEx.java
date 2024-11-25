import java.util.Scanner;

public class ScannerEx {

  public static void main(String[] args) {
//    사용자의 키보드 입력을 받기 위한 객체
//    제공하는 메소드를 통해서 사용자가 입력한 키보드의 정보를 가져와서 자바에서 사용할 수 있는 데이터로 변환
//    모든 데이터 타입에 대해서 입력받는 메소드를 제공하고 있음
//    데이터 입력이 끝났을 경우 close() 를 사용해서 메모리에서 제거해야 함
//    외부 리소스를 사용 시 사용자가 직접 메모리에서 제거해야 함

//    next() : 키보드 입력을 통해서 문자열을 받아옴
//    nextLine() : 키보드 입력을 통해서 문자열을 받아옴, 줄바꿈이 추가됨
//    nextInt() : 키보드 입력을 통해서 정수를 받아옴
//    nextDouble() : 키보드 입력을 통해서 실수를 받아옴
//    close() : 사용자 입력을 받는 객체를 메모리에서 제거
    Scanner sc = new Scanner(System.in);

    System.out.print("문자를 입력하세요 : ");
    String inputStr = sc.nextLine();
    System.out.println("입력한 문자 : " + inputStr);

    System.out.print("정수를 입력하세요 : ");
    int inputInt = sc.nextInt();
    System.out.println("입력한 정수 : " + inputInt);

    System.out.print("실수를 입력하세요 : ");
    double inputDouble = sc.nextDouble();
    System.out.println("입력한 실수 : " + inputDouble);

    sc.close();
  }
}












