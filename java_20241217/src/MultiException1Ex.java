import java.util.Scanner;

public class MultiException1Ex {

  public static void main(String[] args) {
//    키보드 입력
    Scanner sc = new Scanner(System.in);

    System.out.print("입력할 데이터를 개수를 입력하세요 >> ");
    int count = sc.nextInt();

//    실제로 데이터 입력받음
    System.out.print("\n숫자를 입력해주세요 >> ");
    String datas[] = new String[count];

    try {
//      문자열로 데이터를 입력받음
      datas[0] = sc.next();
      datas[1] = sc.next();

//      문자열을 숫자 타입으로 변환
      int value1 = Integer.parseInt(datas[0]);
      int value2 = Integer.parseInt(datas[1]);

//      연산
      int result = value1 / value2;
      System.out.println(value1 + " / " + value2 + " = " + result);
    }
//    Exception 은 모든 예외처리 클래스의 최상위 클래스이기 때문에 모든 예외를 처리할 수 있음
//    Exception 은 가장 마지막에 입력해야 함
//    catch (Exception e) {
//        System.out.println("오류가 발생했습니다.");
//        System.out.println(e.getMessage());
//    }
//    배열의 크기를 벗어나서 사용 시 오류
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("실행 매개값의 수가 부족합니다.");
    }
//    숫자가 아닌 것을 숫자로 변환 시 오류
    catch (NumberFormatException e) {
      System.out.println("데이터를 숫자로 변경할 수 없습니다.");
    }
//    위쪽에 개발자가 지정한 예외처리를 제외한 모든 예외를 처리함
    catch (Exception e) {
      System.out.println("오류가 발생했습니다.");
      System.out.println(e.getMessage());
    }
//    오류가 발생하든 아니든 무조건 실행
    finally {
      System.out.println("다시 실행하세요");
      sc.close(); // 외부 리소스 해제
    }

    System.out.println("\n----- 프로그램 종료 -----");
  }
}












