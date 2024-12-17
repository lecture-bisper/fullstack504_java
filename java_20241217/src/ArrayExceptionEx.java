public class ArrayExceptionEx {

  public static void main(String[] args) {

    int arrNum1[] = {10, 20, 30, 40, 50};

    System.out.println("배열 arrNum1[0] : " + arrNum1[0]);
    System.out.println("배열 arrNum1[2] : " + arrNum1[2]);
    System.out.println("배열 arrNum1[4] : " + arrNum1[4]);
//    배열의 최대 길이를 벗어난 index를 사용하려고 하여 오류 발생
    System.out.println("배열 arrNum1[6] : " + arrNum1[6]);
  }
}












