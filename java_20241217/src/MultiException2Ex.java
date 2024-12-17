import java.util.Scanner;

public class MultiException2Ex {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("입력할 데이터의 수를 입력하세요 >> ");
      int size = sc.nextInt();

      System.out.print("\n숫자를 입력하세요 >> ");
      String datas[] = new String[size];

      try {
        datas[0] = sc.next();
        datas[1] = sc.next();

        int value1 = Integer.parseInt(datas[0]);
        int value2 = Integer.parseInt(datas[1]);
        int result = value1 / value2;
        System.out.println(value1 + " / " + value2 + " = " + result);
      }
      catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
        System.out.println("실행 매개값의 수가 다르거나, 입력된 값이 없습니다..");
        System.out.println(e.getMessage());
      }
      catch (ArithmeticException | NumberFormatException e) {
        System.out.println("숫자로 변환할 수 없거나, 0으로 나눌 수 없습니다.");
        System.out.println(e.getMessage());
      }
      catch (Exception e) {
        System.out.println("알 수 없는 오류가 발생했습니다.");
        System.out.println(e.getMessage());
      }
      finally {
        sc.close();
        System.out.println("다시 실행하세요");
      }
    }
}












